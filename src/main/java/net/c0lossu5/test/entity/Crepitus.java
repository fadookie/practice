package net.c0lossu5.test.entity;


import net.minecraft.entity.*;


import net.minecraft.entity.ai.*;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityMob;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;

import net.minecraft.pathfinding.Path;

import net.minecraft.util.DamageSource;


import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BossInfo;
import net.minecraft.world.BossInfoServer;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;


import software.bernie.geckolib.animation.builder.AnimationBuilder;
import software.bernie.geckolib.animation.controller.AnimationController;
import software.bernie.geckolib.animation.controller.EntityAnimationController;
import software.bernie.geckolib.entity.IAnimatedEntity;
import software.bernie.geckolib.event.AnimationTestEvent;
import software.bernie.geckolib.manager.EntityAnimationManager;

import javax.annotation.Nullable;



public class Crepitus extends EntityMob implements IAnimatedEntity {
	private final BossInfoServer bossInfo = (new BossInfoServer(this.getDisplayName(), BossInfo.Color.PINK, BossInfo.Overlay.NOTCHED_6));
	private static final DataParameter<Boolean> ATTACKING = EntityDataManager.createKey(Crepitus.class, DataSerializers.BOOLEAN);
	public EntityAnimationManager animationManager = new EntityAnimationManager();
	private AnimationController controller = new EntityAnimationController(this, "walkController", 10, this::animationPredicate);


	private static final int NORMAL_ATTACK_DAMAGE = 9;

	private <E extends Crepitus & IAnimatedEntity> boolean animationPredicate(AnimationTestEvent<E> event) {
		final double currentTick = this.ticksExisted + event.getPartialTick();
		boolean walk = event.isWalking();
		if (getAttacking()) {
//			System.out.println("attack Played");
			controller.setAnimation(new AnimationBuilder().addAnimation("attack2"));
			return true;
		} else if (!isEntityAlive()) {
			this.setHealth(0.0f);
			{
//				System.out.println("death Played");
				setAttacking(false);
				controller.setAnimation(new AnimationBuilder().addAnimation("death1"));


			}
			return true;
		} else if (!isEntityAlive()) {
			this.setHealth(0.0f);
			{
				if (isInWater()) {
//					System.out.println("death Played");
					setAttacking(false);
					controller.setAnimation(new AnimationBuilder().addAnimation("swimdeath"));
				}


			}
			return true;
		} else if (isInWater()) {
			controller.setAnimation(new AnimationBuilder().addAnimation("swim"));
			return true;
		} else if (!(event.getLimbSwingAmount() > -0.6662F && event.getLimbSwingAmount() < 0.6662F)) {

			{
				controller.setAnimation(new AnimationBuilder().addAnimation("run"));
				return true;
			}
		} else if (!(walk)) {
			controller.setAnimation(new AnimationBuilder().addAnimation("idle"));
			return true;
		} else {
			controller.setAnimation(new AnimationBuilder().addAnimation("walk"));
			return true;

		}
	}

	@Override
	public EntityAnimationManager getAnimationManager() {
		return animationManager;
	}

	public Crepitus(World worldIn) {
		super(worldIn);
		registerAnimationControllers();
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(3, new HuntingAttackGoal(this, 1.8f, true));
		this.tasks.addTask(4, new EntityAIWanderAvoidWater(this, 1.0D));
		this.tasks.addTask(5, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F, 1.0F));
		this.tasks.addTask(5, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityMob.class, false));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, false));
		setSize(0.8F, 1.8F);
	}

	public void registerAnimationControllers() {
		if (world.isRemote) {
			this.getAnimationManager().addAnimationController(controller);
		}
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(7D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(40);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR_TOUGHNESS).setBaseValue(15D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(100D);
		this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(15.0D);


	}


	@Override
	public float getEyeHeight() {
		return this.height * 0.85F;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float amount) {
		if (source.getTrueSource() instanceof Crepitus) {
			return false;
		}
		return super.attackEntityFrom(source, amount);
	}

	@Override
	protected void entityInit() {
		super.entityInit();
		this.dataManager.register(ATTACKING, false);

	}


	public boolean getAttacking() {
		return getDataManager().get(ATTACKING);
	}

	public void setAttacking(boolean bool) {
		getDataManager().set(ATTACKING, bool);
	}

	@Override
	protected boolean canDespawn() {
		return false;
	}


	@Override
	public void setInWeb() {

	}

	@Override
	public void onDeathUpdate() {

		++this.deathTime;

		if (this.deathTime == 70) {
			if (!this.world.isRemote && (this.isPlayer() || this.recentlyHit > 0 && this.canDropLoot() && this.world.getGameRules().getBoolean("doMobLoot"))) {
				int i = this.getExperiencePoints(this.attackingPlayer);
				i = net.minecraftforge.event.ForgeEventFactory.getExperienceDrop(this, this.attackingPlayer, i);
				while (i > 0) {
					int j = EntityXPOrb.getXPSplit(i);
					i -= j;
					this.world.spawnEntity(new EntityXPOrb(this.world, this.posX, this.posY, this.posZ, j));
				}
			}

			this.setDead();


		}

	}



	@Override
	public void addTrackingPlayer(EntityPlayerMP player) {
		super.addTrackingPlayer(player);
		this.bossInfo.addPlayer(player);
	}

	@Override
	public void removeTrackingPlayer(EntityPlayerMP player) {
		super.removeTrackingPlayer(player);
		this.bossInfo.removePlayer(player);
	}

	@Override
	protected void updateAITasks() {
		this.bossInfo.setPercent(this.getHealth() / this.getMaxHealth());
		super.updateAITasks();
	}

	public boolean isRaged() {
		return this.getHealth() <= this.getMaxHealth() * 0.3f;
	}



	@Override
	public void onLivingUpdate() {
		super.onLivingUpdate();

	}



	class HuntingAttackGoal extends EntityAIAttackMelee {
		protected final Crepitus attacker;
		protected int attackStartTk;
		protected final float attackDurationTk = 1.5f * 20;
		private final double speedTowardsTarget;
		private final boolean longMemory;
		Path path;
		private int delayCounter;
		private double targetX;
		private double targetY;
		private double targetZ;
		private int failedPathFindingPenalty = 0;
		private boolean canPenalize = false;

		public HuntingAttackGoal(Crepitus crepitus, double speedIn, boolean useLongMemory) {
			super(crepitus, speedIn, useLongMemory);
			this.attacker = crepitus;
			this.speedTowardsTarget = speedIn;
			this.longMemory = useLongMemory;
			this.setMutexBits(3);
		}


		protected double getAttackReachSqr(EntityLivingBase attackTarget) {
			return (this.attacker.width * 2.0F * this.attacker.width * 2.0F + attackTarget.width);
		}


		public boolean shouldExecute() {
			EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();

			if (entitylivingbase == null) {
				return false;
			} else if (!entitylivingbase.isEntityAlive()) {
				return false;
			} else {
				if (canPenalize) {
					if (--this.delayCounter <= 0) {
						this.path = this.attacker.getNavigator().getPathToEntityLiving(entitylivingbase);
						this.delayCounter = 4 + this.attacker.getRNG().nextInt(7);
						return this.path != null;
					} else {
						return true;
					}
				}
				this.path = this.attacker.getNavigator().getPathToEntityLiving(entitylivingbase);

				if (this.path != null) {
					return true;
				} else {
					return this.getAttackReachSqr(entitylivingbase) >= this.attacker.getDistanceSq(entitylivingbase.posX, entitylivingbase.getEntityBoundingBox().minY, entitylivingbase.posZ);
				}
			}
		}

		/**
		 * Returns whether an in-progress EntityAIBase should continue executing
		 */
		public boolean shouldContinueExecuting() {
			EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();

			if (entitylivingbase == null) {
				return false;
			} else if (!entitylivingbase.isEntityAlive()) {
				return false;
			} else if (!this.longMemory) {
				return !this.attacker.getNavigator().noPath();
			} else if (!this.attacker.isWithinHomeDistanceFromPosition(new BlockPos(entitylivingbase))) {
				return false;
			} else {
				return !(entitylivingbase instanceof EntityPlayer) || !((EntityPlayer) entitylivingbase).isSpectator() && !((EntityPlayer) entitylivingbase).isCreative();
			}
		}

		/**
		 * Execute a one shot task or start executing a continuous task
		 */
		public void startExecuting() {
			this.attacker.getNavigator().setPath(this.path, this.speedTowardsTarget);
			this.delayCounter = 0;
		}

		/**
		 * Reset the task's internal state. Called when this task is interrupted by another one
		 */
		public void resetTask() {
			EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();

			if (entitylivingbase instanceof EntityPlayer && (((EntityPlayer) entitylivingbase).isSpectator() || ((EntityPlayer) entitylivingbase).isCreative())) {
				this.attacker.setAttackTarget(null);
			} else if (!attacker.isEntityAlive()) {
				this.attacker.setHealth(0.0f);
				{
					this.attacker.setAttackTarget(null);
				}
			}

			this.attacker.getNavigator().clearPath();
		}

		/**
		 * Keep ticking a continuous task that has already been started
		 */
		public void updateTask() {
			EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();
			this.attacker.getLookHelper().setLookPositionWithEntity(entitylivingbase, 30.0F, 30.0F);
			double d0 = this.attacker.getDistanceSq(entitylivingbase.posX, entitylivingbase.getEntityBoundingBox().minY, entitylivingbase.posZ);
			--this.delayCounter;

			if ((this.longMemory || this.attacker.getEntitySenses().canSee(entitylivingbase)) && this.delayCounter <= 0 && (this.targetX == 0.0D && this.targetY == 0.0D && this.targetZ == 0.0D || entitylivingbase.getDistanceSq(this.targetX, this.targetY, this.targetZ) >= 1.0D || this.attacker.getRNG().nextFloat() < 0.05F)) {
				this.targetX = entitylivingbase.posX;
				this.targetY = entitylivingbase.getEntityBoundingBox().minY;
				this.targetZ = entitylivingbase.posZ;
				this.delayCounter = 4 + this.attacker.getRNG().nextInt(7);

				if (this.canPenalize) {
					this.delayCounter += failedPathFindingPenalty;
					if (this.attacker.getNavigator().getPath() != null) {
						net.minecraft.pathfinding.PathPoint finalPathPoint = this.attacker.getNavigator().getPath().getFinalPathPoint();
						if (finalPathPoint != null && entitylivingbase.getDistanceSq(finalPathPoint.x, finalPathPoint.y, finalPathPoint.z) < 1)
							failedPathFindingPenalty = 0;
						else
							failedPathFindingPenalty += 10;
					} else {
						failedPathFindingPenalty += 10;
					}
				}

				if (d0 > 1024.0D) {
					this.delayCounter += 10;
				} else if (d0 > 256.0D) {
					this.delayCounter += 5;
				}

				if (!this.attacker.getNavigator().tryMoveToEntityLiving(entitylivingbase, this.speedTowardsTarget)) {
					this.delayCounter += 20;
				}
			}

			this.checkAndPerformAttack(entitylivingbase, d0);
		}

		protected void checkAndPerformAttack(EntityLivingBase enemy, double distToEnemySqr) {
			double d0 = this.getAttackReachSqr(enemy);
			System.out.println("checkAndPerformAttack attacking:" + this.attacker.getAttacking() + " d0:" +d0 + " attackStartTk:" + this.attackStartTk + " attackElapsed:" + (this.attacker.ticksExisted - this.attackStartTk));
			if (distToEnemySqr <= d0 && !this.attacker.getAttacking()) {
				this.attackStartTk = this.attacker.ticksExisted;
				System.out.println("checkAndPerformAttack set TRUE");
				this.attacker.attackEntityAsMob(enemy);
				this.attacker.setAttacking(true);
			} else if (this.attacker.getAttacking() && this.attacker.ticksExisted -  this.attackStartTk > this.attackDurationTk){
				System.out.println("checkAndPerformAttack set FALSE");
				this.attacker.setAttacking(false);
			}
		}
	}
	@Override
	public void heal(float healAmount) {
		float prevHealth = this.getHealth();
		super.heal(healAmount);
		if (prevHealth < this.getMaxHealth() * 0.3f && this.getHealth() >= this.getMaxHealth() * 0.3f) {
			this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(NORMAL_ATTACK_DAMAGE);
		}
	}
	@Nullable
	public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata) {
		return super.onInitialSpawn(difficulty, livingdata);
	}
}








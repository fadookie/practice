package net.c0lossu5.test.entity.render;


import net.c0lossu5.test.entity.Crepitus;
import net.c0lossu5.test.entity.model.CrepitusModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.pipeline.VertexBufferConsumer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;


@SideOnly(Side.CLIENT)
public class CrepitusRender extends RenderLiving<Crepitus> {
    public CrepitusRender(RenderManager rendererManager) {
        super(rendererManager, new CrepitusModel(), 0.5f);
    }


    public ResourceLocation TEXTURES_1 = new ResourceLocation("test" + ":textures/model/entity/boomer.png");
    public ResourceLocation TEXTURES_2 = new ResourceLocation("test" + ":textures/model/entity/dead.png");
    public ResourceLocation TEXTURES_3 = new ResourceLocation("test" + ":textures/model/entity/angry.png");
    public ResourceLocation TEXTURES_4 = new ResourceLocation("test" + ":textures/model/entity/screaming.png");
    public ResourceLocation TEXTURES_5 = new ResourceLocation("test" + ":textures/model/entity/attacking.png");
    public ResourceLocation TEXTURES_6 = new ResourceLocation("test" + ":textures/model/entity/attackingmid.png");
    public ResourceLocation TEXTURES_7 = new ResourceLocation("test" + ":textures/model/entity/attackingblink.png");
    public ResourceLocation TEXTURES_8 = new ResourceLocation("test" + ":textures/model/entity/swim.png");
    @Override
    public void preRenderCallback(Crepitus entitylivingbaseIn, float partialTicks) {
        GL11.glScalef(0.13F, 0.13F, 0.13F);


    }
    public void doRender(Crepitus entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);}

    @Override
    protected float getDeathMaxRotation(Crepitus entity) {
        return 0;
    }

    @Override
    protected ResourceLocation getEntityTexture(Crepitus entity) {
        if (!entity.isEntityAlive()) {
            entity.setHealth(0.0f);
            {
                return TEXTURES_2;
            }
        } else if
        (entity.isRaged())
            {
                return TEXTURES_3;
            } else if
        (entity.isInWater())
        {
            return TEXTURES_8;
        }

                    return TEXTURES_1;
            }
        }



    


// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12.2 or 1.15.2 (same format for both) for entity models animated with GeckoLib
// Paste this class into your mod and follow the documentation for GeckoLib to use animations. You can find the documentation here: https://github.com/bernie-g/geckolib
// Blockbench plugin created by Gecko
package net.c0lossu5.test.entity.model;

import net.c0lossu5.test.entity.Crepitus;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib.animation.model.AnimatedEntityModel;
import software.bernie.geckolib.animation.render.AnimatedModelRenderer;

public class CrepitusModel extends AnimatedEntityModel<Crepitus> {

    private final AnimatedModelRenderer crepi;
	private final AnimatedModelRenderer body1;
	private final AnimatedModelRenderer bone75;
	private final AnimatedModelRenderer body2;
	private final AnimatedModelRenderer bone18;
	private final AnimatedModelRenderer bone19;
	private final AnimatedModelRenderer bone22;
	private final AnimatedModelRenderer bone20;
	private final AnimatedModelRenderer bone21;
	private final AnimatedModelRenderer bone50;
	private final AnimatedModelRenderer bone23;
	private final AnimatedModelRenderer neck;
	private final AnimatedModelRenderer head;
	private final AnimatedModelRenderer bone15;
	private final AnimatedModelRenderer bone14;
	private final AnimatedModelRenderer hair;
	private final AnimatedModelRenderer bone63;
	private final AnimatedModelRenderer bone58;
	private final AnimatedModelRenderer bone59;
	private final AnimatedModelRenderer bone60;
	private final AnimatedModelRenderer bone;
	private final AnimatedModelRenderer bone54;
	private final AnimatedModelRenderer bone55;
	private final AnimatedModelRenderer bone72;
	private final AnimatedModelRenderer bone24;
	private final AnimatedModelRenderer bone39;
	private final AnimatedModelRenderer bone42;
	private final AnimatedModelRenderer bone73;
	private final AnimatedModelRenderer bone43;
	private final AnimatedModelRenderer bone44;
	private final AnimatedModelRenderer bone45;
	private final AnimatedModelRenderer bone16;
	private final AnimatedModelRenderer bone49;
	private final AnimatedModelRenderer bone53;
	private final AnimatedModelRenderer bone62;
	private final AnimatedModelRenderer bone61;
	private final AnimatedModelRenderer bone48;
	private final AnimatedModelRenderer bone47;
	private final AnimatedModelRenderer bone57;
	private final AnimatedModelRenderer bone51;
	private final AnimatedModelRenderer bone52;
	private final AnimatedModelRenderer bone46;
	private final AnimatedModelRenderer arm2;
	private final AnimatedModelRenderer upc2;
	private final AnimatedModelRenderer upperarm2;
	private final AnimatedModelRenderer lowerarm2;
	private final AnimatedModelRenderer HAND;
	private final AnimatedModelRenderer bone64;
	private final AnimatedModelRenderer arm;
	private final AnimatedModelRenderer bone17;
	private final AnimatedModelRenderer upperarm1;
	private final AnimatedModelRenderer lowerarm1;
	private final AnimatedModelRenderer hand2;
	private final AnimatedModelRenderer bone65;
	private final AnimatedModelRenderer bone69;
	private final AnimatedModelRenderer bone83;
	private final AnimatedModelRenderer bone25;
	private final AnimatedModelRenderer bone8;
	private final AnimatedModelRenderer bone26;
	private final AnimatedModelRenderer bone68;
	private final AnimatedModelRenderer bone10;
	private final AnimatedModelRenderer bone11;
	private final AnimatedModelRenderer bone12;
	private final AnimatedModelRenderer bone9;
	private final AnimatedModelRenderer bone67;
	private final AnimatedModelRenderer bone13;
	private final AnimatedModelRenderer leg;
	private final AnimatedModelRenderer buk;
	private final AnimatedModelRenderer lowwerleg;
	private final AnimatedModelRenderer bone7;
	private final AnimatedModelRenderer bone70;
	private final AnimatedModelRenderer bone29;
	private final AnimatedModelRenderer bone30;
	private final AnimatedModelRenderer foot;
	private final AnimatedModelRenderer bone31;
	private final AnimatedModelRenderer bone32;
	private final AnimatedModelRenderer toe;
	private final AnimatedModelRenderer bone37;
	private final AnimatedModelRenderer bone38;
	private final AnimatedModelRenderer bone74;
	private final AnimatedModelRenderer bone33;
	private final AnimatedModelRenderer bone36;
	private final AnimatedModelRenderer bone28;
	private final AnimatedModelRenderer bone27;
	private final AnimatedModelRenderer bone2;
	private final AnimatedModelRenderer leg2;
	private final AnimatedModelRenderer buk2;
	private final AnimatedModelRenderer bone56;
	private final AnimatedModelRenderer lowwerleg2;
	private final AnimatedModelRenderer foot2;
	private final AnimatedModelRenderer bone76;
	private final AnimatedModelRenderer bone77;
	private final AnimatedModelRenderer toe2;
	private final AnimatedModelRenderer bone79;
	private final AnimatedModelRenderer bone80;
	private final AnimatedModelRenderer bone78;
	private final AnimatedModelRenderer bone81;
	private final AnimatedModelRenderer bone82;
	private final AnimatedModelRenderer bone6;
	private final AnimatedModelRenderer bone34;
	private final AnimatedModelRenderer bone35;
	private final AnimatedModelRenderer bone71;
	private final AnimatedModelRenderer bone40;
	private final AnimatedModelRenderer bone41;
	private final AnimatedModelRenderer bone4;
	private final AnimatedModelRenderer bone3;
	private final AnimatedModelRenderer bone66;

    public CrepitusModel()
    {
        textureWidth = 512;
    textureHeight = 512;
    crepi = new AnimatedModelRenderer(this);
		crepi.setRotationPoint(0.0F, 20.0F, 0.0F);
		
		crepi.setModelRendererName("crepi");
		this.registerModelRenderer(crepi);

		body1 = new AnimatedModelRenderer(this);
		body1.setRotationPoint(1.9827F, -127.1214F, 1.9629F);
		crepi.addChild(body1);
		
		body1.setModelRendererName("body1");
		this.registerModelRenderer(body1);

		bone75 = new AnimatedModelRenderer(this);
		bone75.setRotationPoint(-1.9827F, 19.1214F, -3.9629F);
		body1.addChild(bone75);
		
		bone75.setModelRendererName("bone75");
		this.registerModelRenderer(bone75);

		body2 = new AnimatedModelRenderer(this);
		body2.setRotationPoint(1.0F, -20.0F, 5.0F);
		bone75.addChild(body2);
		setRotationAngle(body2, -0.0873F, 0.0F, 0.0F);
		
		body2.setModelRendererName("body2");
		this.registerModelRenderer(body2);

		bone18 = new AnimatedModelRenderer(this);
		bone18.setRotationPoint(-0.5F, -19.4122F, 3.4504F);
		body2.addChild(bone18);
		setRotationAngle(bone18, -0.1309F, 0.0F, 0.0F);
		
		bone18.setModelRendererName("bone18");
		this.registerModelRenderer(bone18);

		bone19 = new AnimatedModelRenderer(this);
		bone19.setRotationPoint(0.0F, 10.3695F, -92.6145F);
		bone18.addChild(bone19);
		bone19.setTextureOffset(0, 190).addBox(-14.5F, -30.4536F, 86.5684F, 29.0F, 41.0F, 13.0F, 0.0F, false);
		bone19.setModelRendererName("bone19");
		this.registerModelRenderer(bone19);

		bone22 = new AnimatedModelRenderer(this);
		bone22.setRotationPoint(0.0F, 1.5579F, 83.3156F);
		bone19.addChild(bone22);
		setRotationAngle(bone22, 0.0436F, 0.0F, 0.0F);
		
		bone22.setModelRendererName("bone22");
		this.registerModelRenderer(bone22);

		bone20 = new AnimatedModelRenderer(this);
		bone20.setRotationPoint(0.0F, -12.3474F, 0.0428F);
		bone22.addChild(bone20);
		setRotationAngle(bone20, -0.3491F, 0.0F, 0.0F);
		bone20.setTextureOffset(169, 156).addBox(-14.5F, -4.8257F, 2.2008F, 29.0F, 9.0F, 5.0F, 0.0F, false);
		bone20.setModelRendererName("bone20");
		this.registerModelRenderer(bone20);

		bone21 = new AnimatedModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone22.addChild(bone21);
		setRotationAngle(bone21, 0.1309F, 0.0F, 0.0F);
		bone21.setTextureOffset(302, 171).addBox(-14.5F, -7.6149F, 1.6135F, 29.0F, 17.0F, 5.0F, 0.0F, false);
		bone21.setModelRendererName("bone21");
		this.registerModelRenderer(bone21);

		bone50 = new AnimatedModelRenderer(this);
		bone50.setRotationPoint(-0.5F, 134.1621F, 40.7904F);
		bone18.addChild(bone50);
		setRotationAngle(bone50, 0.3316F, 0.0F, 0.0F);
		bone50.setTextureOffset(294, 384).addBox(-8.0F, -164.1744F, 5.2588F, 18.0F, 8.0F, 15.0F, 0.0F, false);
		bone50.setModelRendererName("bone50");
		this.registerModelRenderer(bone50);

		bone23 = new AnimatedModelRenderer(this);
		bone23.setRotationPoint(0.0F, -16.0235F, -6.0096F);
		bone18.addChild(bone23);
		setRotationAngle(bone23, -0.4364F, 0.0F, 0.0F);
		bone23.setTextureOffset(287, 62).addBox(-14.5F, 0.1974F, 0.3109F, 29.0F, 15.0F, 6.0F, 0.0F, false);
		bone23.setModelRendererName("bone23");
		this.registerModelRenderer(bone23);

		neck = new AnimatedModelRenderer(this);
		neck.setRotationPoint(0.0F, -40.9848F, 5.1514F);
		body2.addChild(neck);
		setRotationAngle(neck, 0.0436F, 0.0F, 0.0F);
		neck.setTextureOffset(114, 0).addBox(-5.0F, -9.5385F, -0.9364F, 10.0F, 12.0F, 8.0F, 0.0F, false);
		neck.setModelRendererName("neck");
		this.registerModelRenderer(neck);

		head = new AnimatedModelRenderer(this);
		head.setRotationPoint(-0.5F, -6.4952F, 0.2179F);
		neck.addChild(head);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
		head.setTextureOffset(0, 135).addBox(-12.5699F, -31.1584F, -11.2107F, 26.0F, 30.0F, 25.0F, 0.0F, false);
		head.setTextureOffset(264, 440).addBox(-7.5699F, -1.1584F, -11.2107F, 16.0F, 1.0F, 25.0F, 0.0F, false);
		head.setModelRendererName("head");
		this.registerModelRenderer(head);

		bone15 = new AnimatedModelRenderer(this);
		bone15.setRotationPoint(-6.5343F, -0.9715F, 1.0F);
		head.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, 0.2618F);
		bone15.setTextureOffset(286, 33).addBox(-4.6583F, -2.1477F, -12.2107F, 12.0F, 3.0F, 25.0F, 0.0F, false);
		bone15.setModelRendererName("bone15");
		this.registerModelRenderer(bone15);

		bone14 = new AnimatedModelRenderer(this);
		bone14.setRotationPoint(7.2463F, -1.5242F, 1.0F);
		head.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, -0.2618F);
		bone14.setTextureOffset(283, 222).addBox(-7.6133F, -1.6483F, -12.2107F, 12.0F, 3.0F, 25.0F, 0.0F, false);
		bone14.setModelRendererName("bone14");
		this.registerModelRenderer(bone14);

		hair = new AnimatedModelRenderer(this);
		hair.setRotationPoint(-6.5343F, -0.9715F, 1.0F);
		head.addChild(hair);
		
		hair.setModelRendererName("hair");
		this.registerModelRenderer(hair);

		bone63 = new AnimatedModelRenderer(this);
		bone63.setRotationPoint(-5.5978F, -29.3272F, 34.4081F);
		hair.addChild(bone63);
		setRotationAngle(bone63, -1.9199F, -0.0873F, 0.3927F);
		bone63.setTextureOffset(124, 421).addBox(7.2934F, 34.5473F, 2.778F, 4.0F, 0.0F, 4.0F, 0.0F, true);
		bone63.setModelRendererName("bone63");
		this.registerModelRenderer(bone63);

		bone58 = new AnimatedModelRenderer(this);
		bone58.setRotationPoint(7.0F, -27.0F, -13.0F);
		hair.addChild(bone58);
		setRotationAngle(bone58, -0.2618F, 0.0F, 0.0F);
		bone58.setTextureOffset(0, 0).addBox(-5.0356F, -0.7962F, -1.4238F, 10.0F, 15.0F, 1.0F, 0.0F, false);
		bone58.setModelRendererName("bone58");
		this.registerModelRenderer(bone58);

		bone59 = new AnimatedModelRenderer(this);
		bone59.setRotationPoint(-2.2336F, -28.4023F, -12.3874F);
		hair.addChild(bone59);
		setRotationAngle(bone59, -0.2618F, 0.3054F, 0.0F);
		bone59.setTextureOffset(0, 136).addBox(-4.4442F, 0.2885F, -0.0539F, 10.0F, 15.0F, 2.0F, 0.0F, false);
		bone59.setModelRendererName("bone59");
		this.registerModelRenderer(bone59);

		bone60 = new AnimatedModelRenderer(this);
		bone60.setRotationPoint(15.1042F, -27.1998F, -12.2906F);
		hair.addChild(bone60);
		setRotationAngle(bone60, -0.2618F, -0.3054F, 0.0F);
		bone60.setTextureOffset(100, 100).addBox(-4.3378F, -0.7972F, -0.9319F, 10.0F, 15.0F, 2.0F, 0.0F, false);
		bone60.setModelRendererName("bone60");
		this.registerModelRenderer(bone60);

		bone = new AnimatedModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(bone);
		bone.setTextureOffset(100, 100).addBox(-7.0356F, -29.1869F, -13.2107F, 28.0F, 29.0F, 27.0F, 0.0F, false);
		bone.setModelRendererName("bone");
		this.registerModelRenderer(bone);

		bone54 = new AnimatedModelRenderer(this);
		bone54.setRotationPoint(-7.5356F, -14.1568F, 0.0F);
		bone.addChild(bone54);
		setRotationAngle(bone54, 0.0F, 0.0F, 0.0873F);
		bone54.setTextureOffset(345, 435).addBox(-0.1198F, -15.0397F, -13.2107F, 3.0F, 29.0F, 27.0F, 0.0F, false);
		bone54.setModelRendererName("bone54");
		this.registerModelRenderer(bone54);

		bone55 = new AnimatedModelRenderer(this);
		bone55.setRotationPoint(21.6042F, -14.1568F, 0.0F);
		bone.addChild(bone55);
		setRotationAngle(bone55, 0.0F, 0.0F, -0.0873F);
		bone55.setTextureOffset(435, 420).addBox(-2.8802F, -15.0397F, -13.2107F, 3.0F, 29.0F, 27.0F, 0.0F, true);
		bone55.setModelRendererName("bone55");
		this.registerModelRenderer(bone55);

		bone72 = new AnimatedModelRenderer(this);
		bone72.setRotationPoint(-7.0F, 0.0F, -14.0F);
		hair.addChild(bone72);
		bone72.setTextureOffset(205, 178).addBox(-1.8875F, -0.1298F, 3.7865F, 0.0F, 3.0F, 3.0F, 0.0F, true);
		bone72.setModelRendererName("bone72");
		this.registerModelRenderer(bone72);

		bone24 = new AnimatedModelRenderer(this);
		bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone72.addChild(bone24);
		bone24.setTextureOffset(146, 217).addBox(-1.8875F, -0.2607F, 0.7893F, 5.0F, 9.0F, 3.0F, 0.0F, false);
		bone24.setModelRendererName("bone24");
		this.registerModelRenderer(bone24);

		bone39 = new AnimatedModelRenderer(this);
		bone39.setRotationPoint(0.0F, 8.0F, 1.0F);
		bone24.addChild(bone39);
		setRotationAngle(bone39, -0.2182F, 0.0F, 0.0F);
		bone39.setTextureOffset(10, 41).addBox(-1.8875F, 0.7386F, -0.2048F, 5.0F, 7.0F, 0.0F, 0.0F, false);
		bone39.setModelRendererName("bone39");
		this.registerModelRenderer(bone39);

		bone42 = new AnimatedModelRenderer(this);
		bone42.setRotationPoint(0.0F, 7.0F, 0.0F);
		bone39.addChild(bone42);
		setRotationAngle(bone42, -0.2618F, 0.0F, 0.0F);
		bone42.setTextureOffset(0, 41).addBox(-1.8875F, 0.8032F, 0.0471F, 5.0F, 7.0F, 0.0F, 0.0F, false);
		bone42.setModelRendererName("bone42");
		this.registerModelRenderer(bone42);

		bone73 = new AnimatedModelRenderer(this);
		bone73.setRotationPoint(21.0F, 0.0F, -13.0F);
		hair.addChild(bone73);
		bone73.setTextureOffset(205, 178).addBox(1.9561F, -0.1298F, 2.7865F, 0.0F, 3.0F, 3.0F, 0.0F, false);
		bone73.setModelRendererName("bone73");
		this.registerModelRenderer(bone73);

		bone43 = new AnimatedModelRenderer(this);
		bone43.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone73.addChild(bone43);
		bone43.setTextureOffset(199, 176).addBox(-3.0439F, -0.2607F, -0.2107F, 5.0F, 9.0F, 3.0F, 0.0F, false);
		bone43.setModelRendererName("bone43");
		this.registerModelRenderer(bone43);

		bone44 = new AnimatedModelRenderer(this);
		bone44.setRotationPoint(1.0F, 8.0F, 0.0F);
		bone43.addChild(bone44);
		setRotationAngle(bone44, -0.1745F, 0.0F, 0.0F);
		bone44.setTextureOffset(10, 34).addBox(-4.0439F, 0.7404F, -0.2235F, 5.0F, 7.0F, 0.0F, 0.0F, false);
		bone44.setModelRendererName("bone44");
		this.registerModelRenderer(bone44);

		bone45 = new AnimatedModelRenderer(this);
		bone45.setRotationPoint(-1.0F, 7.0F, 0.0F);
		bone44.addChild(bone45);
		setRotationAngle(bone45, -0.2618F, 0.0F, 0.0F);
		bone45.setTextureOffset(0, 34).addBox(-3.0439F, 0.8097F, 0.0295F, 5.0F, 7.0F, 0.0F, 0.0F, false);
		bone45.setModelRendererName("bone45");
		this.registerModelRenderer(bone45);

		bone16 = new AnimatedModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		hair.addChild(bone16);
		bone16.setTextureOffset(283, 147).addBox(-4.0356F, -31.1869F, -11.2107F, 22.0F, 1.0F, 23.0F, 0.0F, false);
		bone16.setModelRendererName("bone16");
		this.registerModelRenderer(bone16);

		bone49 = new AnimatedModelRenderer(this);
		bone49.setRotationPoint(13.4644F, -24.0951F, -13.6856F);
		hair.addChild(bone49);
		setRotationAngle(bone49, -0.0436F, 0.0F, 0.0F);
		
		bone49.setModelRendererName("bone49");
		this.registerModelRenderer(bone49);

		bone53 = new AnimatedModelRenderer(this);
		bone53.setRotationPoint(-7.0356F, -26.152F, 15.2181F);
		hair.addChild(bone53);
		setRotationAngle(bone53, 0.7418F, 0.0F, 2.0944F);
		bone53.setTextureOffset(102, 156).addBox(-8.4967F, 5.9511F, -7.4301F, 22.0F, 31.0F, 23.0F, 0.0F, false);
		bone53.setTextureOffset(124, 421).addBox(-0.7663F, 26.1556F, 16.1805F, 3.0F, 0.0F, 4.0F, 0.0F, false);
		bone53.setTextureOffset(124, 421).addBox(6.2005F, 10.304F, 15.0904F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		bone53.setTextureOffset(298, 0).addBox(-8.4967F, -1.0489F, -7.4301F, 17.0F, 7.0F, 20.0F, 0.0F, false);
		bone53.setModelRendererName("bone53");
		this.registerModelRenderer(bone53);

		bone62 = new AnimatedModelRenderer(this);
		bone62.setRotationPoint(8.4378F, 28.5285F, -11.2218F);
		bone53.addChild(bone62);
		setRotationAngle(bone62, 0.0F, 0.0F, 0.2182F);
		bone62.setTextureOffset(113, 166).addBox(-20.4518F, -1.2021F, 23.4332F, 4.0F, 4.0F, 0.0F, 0.0F, false);
		bone62.setModelRendererName("bone62");
		this.registerModelRenderer(bone62);

		bone61 = new AnimatedModelRenderer(this);
		bone61.setRotationPoint(8.4378F, 28.5285F, -11.2218F);
		bone53.addChild(bone61);
		setRotationAngle(bone61, 0.6109F, 0.0873F, 0.0F);
		bone61.setTextureOffset(124, 421).addBox(-9.4337F, 1.8096F, -0.1604F, 4.0F, 0.0F, 4.0F, 0.0F, false);
		bone61.setModelRendererName("bone61");
		this.registerModelRenderer(bone61);

		bone48 = new AnimatedModelRenderer(this);
		bone48.setRotationPoint(6.0F, 30.0F, 13.0F);
		hair.addChild(bone48);
		
		bone48.setModelRendererName("bone48");
		this.registerModelRenderer(bone48);

		bone47 = new AnimatedModelRenderer(this);
		bone47.setRotationPoint(0.0F, 19.0F, -1.0F);
		bone48.addChild(bone47);
		
		bone47.setModelRendererName("bone47");
		this.registerModelRenderer(bone47);

		bone57 = new AnimatedModelRenderer(this);
		bone57.setRotationPoint(22.1042F, -23.1084F, 20.2171F);
		hair.addChild(bone57);
		setRotationAngle(bone57, 0.7418F, 0.0F, -2.0944F);
		bone57.setTextureOffset(102, 156).addBox(-10.4052F, 3.7162F, -10.8075F, 22.0F, 31.0F, 23.0F, 0.0F, true);
		bone57.setTextureOffset(298, 0).addBox(-5.4052F, -3.2838F, -10.8075F, 17.0F, 7.0F, 20.0F, 0.0F, true);
		bone57.setTextureOffset(113, 166).addBox(9.6096F, 22.9657F, 9.6358F, 4.0F, 4.0F, 0.0F, 0.0F, true);
		bone57.setTextureOffset(124, 421).addBox(-0.6381F, 21.7949F, 13.6049F, 3.0F, 0.0F, 4.0F, 0.0F, true);
		bone57.setTextureOffset(124, 421).addBox(-7.6049F, 5.9432F, 12.5147F, 3.0F, 0.0F, 3.0F, 0.0F, true);
		bone57.setTextureOffset(124, 421).addBox(-1.4086F, 25.9773F, -13.9578F, 4.0F, 0.0F, 4.0F, 0.0F, true);
		bone57.setModelRendererName("bone57");
		this.registerModelRenderer(bone57);

		bone51 = new AnimatedModelRenderer(this);
		bone51.setRotationPoint(-5.0356F, -15.1568F, 0.0F);
		hair.addChild(bone51);
		setRotationAngle(bone51, 0.0F, 0.0F, 0.0873F);
		
		bone51.setModelRendererName("bone51");
		this.registerModelRenderer(bone51);

		bone52 = new AnimatedModelRenderer(this);
		bone52.setRotationPoint(19.1042F, -15.1568F, 0.0F);
		hair.addChild(bone52);
		setRotationAngle(bone52, 0.0F, 0.0F, -0.0873F);
		
		bone52.setModelRendererName("bone52");
		this.registerModelRenderer(bone52);

		bone46 = new AnimatedModelRenderer(this);
		bone46.setRotationPoint(-0.5343F, -3.9715F, 14.0F);
		head.addChild(bone46);
		
		bone46.setModelRendererName("bone46");
		this.registerModelRenderer(bone46);

		arm2 = new AnimatedModelRenderer(this);
		arm2.setRotationPoint(14.0F, -36.9848F, 7.6514F);
		body2.addChild(arm2);
		setRotationAngle(arm2, 0.0873F, 0.0F, 0.0F);
		
		arm2.setModelRendererName("arm2");
		this.registerModelRenderer(arm2);

		upc2 = new AnimatedModelRenderer(this);
		upc2.setRotationPoint(17.8644F, 5.4037F, -3.1973F);
		arm2.addChild(upc2);
		setRotationAngle(upc2, 0.0F, 0.0F, -1.0908F);
		
		upc2.setModelRendererName("upc2");
		this.registerModelRenderer(upc2);

		upperarm2 = new AnimatedModelRenderer(this);
		upperarm2.setRotationPoint(3.8644F, 0.4037F, -1.1973F);
		arm2.addChild(upperarm2);
		setRotationAngle(upperarm2, 0.0F, 0.0F, -0.1745F);
		upperarm2.setTextureOffset(180, 316).addBox(-3.4469F, -3.6191F, -5.0994F, 9.0F, 42.0F, 11.0F, 0.0F, false);
		upperarm2.setModelRendererName("upperarm2");
		this.registerModelRenderer(upperarm2);

		lowerarm2 = new AnimatedModelRenderer(this);
		lowerarm2.setRotationPoint(1.2414F, 37.018F, -0.9149F);
		upperarm2.addChild(lowerarm2);
		setRotationAngle(lowerarm2, -0.2618F, 0.0F, 0.0F);
		lowerarm2.setTextureOffset(0, 287).addBox(-5.0507F, -0.9206F, -4.3717F, 14.0F, 36.0F, 17.0F, 0.0F, false);
		lowerarm2.setTextureOffset(278, 108).addBox(-4.424F, 14.4458F, -5.5222F, 14.0F, 11.0F, 18.0F, 0.0F, true);
		lowerarm2.setModelRendererName("lowerarm2");
		this.registerModelRenderer(lowerarm2);

		HAND = new AnimatedModelRenderer(this);
		HAND.setRotationPoint(0.5765F, 34.5919F, 0.8304F);
		lowerarm2.addChild(HAND);
		HAND.setTextureOffset(336, 28).addBox(-5.6272F, 0.4875F, -5.2021F, 11.0F, 13.0F, 12.0F, 0.0F, true);
		HAND.setModelRendererName("HAND");
		this.registerModelRenderer(HAND);

		bone64 = new AnimatedModelRenderer(this);
		bone64.setRotationPoint(-4.1272F, 2.6694F, 0.1312F);
		HAND.addChild(bone64);
		setRotationAngle(bone64, 2.9671F, 0.0F, 0.0F);
		bone64.setTextureOffset(420, 54).addBox(-1.5F, -10.9742F, 2.7225F, 3.0F, 11.0F, 3.0F, 0.0F, true);
		bone64.setTextureOffset(444, 83).addBox(-1.5F, -12.9742F, -1.2775F, 3.0F, 2.0F, 7.0F, 0.0F, true);
		bone64.setModelRendererName("bone64");
		this.registerModelRenderer(bone64);

		arm = new AnimatedModelRenderer(this);
		arm.setRotationPoint(-15.9189F, -36.9848F, 7.6514F);
		body2.addChild(arm);
		setRotationAngle(arm, 0.0859F, -0.0151F, 0.1738F);
		arm.setTextureOffset(284, 309).addBox(-8.3292F, -3.5365F, -6.2966F, 9.0F, 42.0F, 11.0F, 0.0F, false);
		arm.setModelRendererName("arm");
		this.registerModelRenderer(arm);

		bone17 = new AnimatedModelRenderer(this);
		bone17.setRotationPoint(-16.9198F, 5.7953F, -3.1973F);
		arm.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.0F, 1.0908F);
		
		bone17.setModelRendererName("bone17");
		this.registerModelRenderer(bone17);

		upperarm1 = new AnimatedModelRenderer(this);
		upperarm1.setRotationPoint(-3.9369F, 16.5342F, -3.1973F);
		arm.addChild(upperarm1);
		
		upperarm1.setModelRendererName("upperarm1");
		this.registerModelRenderer(upperarm1);

		lowerarm1 = new AnimatedModelRenderer(this);
		lowerarm1.setRotationPoint(-0.1579F, 20.1925F, 1.8256F);
		upperarm1.addChild(lowerarm1);
		setRotationAngle(lowerarm1, -0.349F, 0.0F, 0.0F);
		lowerarm1.setTextureOffset(282, 94).addBox(-8.6985F, -0.5452F, -5.1058F, 14.0F, 36.0F, 17.0F, 0.0F, false);
		lowerarm1.setTextureOffset(278, 108).addBox(-9.6833F, 14.6282F, -6.0983F, 14.0F, 11.0F, 18.0F, 0.0F, false);
		lowerarm1.setModelRendererName("lowerarm1");
		this.registerModelRenderer(lowerarm1);

		hand2 = new AnimatedModelRenderer(this);
		hand2.setRotationPoint(-0.1948F, 36.3325F, 2.0687F);
		lowerarm1.addChild(hand2);
		hand2.setTextureOffset(335, 27).addBox(-5.5037F, -0.8777F, -7.1745F, 11.0F, 13.0F, 13.0F, 0.0F, false);
		hand2.setModelRendererName("hand2");
		this.registerModelRenderer(hand2);

		bone65 = new AnimatedModelRenderer(this);
		bone65.setRotationPoint(4.1926F, 3.7831F, -6.8196F);
		hand2.addChild(bone65);
		setRotationAngle(bone65, 2.9671F, 0.0F, 0.0F);
		bone65.setTextureOffset(420, 54).addBox(-1.5F, -7.1515F, -1.6806F, 3.0F, 11.0F, 3.0F, 0.0F, true);
		bone65.setModelRendererName("bone65");
		this.registerModelRenderer(bone65);

		bone69 = new AnimatedModelRenderer(this);
		bone69.setRotationPoint(0.0F, -6.9696F, 1.6527F);
		bone65.addChild(bone69);
		bone69.setTextureOffset(444, 83).addBox(-1.5F, -2.1819F, -7.3333F, 3.0F, 2.0F, 7.0F, 0.0F, true);
		bone69.setModelRendererName("bone69");
		this.registerModelRenderer(bone69);

		bone83 = new AnimatedModelRenderer(this);
		bone83.setRotationPoint(0.0F, -21.0F, 5.0F);
		bone75.addChild(bone83);
		bone83.setTextureOffset(0, 244).addBox(-14.0F, 1.0488F, -5.3212F, 28.0F, 30.0F, 13.0F, 0.0F, false);
		bone83.setModelRendererName("bone83");
		this.registerModelRenderer(bone83);

		bone25 = new AnimatedModelRenderer(this);
		bone25.setRotationPoint(0.4136F, 18.476F, 2.0146F);
		bone83.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, 0.1309F);
		bone25.setTextureOffset(150, 356).addBox(-16.6427F, -15.3261F, -7.3358F, 4.0F, 30.0F, 13.0F, 0.0F, false);
		bone25.setModelRendererName("bone25");
		this.registerModelRenderer(bone25);

		bone8 = new AnimatedModelRenderer(this);
		bone8.setRotationPoint(46.0F, 25.088F, 2.3688F);
		bone83.addChild(bone8);
		bone8.setTextureOffset(100, 68).addBox(-69.0428F, -4.5F, -9.5F, 46.0F, 9.0F, 19.0F, 0.0F, false);
		bone8.setModelRendererName("bone8");
		this.registerModelRenderer(bone8);

		bone26 = new AnimatedModelRenderer(this);
		bone26.setRotationPoint(12.5864F, 26.476F, 2.0146F);
		bone83.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, -0.1309F);
		bone26.setTextureOffset(74, 356).addBox(1.7119F, -24.8946F, -7.336F, 4.0F, 30.0F, 13.0F, 0.0F, false);
		bone26.setModelRendererName("bone26");
		this.registerModelRenderer(bone26);

		bone68 = new AnimatedModelRenderer(this);
		bone68.setRotationPoint(15.5864F, 26.476F, 2.0146F);
		bone83.addChild(bone68);
		setRotationAngle(bone68, 0.0F, 0.0F, -0.3054F);
		bone68.setTextureOffset(150, 356).addBox(1.6387F, -24.1432F, -7.3358F, 4.0F, 30.0F, 13.0F, 0.0F, true);
		bone68.setModelRendererName("bone68");
		this.registerModelRenderer(bone68);

		bone10 = new AnimatedModelRenderer(this);
		bone10.setRotationPoint(-20.9572F, 26.088F, 2.3688F);
		bone83.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, -1.4399F);
		bone10.setTextureOffset(0, 0).addBox(-41.5486F, -2.7008F, -12.5407F, 46.0F, 12.0F, 22.0F, 0.0F, false);
		bone10.setModelRendererName("bone10");
		this.registerModelRenderer(bone10);

		bone11 = new AnimatedModelRenderer(this);
		bone11.setRotationPoint(0.0428F, 20.088F, 10.3688F);
		bone83.addChild(bone11);
		setRotationAngle(bone11, 0.0436F, 0.0F, 0.0F);
		bone11.setTextureOffset(0, 68).addBox(-23.6804F, 5.7125F, 3.2882F, 47.0F, 64.0F, 3.0F, 0.0F, false);
		bone11.setModelRendererName("bone11");
		this.registerModelRenderer(bone11);

		bone12 = new AnimatedModelRenderer(this);
		bone12.setRotationPoint(0.0F, 12.512F, 11.4651F);
		bone11.addChild(bone12);
		setRotationAngle(bone12, 0.5672F, 0.0F, 0.0F);
		bone12.setTextureOffset(136, 58).addBox(-23.6804F, -15.5163F, -3.7128F, 47.0F, 7.0F, 3.0F, 0.0F, false);
		bone12.setModelRendererName("bone12");
		this.registerModelRenderer(bone12);

		bone9 = new AnimatedModelRenderer(this);
		bone9.setRotationPoint(22.9572F, 25.088F, 2.3688F);
		bone83.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, 1.4399F);
		bone9.setTextureOffset(0, 34).addBox(-3.721F, -0.5874F, -12.5407F, 46.0F, 12.0F, 22.0F, 0.0F, false);
		bone9.setModelRendererName("bone9");
		this.registerModelRenderer(bone9);

		bone67 = new AnimatedModelRenderer(this);
		bone67.setRotationPoint(-14.5864F, 26.476F, 2.0146F);
		bone83.addChild(bone67);
		setRotationAngle(bone67, 0.0F, 0.0F, 0.3054F);
		bone67.setTextureOffset(150, 356).addBox(-5.6387F, -24.1432F, -7.3358F, 4.0F, 30.0F, 13.0F, 0.0F, false);
		bone67.setModelRendererName("bone67");
		this.registerModelRenderer(bone67);

		bone13 = new AnimatedModelRenderer(this);
		bone13.setRotationPoint(0.0428F, 32.088F, -17.3688F);
		bone83.addChild(bone13);
		setRotationAngle(bone13, -0.3054F, 0.0F, 0.0F);
		bone13.setTextureOffset(247, 205).addBox(-24.0856F, -13.1441F, 3.4444F, 47.0F, 14.0F, 3.0F, 0.0F, false);
		bone13.setModelRendererName("bone13");
		this.registerModelRenderer(bone13);

		leg = new AnimatedModelRenderer(this);
		leg.setRotationPoint(-10.0F, 32.0F, 2.0F);
		bone83.addChild(leg);
		
		leg.setModelRendererName("leg");
		this.registerModelRenderer(leg);

		buk = new AnimatedModelRenderer(this);
		buk.setRotationPoint(-0.0923F, 1.7259F, -0.766F);
		leg.addChild(buk);
		buk.setTextureOffset(108, 323).addBox(-6.9971F, -4.2052F, -5.8745F, 12.0F, 41.0F, 9.0F, 0.0F, false);
		buk.setModelRendererName("buk");
		this.registerModelRenderer(buk);

		lowwerleg = new AnimatedModelRenderer(this);
		lowwerleg.setRotationPoint(0.0001F, 36.8605F, -3.1113F);
		buk.addChild(lowwerleg);
		lowwerleg.setTextureOffset(40, 356).addBox(-6.9972F, 0.3356F, -2.7631F, 12.0F, 44.0F, 5.0F, 0.0F, false);
		lowwerleg.setTextureOffset(417, 313).addBox(-6.9972F, 44.3356F, -2.7631F, 12.0F, 10.0F, 9.0F, 0.0F, false);
		lowwerleg.setTextureOffset(352, 0).addBox(-6.9972F, 0.1547F, -2.5743F, 12.0F, 6.0F, 11.0F, 0.0F, false);
		lowwerleg.setModelRendererName("lowwerleg");
		this.registerModelRenderer(lowwerleg);

		bone7 = new AnimatedModelRenderer(this);
		bone7.setRotationPoint(-0.8155F, 2.1395F, -22.8887F);
		lowwerleg.addChild(bone7);
		setRotationAngle(bone7, 0.0436F, 0.0F, 0.0F);
		bone7.setTextureOffset(228, 154).addBox(-8.0099F, -1.3749F, 14.0264F, 18.0F, 32.0F, 19.0F, 0.0F, false);
		bone7.setModelRendererName("bone7");
		this.registerModelRenderer(bone7);

		bone70 = new AnimatedModelRenderer(this);
		bone70.setRotationPoint(0.9901F, -2.6796F, 23.903F);
		bone7.addChild(bone70);
		setRotationAngle(bone70, -0.1745F, 0.0F, 0.0F);
		bone70.setTextureOffset(228, 154).addBox(-9.0F, -3.0F, -9.5F, 18.0F, 6.0F, 19.0F, 0.0F, false);
		bone70.setModelRendererName("bone70");
		this.registerModelRenderer(bone70);

		bone29 = new AnimatedModelRenderer(this);
		bone29.setRotationPoint(0.0F, 32.716F, 2.0156F);
		lowwerleg.addChild(bone29);
		setRotationAngle(bone29, -0.0873F, 0.0F, 0.0F);
		bone29.setTextureOffset(350, 108).addBox(-6.9972F, -22.7738F, -2.6674F, 12.0F, 35.0F, 8.0F, 0.0F, false);
		bone29.setModelRendererName("bone29");
		this.registerModelRenderer(bone29);

		bone30 = new AnimatedModelRenderer(this);
		bone30.setRotationPoint(0.0F, 24.6058F, 6.8863F);
		lowwerleg.addChild(bone30);
		setRotationAngle(bone30, 0.0873F, 0.0F, 0.0F);
		bone30.setTextureOffset(280, 0).addBox(-6.9972F, -22.8466F, -3.3516F, 12.0F, 9.0F, 7.0F, 0.0F, false);
		bone30.setModelRendererName("bone30");
		this.registerModelRenderer(bone30);

		foot = new AnimatedModelRenderer(this);
		foot.setRotationPoint(-1.8155F, 52.5821F, 1.3456F);
		lowwerleg.addChild(foot);
		foot.setTextureOffset(219, 497).addBox(-6.1817F, 3.3779F, -1.3957F, 13.0F, 6.0F, 8.0F, 0.0F, false);
		foot.setModelRendererName("foot");
		this.registerModelRenderer(foot);

		bone31 = new AnimatedModelRenderer(this);
		bone31.setRotationPoint(7.5F, 6.7032F, -6.9721F);
		foot.addChild(bone31);
		setRotationAngle(bone31, 0.2182F, 0.0F, 0.0F);
		bone31.setTextureOffset(435, 363).addBox(-13.6817F, -4.3076F, -12.0916F, 13.0F, 4.0F, 26.0F, 0.0F, false);
		bone31.setModelRendererName("bone31");
		this.registerModelRenderer(bone31);

		bone32 = new AnimatedModelRenderer(this);
		bone32.setRotationPoint(-6.9972F, -6.7453F, -13.7598F);
		bone31.addChild(bone32);
		setRotationAngle(bone32, -0.1745F, 0.0F, 0.0F);
		
		bone32.setModelRendererName("bone32");
		this.registerModelRenderer(bone32);

		toe = new AnimatedModelRenderer(this);
		toe.setRotationPoint(-0.1845F, 4.1433F, 6.6072F);
		bone32.addChild(toe);
		
		toe.setModelRendererName("toe");
		this.registerModelRenderer(toe);

		bone37 = new AnimatedModelRenderer(this);
		bone37.setRotationPoint(-1.0F, -1.0F, -3.0F);
		toe.addChild(bone37);
		setRotationAngle(bone37, 0.0F, 0.1745F, -0.0436F);
		bone37.setTextureOffset(473, 12).addBox(-5.5301F, -0.1365F, -6.2873F, 9.0F, 3.0F, 11.0F, 0.0F, false);
		bone37.setModelRendererName("bone37");
		this.registerModelRenderer(bone37);

		bone38 = new AnimatedModelRenderer(this);
		bone38.setRotationPoint(2.0F, -1.0F, -6.0F);
		toe.addChild(bone38);
		setRotationAngle(bone38, 0.0F, 0.0436F, 0.0873F);
		bone38.setTextureOffset(483, 102).addBox(1.2029F, -1.0229F, -4.6588F, 4.0F, 3.0F, 11.0F, 0.0F, false);
		bone38.setModelRendererName("bone38");
		this.registerModelRenderer(bone38);

		bone74 = new AnimatedModelRenderer(this);
		bone74.setRotationPoint(-19.4707F, 7.4059F, 12.7648F);
		bone38.addChild(bone74);
		setRotationAngle(bone74, -0.1309F, -1.5272F, 0.0436F);
		bone74.setTextureOffset(432, 161).addBox(-10.4263F, -5.7534F, -25.3159F, 6.0F, 3.0F, 13.0F, 0.0F, false);
		bone74.setModelRendererName("bone74");
		this.registerModelRenderer(bone74);

		bone33 = new AnimatedModelRenderer(this);
		bone33.setRotationPoint(-1.0028F, 4.042F, 10.9393F);
		bone32.addChild(bone33);
		setRotationAngle(bone33, 0.3491F, 0.0F, 0.0F);
		bone33.setTextureOffset(417, 224).addBox(-3.6817F, -4.4583F, -4.0079F, 11.0F, 4.0F, 22.0F, 0.0F, false);
		bone33.setModelRendererName("bone33");
		this.registerModelRenderer(bone33);

		bone36 = new AnimatedModelRenderer(this);
		bone36.setRotationPoint(-1.0028F, 3.5615F, -0.0502F);
		bone32.addChild(bone36);
		setRotationAngle(bone36, -0.5236F, 0.0F, 0.0F);
		bone36.setTextureOffset(72, 494).addBox(-5.6817F, -10.784F, 12.498F, 13.0F, 4.0F, 7.0F, 0.0F, false);
		bone36.setModelRendererName("bone36");
		this.registerModelRenderer(bone36);

		bone28 = new AnimatedModelRenderer(this);
		bone28.setRotationPoint(-0.3272F, 16.2652F, -2.5926F);
		buk.addChild(bone28);
		setRotationAngle(bone28, -0.0436F, 0.0F, 0.0F);
		bone28.setTextureOffset(238, 305).addBox(-6.6698F, -20.6191F, -2.0915F, 12.0F, 41.0F, 11.0F, 0.0F, false);
		bone28.setModelRendererName("bone28");
		this.registerModelRenderer(bone28);

		bone27 = new AnimatedModelRenderer(this);
		bone27.setRotationPoint(-11.7289F, 23.2902F, -4.041F);
		buk.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, -0.0436F);
		
		bone27.setModelRendererName("bone27");
		this.registerModelRenderer(bone27);

		bone2 = new AnimatedModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, -23.0F);
		buk.addChild(bone2);
		setRotationAngle(bone2, -0.0873F, 0.0F, 0.0F);
		bone2.setTextureOffset(226, 0).addBox(-8.8833F, -3.7209F, 14.7314F, 18.0F, 40.0F, 18.0F, 0.0F, false);
		bone2.setModelRendererName("bone2");
		this.registerModelRenderer(bone2);

		leg2 = new AnimatedModelRenderer(this);
		leg2.setRotationPoint(12.0F, 34.0F, 2.0F);
		bone83.addChild(leg2);
		
		leg2.setModelRendererName("leg2");
		this.registerModelRenderer(leg2);

		buk2 = new AnimatedModelRenderer(this);
		buk2.setRotationPoint(0.0923F, 24.7259F, -4.766F);
		leg2.addChild(buk2);
		
		buk2.setModelRendererName("buk2");
		this.registerModelRenderer(buk2);

		bone56 = new AnimatedModelRenderer(this);
		bone56.setRotationPoint(-2.0F, -25.0F, -19.0F);
		buk2.addChild(bone56);
		setRotationAngle(bone56, -0.0873F, 0.0F, 0.0F);
		bone56.setTextureOffset(210, 96).addBox(-9.1747F, -3.7209F, 14.7314F, 18.0F, 40.0F, 18.0F, 0.0F, false);
		bone56.setModelRendererName("bone56");
		this.registerModelRenderer(bone56);

		lowwerleg2 = new AnimatedModelRenderer(this);
		lowwerleg2.setRotationPoint(-2.0001F, 12.8605F, 1.8887F);
		buk2.addChild(lowwerleg2);
		lowwerleg2.setTextureOffset(417, 313).addBox(-4.0028F, 43.3356F, -4.4574F, 12.0F, 10.0F, 9.0F, 0.0F, true);
		lowwerleg2.setTextureOffset(347, 193).addBox(-4.0028F, -0.6644F, -4.4574F, 12.0F, 44.0F, 5.0F, 0.0F, false);
		lowwerleg2.setTextureOffset(211, 68).addBox(-4.0028F, -0.8453F, -4.2685F, 12.0F, 6.0F, 11.0F, 0.0F, false);
		lowwerleg2.setModelRendererName("lowwerleg2");
		this.registerModelRenderer(lowwerleg2);

		foot2 = new AnimatedModelRenderer(this);
		foot2.setRotationPoint(1.8155F, 51.5821F, 0.3456F);
		lowwerleg2.addChild(foot2);
		foot2.setTextureOffset(219, 497).addBox(-5.8183F, 3.4336F, -2.1653F, 13.0F, 6.0F, 8.0F, 0.0F, true);
		foot2.setModelRendererName("foot2");
		this.registerModelRenderer(foot2);

		bone76 = new AnimatedModelRenderer(this);
		bone76.setRotationPoint(-7.5F, 6.7032F, -6.9721F);
		foot2.addChild(bone76);
		setRotationAngle(bone76, 0.2182F, 0.0F, 0.0F);
		bone76.setTextureOffset(435, 363).addBox(1.6817F, -4.4579F, -12.7694F, 13.0F, 4.0F, 26.0F, 0.0F, true);
		bone76.setModelRendererName("bone76");
		this.registerModelRenderer(bone76);

		bone77 = new AnimatedModelRenderer(this);
		bone77.setRotationPoint(6.9972F, -6.7453F, -13.7598F);
		bone76.addChild(bone77);
		setRotationAngle(bone77, -0.1745F, 0.0F, 0.0F);
		
		bone77.setModelRendererName("bone77");
		this.registerModelRenderer(bone77);

		toe2 = new AnimatedModelRenderer(this);
		toe2.setRotationPoint(2.1845F, 3.1433F, 4.6072F);
		bone77.addChild(toe2);
		
		toe2.setModelRendererName("toe2");
		this.registerModelRenderer(toe2);

		bone79 = new AnimatedModelRenderer(this);
		bone79.setRotationPoint(-4.0F, 0.0F, 0.0F);
		toe2.addChild(bone79);
		setRotationAngle(bone79, 0.0F, -0.0436F, -0.0873F);
		bone79.setTextureOffset(483, 102).addBox(-4.2261F, -0.9499F, -9.3995F, 4.0F, 3.0F, 11.0F, 0.0F, true);
		bone79.setModelRendererName("bone79");
		this.registerModelRenderer(bone79);

		bone80 = new AnimatedModelRenderer(this);
		bone80.setRotationPoint(19.2962F, 7.4059F, 8.7686F);
		bone79.addChild(bone80);
		setRotationAngle(bone80, -0.1309F, 1.5272F, -0.0436F);
		bone80.setTextureOffset(432, 161).addBox(5.2202F, -5.7766F, -24.1959F, 6.0F, 3.0F, 13.0F, 0.0F, true);
		bone80.setModelRendererName("bone80");
		this.registerModelRenderer(bone80);

		bone78 = new AnimatedModelRenderer(this);
		bone78.setRotationPoint(1.0F, 1.0F, -2.0F);
		toe2.addChild(bone78);
		setRotationAngle(bone78, 0.0F, -0.1745F, 0.0436F);
		bone78.setTextureOffset(473, 12).addBox(-4.2634F, -1.1303F, -5.8363F, 9.0F, 3.0F, 11.0F, 0.0F, true);
		bone78.setModelRendererName("bone78");
		this.registerModelRenderer(bone78);

		bone81 = new AnimatedModelRenderer(this);
		bone81.setRotationPoint(1.0028F, 4.042F, 10.9393F);
		bone77.addChild(bone81);
		setRotationAngle(bone81, 0.3491F, 0.0F, 0.0F);
		bone81.setTextureOffset(417, 224).addBox(-6.3183F, -4.724F, -4.6493F, 11.0F, 4.0F, 22.0F, 0.0F, true);
		bone81.setModelRendererName("bone81");
		this.registerModelRenderer(bone81);

		bone82 = new AnimatedModelRenderer(this);
		bone82.setRotationPoint(1.0028F, 3.5615F, -0.0502F);
		bone77.addChild(bone82);
		setRotationAngle(bone82, -0.5236F, 0.0F, 0.0F);
		bone82.setTextureOffset(72, 494).addBox(-6.3183F, -10.3793F, 11.8411F, 13.0F, 4.0F, 7.0F, 0.0F, true);
		bone82.setModelRendererName("bone82");
		this.registerModelRenderer(bone82);

		bone6 = new AnimatedModelRenderer(this);
		bone6.setRotationPoint(0.0001F, 1.1395F, -23.8887F);
		lowwerleg2.addChild(bone6);
		setRotationAngle(bone6, 0.0436F, 0.0F, 0.0F);
		bone6.setTextureOffset(228, 232).addBox(-9.1167F, -1.3932F, 13.9921F, 18.0F, 32.0F, 19.0F, 0.0F, false);
		bone6.setModelRendererName("bone6");
		this.registerModelRenderer(bone6);

		bone34 = new AnimatedModelRenderer(this);
		bone34.setRotationPoint(2.0F, 37.716F, 1.0156F);
		lowwerleg2.addChild(bone34);
		setRotationAngle(bone34, -0.0873F, 0.0F, 0.0F);
		bone34.setTextureOffset(0, 340).addBox(-6.0028F, -28.6904F, -3.8821F, 12.0F, 35.0F, 8.0F, 0.0F, false);
		bone34.setModelRendererName("bone34");
		this.registerModelRenderer(bone34);

		bone35 = new AnimatedModelRenderer(this);
		bone35.setRotationPoint(2.0F, 29.6058F, 5.8863F);
		lowwerleg2.addChild(bone35);
		setRotationAngle(bone35, 0.0873F, 0.0F, 0.0F);
		bone35.setTextureOffset(203, 0).addBox(-6.0028F, -28.8843F, -3.5201F, 12.0F, 9.0F, 7.0F, 0.0F, false);
		bone35.setModelRendererName("bone35");
		this.registerModelRenderer(bone35);

		bone71 = new AnimatedModelRenderer(this);
		bone71.setRotationPoint(-0.1166F, -2.1675F, -0.0941F);
		lowwerleg2.addChild(bone71);
		setRotationAngle(bone71, -0.1745F, 0.0F, 0.0F);
		bone71.setTextureOffset(228, 154).addBox(-9.0F, -3.0F, -9.5F, 18.0F, 6.0F, 19.0F, 0.0F, true);
		bone71.setModelRendererName("bone71");
		this.registerModelRenderer(bone71);

		bone40 = new AnimatedModelRenderer(this);
		bone40.setRotationPoint(0.3272F, -2.7348F, 1.4074F);
		buk2.addChild(bone40);
		setRotationAngle(bone40, -0.0436F, 0.0F, 0.0F);
		
		bone40.setModelRendererName("bone40");
		this.registerModelRenderer(bone40);

		bone41 = new AnimatedModelRenderer(this);
		bone41.setRotationPoint(11.7289F, 4.2902F, -0.041F);
		buk2.addChild(bone41);
		setRotationAngle(bone41, 0.0F, 0.0F, 0.0436F);
		
		bone41.setModelRendererName("bone41");
		this.registerModelRenderer(bone41);

		bone4 = new AnimatedModelRenderer(this);
		bone4.setRotationPoint(-2.0F, -25.0F, -19.0F);
		buk2.addChild(bone4);
		setRotationAngle(bone4, -0.0436F, 0.0F, 0.0F);
		
		bone4.setModelRendererName("bone4");
		this.registerModelRenderer(bone4);

		bone3 = new AnimatedModelRenderer(this);
		bone3.setRotationPoint(1.0F, -25.0F, -19.0F);
		buk2.addChild(bone3);
		setRotationAngle(bone3, -0.0436F, 0.0F, 0.0873F);
		bone3.setTextureOffset(102, 233).addBox(-7.6949F, 1.2495F, 13.168F, 4.0F, 9.0F, 2.0F, 0.0F, false);
		bone3.setTextureOffset(84, 210).addBox(-9.0029F, -4.4233F, 14.1207F, 18.0F, 41.0F, 18.0F, 0.0F, false);
		bone3.setModelRendererName("bone3");
		this.registerModelRenderer(bone3);

		bone66 = new AnimatedModelRenderer(this);
		bone66.setRotationPoint(-0.2185F, 5.752F, 27.5166F);
		bone3.addChild(bone66);
		setRotationAngle(bone66, 0.0F, 0.0F, -0.6981F);
		bone66.setTextureOffset(102, 233).addBox(-9.5906F, 3.06F, -13.9896F, 4.0F, 9.0F, 2.0F, 0.0F, false);
		bone66.setModelRendererName("bone66");
		this.registerModelRenderer(bone66);

    this.rootBones.add(crepi);
  }


    @Override
    public ResourceLocation getAnimationFileLocation()
    {
        return new ResourceLocation("test", "animations/crepitusanimation.json");
    }
}
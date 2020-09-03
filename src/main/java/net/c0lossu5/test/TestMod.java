package net.c0lossu5.test;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import java.util.logging.LogManager;
import java.util.logging.Logger;


@Mod(modid = TestMod.ModID, name = TestMod.NAME, version = TestMod.VERSION)
public class TestMod
{
	@Mod.EventHandler
	public static void Init(FMLInitializationEvent event)
	{

	}
	@Mod.Instance
	public static TestMod instance;

	public static final String ModID = "test";
	public static final String NAME = "test";
	public static final String VERSION = "0.0.1";

	public TestMod()
	{
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Mod.EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{

	}

	@Mod.EventHandler
	public static void serverLoad(FMLServerStartingEvent event)
	{

	}
}
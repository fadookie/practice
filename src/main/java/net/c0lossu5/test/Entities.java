package net.c0lossu5.test;

import net.c0lossu5.test.entity.Crepitus;

import net.c0lossu5.test.entity.render.CrepitusRender;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3i;
import net.minecraftforge.event.RegistryEvent;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil;

import javax.swing.text.html.parser.Entity;
import java.lang.ref.Reference;


@Mod.EventBusSubscriber(modid = TestMod.ModID)
    public class Entities {
    static int id = 50;


    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityEntry> event) {
        event.getRegistry().register(EntityEntryBuilder.create().entity(Crepitus.class).name("Hunter").id(new ResourceLocation(TestMod.ModID, "Hunter"), id++).tracker(160, 2, false).build());
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerRenderers(RegistryEvent.Register<EntityEntry> event) {
        RenderingRegistry.registerEntityRenderingHandler(Crepitus.class, CrepitusRender::new);

    }
    
}
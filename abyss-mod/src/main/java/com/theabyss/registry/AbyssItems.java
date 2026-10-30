package com.theabyss.registry;

import com.theabyss.TheAbyss;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AbyssItems {
    public static final DeferredRegister<net.minecraft.world.item.Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheAbyss.MODID);

    public static final RegistryObject<SpawnEggItem> STALKER_SPAWN_EGG = ITEMS.register(
            "stalker_spawn_egg",
            () -> new SpawnEggItem(AbyssEntities.STALKER, 0x17131F, 0x6B2638,
                    new net.minecraft.world.item.Item.Properties())
    );

    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(STALKER_SPAWN_EGG);
        }
    }
}

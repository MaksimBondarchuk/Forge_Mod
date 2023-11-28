package net.max.romaniv.item;

import net.max.romaniv.Romaniv;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Romaniv.MOD_ID);

    public static final RegistryObject<Item> RIZDVYANE = ITEMS.register("rizdvyane",
            () -> new Item(new Item.Properties().food(ModFood.RIZDVYANE)));

    public static final RegistryObject<Item> TETERIV = ITEMS.register("teteriv",
            () -> new Item(new Item.Properties().food(ModFood.TETERIV)));

    public static final  RegistryObject<Item> BANKA = ITEMS.register("banka",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

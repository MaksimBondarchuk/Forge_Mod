package net.max.romaniv.item;

import net.max.romaniv.Romaniv;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Romaniv.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PIVO = CREATIVE_MODE_TABS.register("pivo",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItem.RIZDVYANE.get()))
                    .title(Component.translatable("creativetab.pivo"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItem.RIZDVYANE.get());
                        pOutput.accept(ModItem.TETERIV.get());
                        pOutput.accept(ModItem.BANKA.get());
                    })
                    .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

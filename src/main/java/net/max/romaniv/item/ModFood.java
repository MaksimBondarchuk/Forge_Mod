package net.max.romaniv.item;

import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFood {
    public static final FoodProperties TETERIV = new FoodProperties.Builder().nutrition(5)
            .saturationMod(0.2f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.HARM), 0.5f).build();

    public static final FoodProperties RIZDVYANE = new FoodProperties.Builder().nutrition(5)
            .saturationMod(1).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 400),
                    0.5f).build();
}

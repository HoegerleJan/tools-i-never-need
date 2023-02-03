package net.doulrion.toolsineverneed.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ToolsINeverNeedFoodComponents {

    public static FoodComponent DOG_TREAT = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.6F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 0), 1F).meat().build();

}

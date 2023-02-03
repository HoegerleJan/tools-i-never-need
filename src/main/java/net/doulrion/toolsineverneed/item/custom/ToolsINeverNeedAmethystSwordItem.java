package net.doulrion.toolsineverneed.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ToolsINeverNeedAmethystSwordItem extends SwordItem {

    public ToolsINeverNeedAmethystSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        if(Screen.hasShiftDown()) {

            tooltip.add(new TranslatableText("item.toolsineverneed.amethyst_sword.tooltip"));
            tooltip.add(new TranslatableText("item.toolsineverneed.tooltip.empty_line"));
            tooltip.add(new TranslatableText("item.toolsineverneed.amethyst_sword.tooltip.shift"));

        } else {

            tooltip.add(new TranslatableText("item.toolsineverneed.amethyst_sword.tooltip"));

        }

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        int lootingLevel = EnchantmentHelper.getLevel(Enchantments.LOOTING, stack);

        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20,lootingLevel), attacker);

        return super.postHit(stack, target, attacker);
    }

}

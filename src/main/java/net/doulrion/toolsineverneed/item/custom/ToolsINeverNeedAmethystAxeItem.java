package net.doulrion.toolsineverneed.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Random;

public class ToolsINeverNeedAmethystAxeItem extends AxeItem {

    public ToolsINeverNeedAmethystAxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        if(Screen.hasShiftDown()) {

            tooltip.add(new TranslatableText("item.toolsineverneed.amethyst_axe.tooltip"));
            tooltip.add(new TranslatableText("item.toolsineverneed.amethyst_axe.tooltip_2"));
            tooltip.add(new TranslatableText("item.toolsineverneed.tooltip.empty_line"));
            tooltip.add(new TranslatableText("item.toolsineverneed.amethyst_axe.tooltip.shift"));
            tooltip.add(new TranslatableText("item.toolsineverneed.amethyst_axe.tooltip.shift_2"));

        } else {

            tooltip.add(new TranslatableText("item.toolsineverneed.amethyst_axe.tooltip"));
            tooltip.add(new TranslatableText("item.toolsineverneed.amethyst_axe.tooltip_2"));

        }

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {

        Random rand = new Random();

        int luck = rand.nextInt(100);

        int fortuneLevel = EnchantmentHelper.getLevel(Enchantments.FORTUNE, stack);

        luck = luck + (fortuneLevel * 10);

        if(luck >= 89){

            miner.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE,400, 1), miner);

        }


        return super.postMine(stack, world, state, pos, miner);
    }
}

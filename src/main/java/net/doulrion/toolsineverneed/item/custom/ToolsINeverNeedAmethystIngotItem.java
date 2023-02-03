package net.doulrion.toolsineverneed.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ToolsINeverNeedAmethystIngotItem extends Item {

    public ToolsINeverNeedAmethystIngotItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        if(Screen.hasShiftDown()) {

            tooltip.add(new TranslatableText("item.toolsineverneed.amethyst_ingot.tooltip"));
            tooltip.add(new TranslatableText("item.toolsineverneed.tooltip.empty_line"));
            tooltip.add(new TranslatableText("item.toolsineverneed.amethyst_ingot.tooltip.shift"));

        } else {

            tooltip.add(new TranslatableText("item.toolsineverneed.amethyst_ingot.tooltip"));

        }

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}

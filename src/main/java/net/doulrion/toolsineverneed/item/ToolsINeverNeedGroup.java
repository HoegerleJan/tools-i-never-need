package net.doulrion.toolsineverneed.item;

import net.doulrion.toolsineverneed.ToolsINeverNeed;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ToolsINeverNeedGroup {
    public static final ItemGroup TOOLSINEVERNEED = FabricItemGroupBuilder.build(new Identifier(ToolsINeverNeed.MOD_ID, "tinn"),
            () -> new ItemStack(ToolsINeverNeedItems.AMETHYST_INGOT));
}

package net.doulrion.toolsineverneed.item;

import net.doulrion.toolsineverneed.ToolsINeverNeed;
import net.doulrion.toolsineverneed.item.custom.ToolsINeverNeedAmethystAxeItem;
import net.doulrion.toolsineverneed.item.custom.ToolsINeverNeedAmethystIngotItem;
import net.doulrion.toolsineverneed.item.custom.ToolsINeverNeedAmethystPickaxeItem;
import net.doulrion.toolsineverneed.item.custom.ToolsINeverNeedAmethystSwordItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ToolsINeverNeedItems {

    public static final Item AMETHYST_INGOT = registerItem("amethyst_ingot",
            new ToolsINeverNeedAmethystIngotItem(new FabricItemSettings().group(ToolsINeverNeedGroup.TOOLSINEVERNEED)));

    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword",
            new ToolsINeverNeedAmethystSwordItem(ToolsINeverNeedToolMaterials.AMETHYST,3,-2.4f, new FabricItemSettings().group(ToolsINeverNeedGroup.TOOLSINEVERNEED)));

    public static final Item AMETHYST_AXE = registerItem("amethyst_axe",
            new ToolsINeverNeedAmethystAxeItem(ToolsINeverNeedToolMaterials.AMETHYST,5,-2.9f, new FabricItemSettings().group(ToolsINeverNeedGroup.TOOLSINEVERNEED)));

    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe",
            new ToolsINeverNeedAmethystPickaxeItem(ToolsINeverNeedToolMaterials.AMETHYST,1,-2.8f, new FabricItemSettings().group(ToolsINeverNeedGroup.TOOLSINEVERNEED)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ToolsINeverNeed.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ToolsINeverNeed.LOGGER.info("Registering Mod Items for " + ToolsINeverNeed.MOD_ID);
    }

}

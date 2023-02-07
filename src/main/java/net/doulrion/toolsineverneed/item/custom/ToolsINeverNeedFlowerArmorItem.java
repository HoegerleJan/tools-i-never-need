package net.doulrion.toolsineverneed.item.custom;

import net.doulrion.toolsineverneed.item.ToolsINeverNeedArmorMaterials;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ToolsINeverNeedFlowerArmorItem extends ArmorItem {

    public ToolsINeverNeedFlowerArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        if(Screen.hasShiftDown()) {

            tooltip.add(new TranslatableText("item.toolsineverneed.flower_crown.tooltip"));
            tooltip.add(new TranslatableText("item.toolsineverneed.tooltip.empty_line"));
            tooltip.add(new TranslatableText("item.toolsineverneed.flower_crown.tooltip.shift"));

        } else {

            tooltip.add(new TranslatableText("item.toolsineverneed.flower_crown.tooltip"));

        }

        super.appendTooltip(stack, world, tooltip, context);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

        if(!world.isClient()) {
            if(entity instanceof PlayerEntity) {

                PlayerEntity player = (PlayerEntity) entity;

                boolean empty = player.getInventory().getArmorStack(3).isEmpty();

                if (!empty){

                    ArmorItem helmet = ((ArmorItem) player.getInventory().getArmorStack(3).getItem());

                    if (helmet.getMaterial() == ToolsINeverNeedArmorMaterials.FLOWER) {

                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 60, 1), player);

                    }
                }

            }
        }

        super.inventoryTick(stack, world, entity, slot, selected);
    }
}

package net.doulrion.toolsineverneed.item.custom;

import net.doulrion.toolsineverneed.ToolsINeverNeed;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.nbt.NbtList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Objects;
import java.util.Random;

public class ToolsINeverNeedAmethystPickaxeItem extends PickaxeItem {

    public ToolsINeverNeedAmethystPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
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

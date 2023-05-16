package net.emilsg.clutter.enchantment;

import net.emilsg.clutter.item.ModItems;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GreedEnchantment extends Enchantment {

    public GreedEnchantment(Enchantment.Rarity rarity, EquipmentSlot... slots) {
        super(rarity, EnchantmentTarget.WEAPON, slots);
    }
    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return ModEnchantmentTarget.isAcceptableItem(stack);
    }

    public boolean isTreasure() {
        return true;
    }

    public boolean isAvailableForEnchantedBookOffer() {
        return false;
    }

    public boolean isAvailableForRandomSelection() {
        return false;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    public boolean canAccept(Enchantment other) {
        return super.canAccept(other) && other != Enchantments.LOOTING && other != Enchantments.FORTUNE && other != Enchantments.MENDING;
    }
}

package net.DakotaPride.midasfoods.items.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MasterfulMidasFruitItem extends Item {
    public MasterfulMidasFruitItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}

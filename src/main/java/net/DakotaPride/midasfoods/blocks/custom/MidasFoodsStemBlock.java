package net.DakotaPride.midasfoods.blocks.custom;

import net.minecraft.block.GourdBlock;
import net.minecraft.block.StemBlock;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class MidasFoodsStemBlock extends StemBlock {
    public MidasFoodsStemBlock(GourdBlock gourdBlock, Supplier<Item> pickBlockItem, Settings settings) {
        super(gourdBlock, pickBlockItem, settings);
    }
}

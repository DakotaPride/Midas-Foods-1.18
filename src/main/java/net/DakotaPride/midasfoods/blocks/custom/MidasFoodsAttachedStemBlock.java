package net.DakotaPride.midasfoods.blocks.custom;

import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.GourdBlock;
import net.minecraft.item.Item;

import java.util.function.Supplier;

public class MidasFoodsAttachedStemBlock extends AttachedStemBlock {
    public MidasFoodsAttachedStemBlock(GourdBlock gourdBlock, Supplier<Item> pickBlockItem, Settings settings) {
        super(gourdBlock, pickBlockItem, settings);
    }
}

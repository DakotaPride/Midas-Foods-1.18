package net.DakotaPride.midasfoods.blocks.custom;

import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.GourdBlock;
import net.minecraft.block.StemBlock;

public class MidasFoodsGourdBlock extends GourdBlock {
    public MidasFoodsGourdBlock(Settings settings) {
        super(settings);
    }

    @Override
    public StemBlock getStem() {
        return null;
    }

    @Override
    public AttachedStemBlock getAttachedStem() {
        return null;
    }
}

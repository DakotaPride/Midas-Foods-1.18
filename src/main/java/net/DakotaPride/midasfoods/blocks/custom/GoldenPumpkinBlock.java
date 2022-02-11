package net.DakotaPride.midasfoods.blocks.custom;

import net.DakotaPride.midasfoods.blocks.MidasFoodsBlocks;
import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.StemBlock;

public class GoldenPumpkinBlock extends MidasFoodsGourdBlock {
    public GoldenPumpkinBlock(Settings settings) {
        super(settings);
    }

    @Override
    public StemBlock getStem() {
        return (StemBlock)MidasFoodsBlocks.GOLDEN_PUMPKIN_STEM;
    }

    @Override
    public AttachedStemBlock getAttachedStem() {
        return (AttachedStemBlock)MidasFoodsBlocks.ATTACHED_GOLDEN_PUMPKIN_STEM;
    }

}

package net.DakotaPride.midasfoods.blocks.custom;

import net.DakotaPride.midasfoods.blocks.MidasFoodsBlocks;
import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.MelonBlock;
import net.minecraft.block.StemBlock;

public class GoldenMelonBlock extends MidasFoodsGourdBlock {
    public GoldenMelonBlock(Settings settings) {
        super(settings);
    }

    @Override
    public StemBlock getStem() {
        return (StemBlock)MidasFoodsBlocks.GOLDEN_MELON_STEM;
    }

    @Override
    public AttachedStemBlock getAttachedStem() {
        return (AttachedStemBlock)MidasFoodsBlocks.ATTACHED_GOLDEN_MELON_STEM;
    }

}

package net.DakotaPride.midasfoods.blocks.custom;

import net.DakotaPride.midasfoods.blocks.MidasFoodsBlocks;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpPlantBlock;

public class GoldenKelpPlantBlock extends KelpPlantBlock {
    public GoldenKelpPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) MidasFoodsBlocks.GOLDEN_KELP_BLOCK;
    }

}

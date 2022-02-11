package net.DakotaPride.midasfoods.blocks.custom;

import net.DakotaPride.midasfoods.MidasFoods;
import net.DakotaPride.midasfoods.blocks.MidasFoodsBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.KelpBlock;

public class GoldenKelpBlock extends KelpBlock {
    public GoldenKelpBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected Block getPlant() {
        return MidasFoodsBlocks.GOLDEN_KELP_PLANT;
    }

}

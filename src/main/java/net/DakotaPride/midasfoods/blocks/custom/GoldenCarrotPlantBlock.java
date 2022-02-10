package net.DakotaPride.midasfoods.blocks.custom;

import net.minecraft.block.CarrotsBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;

public class GoldenCarrotPlantBlock extends CarrotsBlock {
    public GoldenCarrotPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return Items.GOLDEN_CARROT;
    }

}

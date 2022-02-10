package net.DakotaPride.midasfoods.blocks.custom;

import net.DakotaPride.midasfoods.items.MidasFoodsItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;

public class GoldenWheatPlant extends CropBlock {
    public GoldenWheatPlant(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return MidasFoodsItems.GOLDEN_WHEAT_SEEDS;
    }

}

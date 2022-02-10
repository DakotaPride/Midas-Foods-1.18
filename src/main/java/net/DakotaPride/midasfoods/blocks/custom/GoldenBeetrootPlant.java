package net.DakotaPride.midasfoods.blocks.custom;

import net.DakotaPride.midasfoods.items.MidasFoodsItems;
import net.minecraft.block.BeetrootsBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;

public class GoldenBeetrootPlant extends BeetrootsBlock {
    public GoldenBeetrootPlant(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return MidasFoodsItems.GOLDEN_BEETROOT_SEEDS;
    }

}

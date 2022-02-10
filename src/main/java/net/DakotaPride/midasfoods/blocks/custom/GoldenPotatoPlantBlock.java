package net.DakotaPride.midasfoods.blocks.custom;

import net.DakotaPride.midasfoods.items.MidasFoodsItems;
import net.minecraft.block.PotatoesBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;

public class GoldenPotatoPlantBlock extends PotatoesBlock {
    public GoldenPotatoPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return MidasFoodsItems.GOLDEN_POTATO;
    }

}

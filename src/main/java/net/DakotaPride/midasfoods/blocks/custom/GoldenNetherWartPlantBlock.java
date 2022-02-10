package net.DakotaPride.midasfoods.blocks.custom;

import net.DakotaPride.midasfoods.items.MidasFoodsItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.NetherWartBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class GoldenNetherWartPlantBlock extends NetherWartBlock {
    public GoldenNetherWartPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return new ItemStack(MidasFoodsItems.GOLDEN_NETHER_WART);
    }

}

package net.DakotaPride.midasfoods.blocks.custom;

import net.DakotaPride.midasfoods.blocks.MidasFoodsBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChorusPlantBlock;
import net.minecraft.state.property.Property;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;

import static net.DakotaPride.midasfoods.blocks.custom.MidasFoodsConnectingBlock.MIDASFOODS_FACING_PROPERTIES;

public class GoldenChorusPlantBlock extends ChorusPlantBlock {
    public GoldenChorusPlantBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction,
                                                BlockState neighborState, WorldAccess world,
                                                BlockPos pos, BlockPos neighborPos) {
        if (!state.canPlaceAt(world, pos)) {
            world.createAndScheduleBlockTick(pos, this, 1);
            return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        }
        boolean bl = neighborState.isOf(this) || neighborState.isOf
                (MidasFoodsBlocks.GOLDEN_CHORUS_FLOWER) || direction == Direction.DOWN
                && neighborState.isOf(Blocks.END_STONE);
        return (BlockState)state.with((Property)MIDASFOODS_FACING_PROPERTIES.get(direction), bl);
    }

}

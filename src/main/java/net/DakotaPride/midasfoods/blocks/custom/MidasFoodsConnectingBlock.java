package net.DakotaPride.midasfoods.blocks.custom;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.block.BlockState;
import net.minecraft.block.ConnectingBlock;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.Util;
import net.minecraft.util.math.Direction;

import java.util.Map;

public class MidasFoodsConnectingBlock extends ConnectingBlock {
    private static final Direction[] MIDASFOODS_FACINGS = Direction.values();
    public static final Map<Direction, BooleanProperty> MIDASFOODS_FACING_PROPERTIES = ImmutableMap.copyOf(Util.make(Maps.newEnumMap(Direction.class), directions -> {
        directions.put(Direction.NORTH, NORTH);
        directions.put(Direction.EAST, EAST);
        directions.put(Direction.SOUTH, SOUTH);
        directions.put(Direction.WEST, WEST);
        directions.put(Direction.UP, UP);
        directions.put(Direction.DOWN, DOWN);
    }));

    public MidasFoodsConnectingBlock(float radius, Settings settings) {
        super(radius, settings);
    }

    protected int getConnectionMask(BlockState state) {
        int i = 0;
        for (int j = 0; j < MIDASFOODS_FACINGS.length; ++j) {
            if (!((Boolean)state.get(MIDASFOODS_FACING_PROPERTIES.get(MIDASFOODS_FACINGS[j]))).booleanValue()) continue;
            i |= 1 << j;
        }
        return i;
    }

}

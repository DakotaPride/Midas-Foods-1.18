package net.DakotaPride.midasfoods.blocks;

import net.DakotaPride.midasfoods.MidasFoods;
import net.DakotaPride.midasfoods.blocks.custom.GoldenNetherWartPlant;
import net.DakotaPride.midasfoods.items.MidasFoodsItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MidasFoodsBlocks {

    public static final Block GOLDEN_NETHER_WART_PLANT = registerBlockWithoutBlockItem("golden_nether_wart_plant",
            new GoldenNetherWartPlant(FabricBlockSettings.of(Material.PLANT).sounds(BlockSoundGroup.ROOTS).nonOpaque()
                    .noCollision()), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_NETHER_WART_BLOCK = registerBlock("golden_nether_wart_block",
            new Block(FabricBlockSettings.copy(Blocks.NETHER_WART_BLOCK)), MidasFoodsItemGroup.MIDAS_FOODS);


    public static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MidasFoods.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MidasFoods.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(MidasFoods.MOD_ID, name), block);
    }

    public static void registerMidasFoodsBlocks() {
        MidasFoods.LOGGER.info("Registering Mod Blocks for" + MidasFoods.MOD_ID);
    }
}

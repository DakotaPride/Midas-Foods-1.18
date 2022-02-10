package net.DakotaPride.midasfoods.blocks;

import net.DakotaPride.midasfoods.MidasFoods;
import net.DakotaPride.midasfoods.blocks.custom.*;
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
            new GoldenNetherWartPlant(FabricBlockSettings.copy(Blocks.NETHER_WART)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_NETHER_WART_BLOCK = registerBlock("golden_nether_wart_block",
            new Block(FabricBlockSettings.copy(Blocks.NETHER_WART_BLOCK)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_POTATO_PLANT = registerBlockWithoutBlockItem("golden_potato_plant",
            new GoldenPotatoPlant(FabricBlockSettings.copy(Blocks.POTATOES)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_BEETROOT_PLANT = registerBlockWithoutBlockItem("golden_beetroot_plant",
            new GoldenBeetrootPlant(FabricBlockSettings.copy(Blocks.BEETROOTS)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_WHEAT_PLANT = registerBlockWithoutBlockItem("golden_wheat_plant",
            new GoldenWheatPlant(FabricBlockSettings.copy(Blocks.WHEAT)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_HAY_BALE = registerBlock("golden_hay_bale",
            new PillarBlock(FabricBlockSettings.copy(Blocks.HAY_BLOCK)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_CARROT_PLANT = registerBlockWithoutBlockItem("golden_carrot_plant",
            new GoldenCarrotPlant(FabricBlockSettings.copy(Blocks.CARROTS)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_CHORUS_PLANT = registerBlock("golden_chorus_plant",
            new GoldenChorusPlantBlock(FabricBlockSettings.copy(Blocks.CHORUS_PLANT)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_CHORUS_FLOWER = registerBlock("golden_chorus_flower",
            new GoldenChorusFlowerBlock((GoldenChorusPlantBlock)MidasFoodsBlocks.GOLDEN_CHORUS_PLANT,
                    FabricBlockSettings.copy(Blocks.CHORUS_PLANT)), MidasFoodsItemGroup.MIDAS_FOODS);


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

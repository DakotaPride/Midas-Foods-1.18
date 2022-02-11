package net.DakotaPride.midasfoods.blocks;

import net.DakotaPride.midasfoods.MidasFoods;
import net.DakotaPride.midasfoods.blocks.custom.*;
import net.DakotaPride.midasfoods.items.MidasFoodsItemGroup;
import net.DakotaPride.midasfoods.items.MidasFoodsItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MidasFoodsBlocks {

    public static final Block GOLDEN_NETHER_WART_PLANT = registerBlockWithoutBlockItem("golden_nether_wart_plant",
            new GoldenNetherWartPlantBlock(FabricBlockSettings.copy(Blocks.NETHER_WART)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_NETHER_WART_BLOCK = registerBlock("golden_nether_wart_block",
            new Block(FabricBlockSettings.copy(Blocks.NETHER_WART_BLOCK)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_POTATO_PLANT = registerBlockWithoutBlockItem("golden_potato_plant",
            new GoldenPotatoPlantBlock(FabricBlockSettings.copy(Blocks.POTATOES)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_BEETROOT_PLANT = registerBlockWithoutBlockItem("golden_beetroot_plant",
            new GoldenBeetrootPlantBlock(FabricBlockSettings.copy(Blocks.BEETROOTS)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_WHEAT_PLANT = registerBlockWithoutBlockItem("golden_wheat_plant",
            new GoldenWheatPlantBlock(FabricBlockSettings.copy(Blocks.WHEAT)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_HAY_BALE = registerBlock("golden_hay_bale",
            new PillarBlock(FabricBlockSettings.copy(Blocks.HAY_BLOCK)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_CARROT_PLANT = registerBlockWithoutBlockItem("golden_carrot_plant",
            new GoldenCarrotPlantBlock(FabricBlockSettings.copy(Blocks.CARROTS)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_CHORUS_PLANT = registerBlock("golden_chorus_plant",
            new GoldenChorusPlantBlock(FabricBlockSettings.copy(Blocks.CHORUS_PLANT)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_CHORUS_FLOWER = registerBlock("golden_chorus_flower",
            new GoldenChorusFlowerBlock((GoldenChorusPlantBlock)MidasFoodsBlocks.GOLDEN_CHORUS_PLANT,
                    FabricBlockSettings.copy(Blocks.CHORUS_PLANT)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_MELON_BLOCK = registerBlock("golden_melon_block",
            new GoldenMelonBlock(FabricBlockSettings.copy(Blocks.MELON)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_MELON_STEM = registerBlockWithoutBlockItem("golden_melon_stem",
            new MidasFoodsStemBlock((MidasFoodsGourdBlock)MidasFoodsBlocks.GOLDEN_MELON_BLOCK,
                    () -> MidasFoodsItems.GOLDEN_MELON_SEEDS,
                    FabricBlockSettings.copy(Blocks.MELON_STEM)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block ATTACHED_GOLDEN_MELON_STEM = registerBlockWithoutBlockItem("attached_golden_melon_stem",
            new MidasFoodsAttachedStemBlock((MidasFoodsGourdBlock)MidasFoodsBlocks.GOLDEN_MELON_BLOCK,
                    () -> MidasFoodsItems.GOLDEN_MELON_SEEDS,
                    FabricBlockSettings.copy(Blocks.ATTACHED_MELON_STEM)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_PUMPKIN_BLOCK = registerBlock("golden_pumpkin_block",
            new GoldenPumpkinBlock(FabricBlockSettings.copy(Blocks.MELON)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block CARVED_GOLDEN_PUMPKIN_BLOCK = registerBlock("carved_golden_pumpkin_block",
            new CarvedGoldenPumpkinBlock(FabricBlockSettings.copy(Blocks.CARVED_PUMPKIN)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLD_O_LANTERN = registerBlock("gold_o_lantern",
            new CarvedGoldenPumpkinBlock(FabricBlockSettings.copy(Blocks.JACK_O_LANTERN)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block GOLDEN_PUMPKIN_STEM = registerBlockWithoutBlockItem("golden_pumpkin_stem",
            new MidasFoodsStemBlock((MidasFoodsGourdBlock)MidasFoodsBlocks.GOLDEN_PUMPKIN_BLOCK,
                    () -> MidasFoodsItems.GOLDEN_PUMPKIN_SEEDS,
                    FabricBlockSettings.copy(Blocks.PUMPKIN_STEM)), MidasFoodsItemGroup.MIDAS_FOODS);

    public static final Block ATTACHED_GOLDEN_PUMPKIN_STEM = registerBlockWithoutBlockItem("attached_pumpkin_melon_stem",
            new MidasFoodsAttachedStemBlock((MidasFoodsGourdBlock)MidasFoodsBlocks.GOLDEN_PUMPKIN_BLOCK,
                    () -> MidasFoodsItems.GOLDEN_PUMPKIN_SEEDS,
                    FabricBlockSettings.copy(Blocks.ATTACHED_PUMPKIN_STEM)), MidasFoodsItemGroup.MIDAS_FOODS);


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

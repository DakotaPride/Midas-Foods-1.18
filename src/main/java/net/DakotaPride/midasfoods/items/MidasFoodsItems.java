package net.DakotaPride.midasfoods.items;

import net.DakotaPride.midasfoods.MidasFoods;
import net.DakotaPride.midasfoods.blocks.MidasFoodsBlocks;
import net.DakotaPride.midasfoods.items.custom.MasterfulMidasFruitItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MidasFoodsItems {

    public static final Item MASTERFUL_MIDAS_FRUIT = registerItem("masterful_midas_fruit",
            new MasterfulMidasFruitItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8)
                        .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*90), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*30), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20*120), 1.0f)
                    .saturationModifier(1.0f).build()).group(MidasFoodsItemGroup.MIDAS_FOODS)));

    public static final Item MIDAS_FRUIT = registerItem("midas_fruit",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(4)
                    .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*45), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20*60), 1.0f)
                    .saturationModifier(1.0f).build()).group(MidasFoodsItemGroup.MIDAS_FOODS)));

    public static final Item GOLDEN_NETHER_WART = registerItem("golden_nether_wart",
            new AliasedBlockItem(MidasFoodsBlocks.GOLDEN_NETHER_WART_PLANT,
                    new FabricItemSettings().group(MidasFoodsItemGroup.MIDAS_FOODS)));

    public static final Item GOLDEN_POTATO = registerItem("golden_potato",
            new AliasedBlockItem(MidasFoodsBlocks.GOLDEN_POTATO_PLANT,
                    new FabricItemSettings().food(new FoodComponent.Builder().hunger(2)
                    .saturationModifier(0.4f).build()).group(MidasFoodsItemGroup.MIDAS_FOODS)));

    public static final Item GOLDEN_POISONOUS_POTATO = registerItem("golden_poisonous_potato",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2)
                            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20*5), 1.0f)
                    .saturationModifier(0.4f).build()).group(MidasFoodsItemGroup.MIDAS_FOODS)));

    public static final Item GOLDEN_BAKED_POTATO = registerItem("golden_baked_potato",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6)
                    .saturationModifier(0.7f).build()).group(MidasFoodsItemGroup.MIDAS_FOODS)));

    public static final Item GOLDEN_BEETROOT = registerItem("golden_beetroot",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(2)
                    .saturationModifier(0.8f).build()).group(MidasFoodsItemGroup.MIDAS_FOODS)));

    public static final Item GOLDEN_BEETROOT_SEEDS = registerItem("golden_beetroot_seeds",
            new AliasedBlockItem(MidasFoodsBlocks.GOLDEN_BEETROOT_PLANT,
                    new FabricItemSettings().group(MidasFoodsItemGroup.MIDAS_FOODS)));

    public static final Item GOLDEN_BEETROOT_STEW = registerItem("golden_beetroot_stew",
            new StewItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8)
                    .saturationModifier(0.0f).build()).group(MidasFoodsItemGroup.MIDAS_FOODS)));


    private static Item registerItem (String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(MidasFoods.MOD_ID, name), item);
}

    public static void registerMidasFoodsItems() {
        MidasFoods.LOGGER.info("Registering Mod Items for " + MidasFoods.MOD_ID);
    }

}

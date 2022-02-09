package net.DakotaPride.midasfoods.items;

import net.DakotaPride.midasfoods.MidasFoods;
import net.DakotaPride.midasfoods.blocks.MidasFoodsBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MidasFoodsItems {

    public static final Item MASTERFUL_MIDAS_FRUIT = registerItem("masterful_midas_fruit",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8)
                        .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 20*3), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*3), 1.0f)
                        .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 20*3), 1.0f)
                    .saturationModifier(1.0f).build()).group(MidasFoodsItemGroup.MIDAS_FOODS)));

    public static final Item GOLDEN_NETHER_WART = registerItem("golden_nether_wart",
            new BlockItem(MidasFoodsBlocks.GOLDEN_NETHER_WART_PLANT,
                    new FabricItemSettings().fireproof().group(MidasFoodsItemGroup.MIDAS_FOODS)));


    private static Item registerItem (String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(MidasFoods.MOD_ID, name), item);
}

    public static void registerMidasFoodsItems() {
        MidasFoods.LOGGER.info("Registering Mod Items for " + MidasFoods.MOD_ID);
    }

}

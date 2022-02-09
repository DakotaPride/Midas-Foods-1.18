package net.DakotaPride.midasfoods.items;

import net.DakotaPride.midasfoods.MidasFoods;
import net.DakotaPride.midasfoods.items.MidasFoodsItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class MidasFoodsItemGroup {
    public static final ItemGroup MIDAS_FOODS = FabricItemGroupBuilder.build(new Identifier(MidasFoods.MOD_ID, "midas_foods"),
            () -> new ItemStack(MidasFoodsItems.MASTERFUL_MIDAS_FRUIT));
}

package net.DakotaPride.midasfoods.mixin;

import net.minecraft.item.Items;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.Inject;


@Mixin(Items.class)
public abstract class ItemMixin {

    // Code that needs to be injected @ Carrot Item Registry
    // MidasFoodsBlocks.GOLDEN_CARROT_PLANT
    // ...

    // As well as 'Item' needs to be changed to
    // AliasedBlockItem

}

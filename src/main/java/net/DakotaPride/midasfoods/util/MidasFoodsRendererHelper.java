package net.DakotaPride.midasfoods.util;

import net.DakotaPride.midasfoods.blocks.MidasFoodsBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class MidasFoodsRendererHelper {
    public static void setRenderLayers() {

        BlockRenderLayerMap.INSTANCE.putBlock(MidasFoodsBlocks.GOLDEN_NETHER_WART_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MidasFoodsBlocks.GOLDEN_POTATO_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MidasFoodsBlocks.GOLDEN_BEETROOT_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MidasFoodsBlocks.GOLDEN_WHEAT_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MidasFoodsBlocks.GOLDEN_CARROT_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MidasFoodsBlocks.GOLDEN_CHORUS_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(MidasFoodsBlocks.GOLDEN_CHORUS_FLOWER, RenderLayer.getCutout());

    }
}

package net.DakotaPride.midasfoods;

import net.DakotaPride.midasfoods.util.MidasFoodsRendererHelper;
import net.fabricmc.api.ClientModInitializer;

public class MidasFoodsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        MidasFoodsRendererHelper.setRenderLayers();

    }
}

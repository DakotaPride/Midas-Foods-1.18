package net.DakotaPride.midasfoods;

import net.DakotaPride.midasfoods.blocks.MidasFoodsBlocks;
import net.DakotaPride.midasfoods.items.MidasFoodsItems;
import net.DakotaPride.midasfoods.util.MidasFoodsRendererHelper;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MidasFoods implements ModInitializer {
	public static final String MOD_ID = "midasfoods";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		MidasFoodsItems.registerMidasFoodsItems();
		MidasFoodsBlocks.registerMidasFoodsBlocks();

		MidasFoodsRendererHelper.setRenderLayers();



	}
}

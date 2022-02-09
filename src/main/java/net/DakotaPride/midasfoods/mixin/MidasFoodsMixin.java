package net.DakotaPride.midasfoods.mixin;

import net.DakotaPride.midasfoods.MidasFoods;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class MidasFoodsMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		MidasFoods.LOGGER.info("This line is printed by an midas foods mod mixin!");
	}
}

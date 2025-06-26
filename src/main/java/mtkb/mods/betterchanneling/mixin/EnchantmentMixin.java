package mtkb.mods.betterchanneling.mixin;

import net.minecraft.enchantment.ChannelingEnchantment;
import net.minecraft.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public class EnchantmentMixin {
    @Inject(method = "getMaxLevel", at = @At("RETURN"), cancellable = true)
    private void onGetMaxLevel(CallbackInfoReturnable<Integer> cir) {
        if ((Object)this instanceof ChannelingEnchantment) {
            cir.setReturnValue(3);
        }
    }
}

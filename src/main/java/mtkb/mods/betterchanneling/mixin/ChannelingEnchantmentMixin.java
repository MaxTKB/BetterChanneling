package mtkb.mods.betterchanneling.mixin;

import net.minecraft.enchantment.ChannelingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ChannelingEnchantment.class)
public abstract class ChannelingEnchantmentMixin {

    @Inject(method = "getMinPower", at = @At("RETURN"), cancellable = true)
    public void overrideMinPower(int level, CallbackInfoReturnable<Integer> cir) {
        int minPower = switch(level) {
            case 2 -> 34;
            case 3 -> 45;
            default -> 25;
        };
        cir.setReturnValue(minPower);
    }

    @Inject(method = "getMaxPower", at = @At("RETURN"), cancellable = true)
    public void overrideMaxPower(int level, CallbackInfoReturnable<Integer> cir) {
        int maxPower = switch(level) {
            case 2 -> 44;
            case 3 -> 54;
            default -> 33;
        };
        cir.setReturnValue(maxPower);
    }
}

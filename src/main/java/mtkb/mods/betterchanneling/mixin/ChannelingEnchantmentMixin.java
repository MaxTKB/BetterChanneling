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
            case 2 -> 32;
            case 3 -> 34;
            default -> 25;
        };
        cir.setReturnValue(minPower);
    }

    @Inject(method = "getMaxPower", at = @At("RETURN"), cancellable = true)
    public void overrideMaxPower(int level, CallbackInfoReturnable<Integer> cir) {
        int maxPower = switch(level) {
            case 2 -> 65;
            case 3 -> 83;
            default -> 50;
        };
        cir.setReturnValue(maxPower);
    }
    @Inject(method = "getMaxLevel", at = @At("RETURN"), cancellable = true)
    public void overrideMaxLevel(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(3);
    }
}

package ru.DmN.ubw;

import net.minecraft.entity.mob.PathAwareEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PathAwareEntity.class)
public class MobEntityMixin {
    @Redirect(method = "updateLeash", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/mob/PathAwareEntity;detachLeash(ZZ)V"))
    public void inject(PathAwareEntity instance, boolean b0, boolean b1) {

    }
}

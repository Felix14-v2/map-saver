package daniel.map_saver.mixin;

import net.minecraft.client.render.MapRenderer;
import net.minecraft.client.texture.NativeImageBackedTexture;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(MapRenderer.MapTexture.class)
public interface MapTextureAccessor {

    @Accessor("texture")
    NativeImageBackedTexture getNativeImage();
}

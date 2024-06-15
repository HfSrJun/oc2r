/* SPDX-License-Identifier: MIT */

package li.cil.oc2r.client.gui.widget;

import li.cil.oc2r.api.API;
import net.minecraft.resources.ResourceLocation;

public final class Texture {
    public final ResourceLocation location;
    public final int width, height;

    public Texture(final String location, final int width, final int height) {
        this(new ResourceLocation(API.MOD_ID, location), width, height);
    }

    public Texture(final ResourceLocation location, final int width, final int height) {
        this.location = location;
        this.width = width;
        this.height = height;
    }
}

/* SPDX-License-Identifier: MIT */

package li.cil.oc2.client.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.minecraftforge.client.model.geometry.GeometryLoaderManager;
import net.minecraftforge.client.model.geometry.IGeometryLoader;
import net.minecraftforge.client.model.obj.ObjModel;

public final class BusCableModelLoader implements IGeometryLoader<BusCableModel>, ResourceManagerReloadListener {
    @Override
    public BusCableModel read(final JsonObject jsonObject, final JsonDeserializationContext deserializationContext) throws JsonParseException {
        return new BusCableModel((ObjModel) GeometryLoaderManager.get(new ResourceLocation("forge", "obj")));
    }

    @Override
    public void onResourceManagerReload(final ResourceManager p_10758_) {

    }
}

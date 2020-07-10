package io.github.theepicblock.polyexample;

import io.github.theepicblock.polyexample.polys.ItemPolyExample;
import io.github.theepicblock.polymc.PolyMcEntrypoint;
import io.github.theepicblock.polymc.api.item.CustomModelDataPoly;
import io.github.theepicblock.polymc.api.register.PolyRegistry;

public class PolyHook implements PolyMcEntrypoint {
    @Override
    public void registerPolys(PolyRegistry polyRegistry) {
        System.out.println("hello world from the polymc entrypoint!");
        polyRegistry.registerItem(Main.CUSTOM_POLY_ITEM,new ItemPolyExample());
    }
}

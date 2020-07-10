package io.github.theepicblock.polyexample;

import io.github.theepicblock.polyexample.examples.CustomPolyItem;
import io.github.theepicblock.polyexample.examples.ExampleItem;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
    public static final Item EXAMPLE_ITEM = new ExampleItem(new Item.Settings().group(ItemGroup.MISC));
    public static final Item CUSTOM_POLY_ITEM = new CustomPolyItem(new Item.Settings().group(ItemGroup.MISC));
    @Override
    public void onInitialize() {
        //PolyMc will automatically make this item into a serverside item!
        //The only caveat is that the namespace of the item must be the same as the modid in the fabric.mod.json
        //Otherwise PolyMc won't be able to automatically grab the assets for the resourcepack
        Registry.register(Registry.ITEM, new Identifier("polyexample", "example_item"), EXAMPLE_ITEM);

        //This example uses a custom poly to display differently!
        //see the PolyHook class
        Registry.register(Registry.ITEM, new Identifier("polyexample", "custom_poly_item"), CUSTOM_POLY_ITEM);
    }
}

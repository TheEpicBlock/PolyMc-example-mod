package io.github.theepicblock.polyexample.polys;

import io.github.theepicblock.polymc.Util;
import io.github.theepicblock.polymc.api.item.ItemPoly;
import io.github.theepicblock.polymc.resource.ResourcePackMaker;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Random;

/**
 * This is an example for a custom poly.
 * It just picks a random item to display
 *
 * WARNING!!
 * It's not recommended
 */
public class ItemPolyExample implements ItemPoly {
    private final Random random = new Random();
    @Override
    public ItemStack getClientItem(ItemStack itemStack) {
        //WARNING!
        //It is not recommended to make the output of this function random
        //It will cause issues when using this in creative
        //This is just an example. But if you want your poly to work in creative it should be deterministic
        //To be more specific. 2 calls to this function right after each other with the same input should return the same value

        Item randomItem = null;
        Identifier randomItemId = null;
        do {
            randomItem = Registry.ITEM.getRandom(random);
            randomItemId = Registry.ITEM.getId(randomItem);
        } while (!Util.isVanilla(randomItemId));
        //this loop makes sure the random item is actually a vanilla item

        return new ItemStack(randomItem);
    }

    @Override
    public void AddToResourcePack(Item item, ResourcePackMaker resourcePackMaker) {
        //We don't need any resources for this
    }
}

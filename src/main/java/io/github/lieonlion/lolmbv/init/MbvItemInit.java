package io.github.lieonlion.lolmbv.init;

import io.github.lieonlion.lolmbv.MoreBookshelfVariants;
import io.github.lieonlion.lolmbv.block.MoreBookshelfBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

public class MbvItemInit {
    public static BlockItem SPRUCE_BOOKSHELF_I = itemFromBlock(MbvBlockInit.SPRUCE_BOOKSHELF);
    public static BlockItem BIRCH_BOOKSHELF_I = itemFromBlock(MbvBlockInit.BIRCH_BOOKSHELF);
    public static BlockItem JUNGLE_BOOKSHELF_I = itemFromBlock(MbvBlockInit.JUNGLE_BOOKSHELF);
    public static BlockItem ACACIA_BOOKSHELF_I = itemFromBlock(MbvBlockInit.ACACIA_BOOKSHELF);
    public static BlockItem DARK_OAK_BOOKSHELF_I = itemFromBlock(MbvBlockInit.DARK_OAK_BOOKSHELF);
    public static BlockItem MANGROVE_BOOKSHELF_I = itemFromBlock(MbvBlockInit.MANGROVE_BOOKSHELF);
    public static BlockItem CHERRY_BOOKSHELF_I = itemFromBlock(MbvBlockInit.CHERRY_BOOKSHELF);
    public static BlockItem PALE_OAK_BOOKSHELF_I = itemFromBlock(MbvBlockInit.PALE_OAK_BOOKSHELF);
    public static BlockItem BAMBOO_BOOKSHELF_I = itemFromBlock(MbvBlockInit.BAMBOO_BOOKSHELF);
    public static BlockItem CRIMSON_BOOKSHELF_I = itemFromBlock(MbvBlockInit.CRIMSON_BOOKSHELF);
    public static BlockItem WARPED_BOOKSHELF_I = itemFromBlock(MbvBlockInit.WARPED_BOOKSHELF);

    public static void registerItems() {
        registerItem(SPRUCE_BOOKSHELF_I, Items.BOOKSHELF);
        registerItem(BIRCH_BOOKSHELF_I, SPRUCE_BOOKSHELF_I);
        registerItem(JUNGLE_BOOKSHELF_I, BIRCH_BOOKSHELF_I);
        registerItem(ACACIA_BOOKSHELF_I, JUNGLE_BOOKSHELF_I);
        registerItem(DARK_OAK_BOOKSHELF_I, ACACIA_BOOKSHELF_I);
        registerItem(MANGROVE_BOOKSHELF_I, DARK_OAK_BOOKSHELF_I);
        registerItem(CHERRY_BOOKSHELF_I, MANGROVE_BOOKSHELF_I);
        registerItem(PALE_OAK_BOOKSHELF_I, CHERRY_BOOKSHELF_I);
        registerItem(BAMBOO_BOOKSHELF_I, PALE_OAK_BOOKSHELF_I);
        registerItem(CRIMSON_BOOKSHELF_I, BAMBOO_BOOKSHELF_I);
        registerItem(WARPED_BOOKSHELF_I, CRIMSON_BOOKSHELF_I);
    }

    // Thank You to Pnku (https://github.com/pnk2u) for making these functions. *
    public static BlockItem itemFromBlock(Block block) {
        return new BlockItem(block, setProperties(block));
    }

    // **
    public static Item.Properties setProperties(Block block) {
        return new Item.Properties()
                .setId(ResourceKey.create(Registries.ITEM, BuiltInRegistries.BLOCK.getKey(block))).useBlockDescriptionPrefix();
    }

    public static void registerItem(Item item, Item after) {
        String name = ((MoreBookshelfBlock)((BlockItem) item).getBlock()).woodType + "_bookshelf";
        Registry.register(BuiltInRegistries.ITEM, MoreBookshelfVariants.asId(name), item);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(after, item));
    }
}
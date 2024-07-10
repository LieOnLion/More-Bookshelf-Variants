package io.github.lieonlion.lolmbv.init;

import io.github.lieonlion.lolmbv.MoreBookshelfVariants;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MbvItemInit {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreBookshelfVariants.MODID);

    public static DeferredItem<BlockItem> SPRUCE_BOOKSHELF_I = registerItem("spruce_bookshelf", MbvBlockInit.SPRUCE_BOOKSHELF);
    public static DeferredItem<BlockItem> BIRCH_BOOKSHELF_I = registerItem("birch_bookshelf", MbvBlockInit.BIRCH_BOOKSHELF);
    public static DeferredItem<BlockItem> JUNGLE_BOOKSHELF_I = registerItem("jungle_bookshelf", MbvBlockInit.JUNGLE_BOOKSHELF);
    public static DeferredItem<BlockItem> ACACIA_BOOKSHELF_I = registerItem("acacia_bookshelf", MbvBlockInit.ACACIA_BOOKSHELF);
    public static DeferredItem<BlockItem> DARK_OAK_BOOKSHELF_I = registerItem("dark_oak_bookshelf", MbvBlockInit.DARK_OAK_BOOKSHELF);
    public static DeferredItem<BlockItem> MANGROVE_BOOKSHELF_I = registerItem("mangrove_bookshelf", MbvBlockInit.MANGROVE_BOOKSHELF);
    public static DeferredItem<BlockItem> CHERRY_BOOKSHELF_I = registerItem("cherry_bookshelf", MbvBlockInit.CHERRY_BOOKSHELF);
    public static DeferredItem<BlockItem> BAMBOO_BOOKSHELF_I = registerItem("bamboo_bookshelf", MbvBlockInit.BAMBOO_BOOKSHELF);
    public static DeferredItem<BlockItem> CRIMSON_BOOKSHELF_I = registerItem("crimson_bookshelf", MbvBlockInit.CRIMSON_BOOKSHELF);
    public static DeferredItem<BlockItem> WARPED_BOOKSHELF_I = registerItem( "warped_bookshelf", MbvBlockInit.WARPED_BOOKSHELF);

    public static void registerItems(IEventBus modBus) {
        ITEMS.register(modBus);
    }

    public static DeferredItem<BlockItem> registerItem(String name, DeferredBlock<Block> block) {
        return ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void addItemsToTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() != CreativeModeTabs.FUNCTIONAL_BLOCKS) return;
        registerToTab(event, SPRUCE_BOOKSHELF_I.get(), Items.BOOKSHELF);
        registerToTab(event, BIRCH_BOOKSHELF_I.get(), SPRUCE_BOOKSHELF_I.get());
        registerToTab(event, JUNGLE_BOOKSHELF_I.get(), BIRCH_BOOKSHELF_I.get());
        registerToTab(event, ACACIA_BOOKSHELF_I.get(), JUNGLE_BOOKSHELF_I.get());
        registerToTab(event, DARK_OAK_BOOKSHELF_I.get(), ACACIA_BOOKSHELF_I.get());
        registerToTab(event, MANGROVE_BOOKSHELF_I.get(), DARK_OAK_BOOKSHELF_I.get());
        registerToTab(event, CHERRY_BOOKSHELF_I.get(), MANGROVE_BOOKSHELF_I.get());
        registerToTab(event, BAMBOO_BOOKSHELF_I.get(), CHERRY_BOOKSHELF_I.get());
        registerToTab(event, CRIMSON_BOOKSHELF_I.get(), BAMBOO_BOOKSHELF_I.get());
        registerToTab(event, WARPED_BOOKSHELF_I.get(), CRIMSON_BOOKSHELF_I.get());
    } public static void registerToTab(BuildCreativeModeTabContentsEvent event, Item item, Item after) {
        event.insertAfter(new ItemStack(after), new ItemStack(item), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }
}
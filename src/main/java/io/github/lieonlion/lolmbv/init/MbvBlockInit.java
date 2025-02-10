package io.github.lieonlion.lolmbv.init;

import io.github.lieonlion.lolmbv.MoreBookshelfVariants;
import io.github.lieonlion.lolmbv.block.MoreBookshelfBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MbvBlockInit {
    public static final MoreBookshelfBlock SPRUCE_BOOKSHELF = new MoreBookshelfBlock(MapColor.PODZOL, "spruce");
    public static final MoreBookshelfBlock BIRCH_BOOKSHELF = new MoreBookshelfBlock(MapColor.SAND, "birch");
    public static final MoreBookshelfBlock JUNGLE_BOOKSHELF = new MoreBookshelfBlock(MapColor.DIRT, "jungle");
    public static final MoreBookshelfBlock ACACIA_BOOKSHELF = new MoreBookshelfBlock(MapColor.COLOR_ORANGE, "acacia");
    public static final MoreBookshelfBlock DARK_OAK_BOOKSHELF = new MoreBookshelfBlock(MapColor.COLOR_BROWN, "dark_oak");
    public static final MoreBookshelfBlock MANGROVE_BOOKSHELF = new MoreBookshelfBlock(MapColor.COLOR_RED, "mangrove");
    public static final MoreBookshelfBlock CHERRY_BOOKSHELF = new MoreBookshelfBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD, "cherry");
    public static final MoreBookshelfBlock PALE_OAK_BOOKSHELF = new MoreBookshelfBlock(MapColor.QUARTZ, "pale_oak");
    public static final MoreBookshelfBlock BAMBOO_BOOKSHELF = new MoreBookshelfBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD, "bamboo");
    public static final MoreBookshelfBlock CRIMSON_BOOKSHELF = new MoreBookshelfBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD, "crimson");
    public static final MoreBookshelfBlock WARPED_BOOKSHELF = new MoreBookshelfBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD, "warped");

    public static void registerBlocks() {
        registerBlock(SPRUCE_BOOKSHELF);
        registerBlock(BIRCH_BOOKSHELF);
        registerBlock(JUNGLE_BOOKSHELF);
        registerBlock(ACACIA_BOOKSHELF);
        registerBlock(DARK_OAK_BOOKSHELF);
        registerBlock(MANGROVE_BOOKSHELF);
        registerBlock(CHERRY_BOOKSHELF);
        registerBlock(PALE_OAK_BOOKSHELF);
        registerBlock(BAMBOO_BOOKSHELF);
        registerBlock(CRIMSON_BOOKSHELF);
        registerBlock(WARPED_BOOKSHELF);
    }

    private static void registerBlock(MoreBookshelfBlock block) {
        String name = block.woodType + "_bookshelf";
        Registry.register(BuiltInRegistries.BLOCK, MoreBookshelfVariants.asId(name), block);
    }
}
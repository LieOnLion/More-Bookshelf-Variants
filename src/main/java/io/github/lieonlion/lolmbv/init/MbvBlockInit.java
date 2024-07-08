package io.github.lieonlion.lolmbv.init;

import io.github.lieonlion.lolmbv.MoreBookshelfVariants;
import io.github.lieonlion.lolmbv.block.MoreBookshelfBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MbvBlockInit {
    public static final MoreBookshelfBlock SPRUCE_BOOKSHELF = new MoreBookshelfBlock(MapColor.PODZOL);
    public static final MoreBookshelfBlock BIRCH_BOOKSHELF = new MoreBookshelfBlock(MapColor.SAND);
    public static final MoreBookshelfBlock JUNGLE_BOOKSHELF = new MoreBookshelfBlock(MapColor.DIRT);
    public static final MoreBookshelfBlock ACACIA_BOOKSHELF = new MoreBookshelfBlock(MapColor.COLOR_ORANGE);
    public static final MoreBookshelfBlock DARK_OAK_BOOKSHELF = new MoreBookshelfBlock(MapColor.COLOR_BROWN);
    public static final MoreBookshelfBlock MANGROVE_BOOKSHELF = new MoreBookshelfBlock(MapColor.COLOR_RED);
    public static final MoreBookshelfBlock CHERRY_BOOKSHELF = new MoreBookshelfBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD);
    public static final MoreBookshelfBlock BAMBOO_BOOKSHELF = new MoreBookshelfBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD);
    public static final MoreBookshelfBlock CRIMSON_BOOKSHELF = new MoreBookshelfBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD);
    public static final MoreBookshelfBlock WARPED_BOOKSHELF = new MoreBookshelfBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD);

    public static void registerBlocks() {
        registerBlock("spruce_bookshelf", SPRUCE_BOOKSHELF);
        registerBlock("birch_bookshelf", BIRCH_BOOKSHELF);
        registerBlock("jungle_bookshelf", JUNGLE_BOOKSHELF);
        registerBlock("acacia_bookshelf", ACACIA_BOOKSHELF);
        registerBlock("dark_oak_bookshelf", DARK_OAK_BOOKSHELF);
        registerBlock("mangrove_bookshelf", MANGROVE_BOOKSHELF);
        registerBlock("cherry_bookshelf", CHERRY_BOOKSHELF);
        registerBlock("bamboo_bookshelf", BAMBOO_BOOKSHELF);
        registerBlock("crimson_bookshelf", CRIMSON_BOOKSHELF);
        registerBlock("warped_bookshelf", WARPED_BOOKSHELF);
    }

    private static void registerBlock(String name, Block block) {
        Registry.register(BuiltInRegistries.BLOCK, MoreBookshelfVariants.asId(name), block);
    }
}
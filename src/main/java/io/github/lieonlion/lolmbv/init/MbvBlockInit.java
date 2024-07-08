package io.github.lieonlion.lolmbv.init;

import io.github.lieonlion.lolmbv.MoreBookshelfVariants;
import io.github.lieonlion.lolmbv.bock.MoreBookshelfBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MbvBlockInit {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreBookshelfVariants.MODID);

    public static final DeferredBlock<Block> SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf", () -> new MoreBookshelfBlock(MapColor.PODZOL));
    public static final DeferredBlock<Block> BIRCH_BOOKSHELF = registerBlock("birch_bookshelf", () -> new MoreBookshelfBlock(MapColor.SAND));
    public static final DeferredBlock<Block> JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf", () -> new MoreBookshelfBlock(MapColor.DIRT));
    public static final DeferredBlock<Block> ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf", () -> new MoreBookshelfBlock(MapColor.COLOR_ORANGE));
    public static final DeferredBlock<Block> DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf", () -> new MoreBookshelfBlock(MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf", () -> new MoreBookshelfBlock(MapColor.COLOR_RED));
    public static final DeferredBlock<Block> CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf", () -> new MoreBookshelfBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD));
    public static final DeferredBlock<Block> BAMBOO_BOOKSHELF = registerBlock("bamboo_bookshelf", () -> new MoreBookshelfBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD));
    public static final DeferredBlock<Block> CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf", () -> new MoreBookshelfBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD));
    public static final DeferredBlock<Block> WARPED_BOOKSHELF = registerBlock("warped_bookshelf", () -> new MoreBookshelfBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD));

    public static void registerBlocks(IEventBus modBus) {
        BLOCKS.register(modBus);
    }

    private static DeferredBlock<Block> registerBlock(String name, Supplier<Block> block) {
        return BLOCKS.register(name, block);
    }
}
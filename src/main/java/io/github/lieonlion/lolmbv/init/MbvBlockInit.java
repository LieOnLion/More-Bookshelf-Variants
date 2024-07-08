package io.github.lieonlion.lolmbv.init;

import io.github.lieonlion.lolmbv.MoreBookshelfVariants;
import io.github.lieonlion.lolmbv.block.MoreBookshelfBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class MbvBlockInit {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreBookshelfVariants.MODID);

    public static final RegistryObject<Block> SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf", () -> new MoreBookshelfBlock(MapColor.PODZOL));
    public static final RegistryObject<Block> BIRCH_BOOKSHELF = registerBlock("birch_bookshelf", () -> new MoreBookshelfBlock(MapColor.SAND));
    public static final RegistryObject<Block> JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf", () -> new MoreBookshelfBlock(MapColor.DIRT));
    public static final RegistryObject<Block> ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf", () -> new MoreBookshelfBlock(MapColor.COLOR_ORANGE));
    public static final RegistryObject<Block> DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf", () -> new MoreBookshelfBlock(MapColor.COLOR_BROWN));
    public static final RegistryObject<Block> MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf", () -> new MoreBookshelfBlock(MapColor.COLOR_RED));
    public static final RegistryObject<Block> CHERRY_BOOKSHELF = registerBlock("cherry_bookshelf", () -> new MoreBookshelfBlock(MapColor.TERRACOTTA_WHITE, SoundType.CHERRY_WOOD));
    public static final RegistryObject<Block> BAMBOO_BOOKSHELF = registerBlock("bamboo_bookshelf", () -> new MoreBookshelfBlock(MapColor.COLOR_YELLOW, SoundType.BAMBOO_WOOD));
    public static final RegistryObject<Block> CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf", () -> new MoreBookshelfBlock(MapColor.CRIMSON_STEM, SoundType.NETHER_WOOD));
    public static final RegistryObject<Block> WARPED_BOOKSHELF = registerBlock("warped_bookshelf", () -> new MoreBookshelfBlock(MapColor.WARPED_STEM, SoundType.NETHER_WOOD));

    public static void registerBlocks(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }

    private static RegistryObject<Block> registerBlock(String name, Supplier<Block> block) {
        return BLOCKS.register(name, block);
    }
}
package io.github.lieonlion.lolmbv;

import io.github.lieonlion.lolmbv.init.MbvItemInit;
import io.github.lieonlion.lolmbv.init.MbvBlockInit;
import io.github.lieonlion.lolmbv.mixin.FireBlockInvoker;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;

public class MoreBookshelfVariants implements ModInitializer {
    public static final String MODID = "lolmbv";

    @Override
    public void onInitialize() {
        MbvBlockInit.registerBlocks();
        MbvItemInit.registerItems();

        registerFlammableBlocks();
    }

    private void registerFlammableBlocks() {
        FireBlock fireBlock = (FireBlock) Blocks.FIRE;
        ((FireBlockInvoker) fireBlock).callSetFlammable(MbvBlockInit.SPRUCE_BOOKSHELF, 30, 20);
        ((FireBlockInvoker) fireBlock).callSetFlammable(MbvBlockInit.BIRCH_BOOKSHELF, 30, 20);
        ((FireBlockInvoker) fireBlock).callSetFlammable(MbvBlockInit.JUNGLE_BOOKSHELF, 30, 20);
        ((FireBlockInvoker) fireBlock).callSetFlammable(MbvBlockInit.ACACIA_BOOKSHELF, 30, 20);
        ((FireBlockInvoker) fireBlock).callSetFlammable(MbvBlockInit.DARK_OAK_BOOKSHELF, 30, 20);
        ((FireBlockInvoker) fireBlock).callSetFlammable(MbvBlockInit.MANGROVE_BOOKSHELF, 30, 20);
        ((FireBlockInvoker) fireBlock).callSetFlammable(MbvBlockInit.CHERRY_BOOKSHELF, 30, 20);
        ((FireBlockInvoker) fireBlock).callSetFlammable(MbvBlockInit.BAMBOO_BOOKSHELF, 30, 20);
    }

    public static ResourceLocation asId(String path) {
        return new ResourceLocation(MODID, path);
    }
}
package io.github.lieonlion.lolmbv;

import io.github.lieonlion.lolmbv.init.MbvItemInit;
import io.github.lieonlion.lolmbv.init.MbvBlockInit;
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
        fireBlock.setFlammable(MbvBlockInit.SPRUCE_BOOKSHELF, 30, 20);
        fireBlock.setFlammable(MbvBlockInit.BIRCH_BOOKSHELF, 30, 20);
        fireBlock.setFlammable(MbvBlockInit.JUNGLE_BOOKSHELF, 30, 20);
        fireBlock.setFlammable(MbvBlockInit.ACACIA_BOOKSHELF, 30, 20);
        fireBlock.setFlammable(MbvBlockInit.DARK_OAK_BOOKSHELF, 30, 20);
        fireBlock.setFlammable(MbvBlockInit.MANGROVE_BOOKSHELF, 30, 20);
        fireBlock.setFlammable(MbvBlockInit.CHERRY_BOOKSHELF, 30, 20);
        fireBlock.setFlammable(MbvBlockInit.BAMBOO_BOOKSHELF, 30, 20);
    }

    public static ResourceLocation asId(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
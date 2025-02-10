package io.github.lieonlion.lolmbv.block;

import io.github.lieonlion.lolmbv.MoreBookshelfVariants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;

public class MoreBookshelfBlock extends Block {
    public final String woodType;

    public MoreBookshelfBlock(MapColor colour, String woodType) {
        super(Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(colour)
                .setId(ResourceKey.create(Registries.BLOCK, MoreBookshelfVariants.asId(woodType + "_bookshelf"))));
        this.woodType = woodType;
    }

    public MoreBookshelfBlock(MapColor colour, SoundType sound, String woodType) {
        super(Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(colour).sound(sound)
                .setId(ResourceKey.create(Registries.BLOCK, MoreBookshelfVariants.asId(woodType + "_bookshelf"))));
        this.woodType = woodType;
    }
}
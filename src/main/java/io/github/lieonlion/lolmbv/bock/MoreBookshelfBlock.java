package io.github.lieonlion.lolmbv.bock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class MoreBookshelfBlock extends Block {
    public MoreBookshelfBlock(MapColor colour) {
        super(Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(colour));
    }

    public MoreBookshelfBlock(MapColor colour, SoundType sound) {
        super(Properties.ofFullCopy(Blocks.BOOKSHELF).mapColor(colour).sound(sound));
    }
}
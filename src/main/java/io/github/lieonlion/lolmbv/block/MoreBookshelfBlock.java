package io.github.lieonlion.lolmbv.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class MoreBookshelfBlock extends Block {
    public MoreBookshelfBlock(MapColor colour) {
        super(Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(1.5F).sound(SoundType.WOOD).ignitedByLava());
    }

    public MoreBookshelfBlock(MapColor colour, SoundType sound) {
        super(Properties.of().mapColor(colour).instrument(NoteBlockInstrument.BASS).strength(1.5F).sound(sound).ignitedByLava());
    }
}
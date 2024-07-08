package io.github.lieonlion.lolmbv;

import io.github.lieonlion.lolmbv.init.MbvItemInit;
import io.github.lieonlion.lolmbv.init.MbvBlockInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(MoreBookshelfVariants.MODID)
public class MoreBookshelfVariants {
    public static final String MODID = "lolmbv";

    public MoreBookshelfVariants(IEventBus modBus) {
        MbvBlockInit.registerBlocks(modBus);
        MbvItemInit.registerItems(modBus);

        modBus.addListener(MbvItemInit::addItemsToTab);
        modBus.addListener(this::register);
    }

    @SubscribeEvent
    public void register(RegisterEvent event) {
        event.register(Registries.BLOCK, (helper) -> {
            registerFlammableBlocks();
        });
    }

    private void registerFlammableBlocks() {
        FireBlock fireBlock = (FireBlock) Blocks.FIRE;
        fireBlock.setFlammable(MbvBlockInit.SPRUCE_BOOKSHELF.get(), 30, 20);
        fireBlock.setFlammable(MbvBlockInit.BIRCH_BOOKSHELF.get(), 30, 20);
        fireBlock.setFlammable(MbvBlockInit.JUNGLE_BOOKSHELF.get(), 30, 20);
        fireBlock.setFlammable(MbvBlockInit.ACACIA_BOOKSHELF.get(), 30, 20);
        fireBlock.setFlammable(MbvBlockInit.DARK_OAK_BOOKSHELF.get(), 30, 20);
        fireBlock.setFlammable(MbvBlockInit.MANGROVE_BOOKSHELF.get(), 30, 20);
        fireBlock.setFlammable(MbvBlockInit.CHERRY_BOOKSHELF.get(), 30, 20);
        fireBlock.setFlammable(MbvBlockInit.BAMBOO_BOOKSHELF.get(), 30, 20);
    }

    public static ResourceLocation asId(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
package com.rickybk.tutorialmod.init;

import com.rickybk.tutorialmod.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();
    public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON);
}

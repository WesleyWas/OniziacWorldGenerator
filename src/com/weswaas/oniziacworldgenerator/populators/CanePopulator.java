package com.weswaas.oniziacworldgenerator.populators;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.generator.BlockPopulator;

import java.util.Random;

/**
 * Created by Weswas on 30/04/2020.
 */
public class CanePopulator extends BlockPopulator {
    private int canePatchChance;

    private Material cane;

    private BlockFace[] faces = new BlockFace[] { BlockFace.NORTH, BlockFace.SOUTH, BlockFace.EAST, BlockFace.WEST };

    public CanePopulator() {
        this.canePatchChance = 100;
        this.cane = Material.SUGAR_CANE_BLOCK;
    }

    public void populate(World world, Random random, Chunk source) {
        if (random.nextInt(100) < this.canePatchChance)
            for (int i = 0; i < 16; i++) {
                Block block;
                if (random.nextBoolean()) {
                    block = getHighestBlock(source, random.nextInt(16), i);
                } else {
                    block = getHighestBlock(source, i, random.nextInt(16));
                }
                if (block.getType() == Material.GRASS || block.getType() == Material.SAND)
                    createCane(block, random);
            }
    }

    private void createCane(Block block, Random rand) {
        boolean create = false;
        for (BlockFace face : this.faces) {
            if (block.getRelative(face).getType().name().toLowerCase().contains("water"))
                create = true;
        }
        if (!create)
            return;
        for (int i = 1; i < rand.nextInt(4) + 3; ) {
            block.getRelative(0, i, 0).setType(this.cane);
            i++;
        }
    }

    private Block getHighestBlock(Chunk chunk, int x, int z) {
        Block block = null;
        for (int i = 127; i >= 0; ) {
            if ((block = chunk.getBlock(x, i, z)).getTypeId() != 0)
                return block;
            i--;
        }
        return block;
    }
}

package com.weswaas.oniziacworldgenerator;

import com.weswaas.oniziacworldgenerator.biomes.BiomeChanger;
import com.weswaas.oniziacworldgenerator.biomes.BiomeUtils;
import com.weswaas.oniziacworldgenerator.populators.CanePopulator;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldInitEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Weswas on 21/04/2020.
 */
public class Main extends JavaPlugin implements Listener{

    @Override
    public void onEnable(){
        Bukkit.getPluginManager().registerEvents(new BiomeChanger(), this);
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onInit(WorldInitEvent e){
        if(!e.getWorld().getName().equalsIgnoreCase("world")){
            return;
        }
        e.getWorld().getPopulators().add(new CanePopulator());
    }


    @Override
    public void onLoad(){

        BiomeUtils.changeBiome(0, 4);
        BiomeUtils.changeBiome(3, 2);
        BiomeUtils.changeBiome(6, 1);
        BiomeUtils.changeBiome(10, 4);
        BiomeUtils.changeBiome(11, 1);
        BiomeUtils.changeBiome(12, 4);
        BiomeUtils.changeBiome(13, 2);
        BiomeUtils.changeBiome(14, 1);
        BiomeUtils.changeBiome(15, 1);
        BiomeUtils.changeBiome(16, 1);
        BiomeUtils.changeBiome(17, 1);
        BiomeUtils.changeBiome(20, 4);
        BiomeUtils.changeBiome(21, 2);
        BiomeUtils.changeBiome(22, 1);
        BiomeUtils.changeBiome(23, 4);
        BiomeUtils.changeBiome(24, 4);
        BiomeUtils.changeBiome(32, 1);
        BiomeUtils.changeBiome(33, 2);
        BiomeUtils.changeBiome(34, 1);
        BiomeUtils.changeBiome(29, 4);
        BiomeUtils.changeBiome(39, 4);
        BiomeUtils.changeBiome(38, 1);
        BiomeUtils.changeBiome(37, 2);
        BiomeUtils.changeBiome(36, 1);
        BiomeUtils.changeBiome(35, 4);
        BiomeUtils.changeBiome(39, 4);
        BiomeUtils.changeBiome(38, 2);
        BiomeUtils.changeBiome(37, 4);
        BiomeUtils.changeBiome(36, 1);
        BiomeUtils.changeBiome(163, 4);
        BiomeUtils.changeBiome(164, 1);
        BiomeUtils.changeBiome(165, 4);
        BiomeUtils.changeBiome(166, 2);
        BiomeUtils.changeBiome(167, 4);
        BiomeUtils.changeBiome(162, 1);
        BiomeUtils.changeBiome(161, 4);
        BiomeUtils.changeBiome(160, 1);
        BiomeUtils.changeBiome(158, 4);
        BiomeUtils.changeBiome(157, 2);
        BiomeUtils.changeBiome(156, 4);
        BiomeUtils.changeBiome(155, 1);
        BiomeUtils.changeBiome(151, 4);
        BiomeUtils.changeBiome(149, 2);
        BiomeUtils.changeBiome(140, 4);
        BiomeUtils.changeBiome(134, 1);
        BiomeUtils.changeBiome(133, 2);
        BiomeUtils.changeBiome(132, 4);
        BiomeUtils.changeBiome(131, 1);
        BiomeUtils.changeBiome(130, 2);
        BiomeUtils.changeBiome(129, 4);

    }

}

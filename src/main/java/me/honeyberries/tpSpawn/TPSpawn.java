package me.honeyberries.tpSpawn;

import org.bukkit.plugin.java.JavaPlugin;
import java.util.Objects;

/**
 * Main class for the TPSpawn plugin.
 * This class extends JavaPlugin and handles the plugin's lifecycle events.
 */
public final class TPSpawn extends JavaPlugin {

    /**
     * Called when the plugin is enabled.
     * This method contains the startup logic for the plugin.
     */
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("TP Spawn has been enabled!");

        // Register /spawn command with the server
        if (getServer().getPluginCommand("spawn") != null) {
            Objects.requireNonNull(getServer().getPluginCommand("spawn")).setExecutor(new SpawnCommand());
            getLogger().info("Successfully registered /spawn command.");
        } else {
            getLogger().warning("Failed to register /spawn command!");
        }

        // Register /tpspawn command with the server
        if (getServer().getPluginCommand("tpspawn") != null) {
            Objects.requireNonNull(getServer().getPluginCommand("tpspawn")).setExecutor(new TPSpawnCommand());
            getLogger().info("Successfully registered /tpspawn command.");
        } else {
            getLogger().warning("Failed to register /tpspawn command!");
        }

        // Load the configuration file
        try {
            TPSpawnSettings.getInstance().loadConfig();
            getLogger().info("Configuration successfully loaded!");
        } catch (Exception e) {
            getLogger().warning("Failed to load the configuration file!");
            e.printStackTrace();
        }
    }

    /**
     * Called when the plugin is disabled.
     * This method contains the shutdown logic for the plugin.
     */
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("TP Spawn has been disabled!");
    }

    /**
     * Provides access to the plugin instance.
     * @return The plugin instance.
     */
    public static TPSpawn getInstance() {
        return getPlugin(TPSpawn.class);
    }

}
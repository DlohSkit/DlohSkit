package fr.holdkits;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin
  implements Listener
{
  public static Main instance;
  
  public static Main getInstance()
  {
    return instance;
  }
  
  private static String prfx = "§8[§3Hold§bKits§8] ";
  
  public static String prefix()
  {
    return prfx;
  }
  
  public void onEnable()
  {
	getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "HoldKits Plugin Enabled");
    registerEvents();
    registerCommands();
    saveConfig();
    instance = this;
  }
  
  public void onDisable() {
    getServer().getConsoleSender().sendMessage(ChatColor.RED + "HoldKits Plugin Disabled");
    instance = null;
  }
  
  public void registerEvents()
  {
	  //RegisterEvents
  }
  
  public void registerCommands()
  {
	  //RegisterCommands
  }
  
  public void setupConfig()
  {
    File config = new File(getDataFolder(), "config.yml");
    if (!config.exists())
    {
      getConfig().options().copyDefaults(true);
      saveConfig();
    }
  }
}

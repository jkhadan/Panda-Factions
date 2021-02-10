package pandahut.pandafactions;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import pandahut.pandafactions.commands.ChangeColorCommand;
import pandahut.pandafactions.commands.ListColorsCommand;
import pandahut.pandafactions.commands.NicknameCommand;
import pandahut.pandafactions.events.KillDeathEvent;
import pandahut.pandafactions.events.OneSleep;
import pandahut.pandafactions.events.Scoreboards;
import pandahut.pandafactions.events.WhenPlayerJoins;


public final class PandaFactions extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "PandaHut Factions: Enabling...");
        getServer().getPluginManager().registerEvents(new Scoreboards(), this);
        getServer().getPluginManager().registerEvents(new ChangeColorCommand(), this);
        getServer().getPluginManager().registerEvents(new WhenPlayerJoins(), this);
        getServer().getPluginCommand("color").setExecutor(new ChangeColorCommand());
        getServer().getPluginCommand("colors").setExecutor(new ListColorsCommand());
        getServer().getPluginCommand("nick").setExecutor(new NicknameCommand());
        getServer().getPluginManager().registerEvents(new KillDeathEvent(), this);
        getServer().getPluginManager().registerEvents(new OneSleep(), this);
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "PandaHut Factions: Disabling...");
    }
}

package pandahut.pandafactions.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ListColorsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("The Available Colors are: " + "\n" + ChatColor.RED + "RED" + "\n" + ChatColor.BLUE + "BLUE" + "\n" + ChatColor.GOLD + "GOLD" + "\n" + ChatColor.GRAY + "GRAY" + "\n" + ChatColor.GREEN + "GREEN" + "\n" +
                    ChatColor.LIGHT_PURPLE + "PURPLE" + "\n" + ChatColor.DARK_GREEN + "DARK_GREEN" + "\n" + ChatColor.DARK_PURPLE + "DARK_PURPLE" + "\n" + ChatColor.YELLOW + "YELLOW" + "\n" + ChatColor.AQUA + "AQUA");
        }
        return true;
    }
}

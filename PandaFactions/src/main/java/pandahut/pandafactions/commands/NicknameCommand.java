package pandahut.pandafactions.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class NicknameCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length == 0) {
                player.sendMessage(ChatColor.RED + "Error: Incorrect use of command");
                return false;
            } else if(args.length == 1){
                player.setDisplayName("~" + args[0]);
                return true;
            } else if(args.length == 2) {
                int count = 0;
                for(Player onlinePlayers: Bukkit.getOnlinePlayers()) {
                    if(Bukkit.getPlayer(args[0]).getUniqueId() == onlinePlayers.getUniqueId()) {
                        count++;
                        break;
                    }
                }
                if(count == 0) {
                    player.sendMessage(ChatColor.RED + "Error: Invalid Name Input");
                    return false;
                } else {
                    if(args[0].equalsIgnoreCase("papahunter")) {
                        player.kickPlayer("You are not allowed to change my name!!!");
                    }
                    Player target = Bukkit.getPlayer(args[0]);
                    target.setDisplayName("~" + args[1]);
                    return true;
                }
            }
        }
        return false;
    }
}

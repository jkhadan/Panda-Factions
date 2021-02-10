package pandahut.pandafactions.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import pandahut.pandafactions.Variables;


public class ChangeColorCommand implements Listener, CommandExecutor {

    // Change Color Command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length == 0) {
                player.sendMessage(ChatColor.GREEN + "Please Choose a color. \nFor a list of colors, type /colors");
            } else if(args[0].equalsIgnoreCase("red")) {
                Variables.colors.replace(player.getUniqueId(), "red");
                player.sendMessage(ChatColor.GREEN + "Your chat color has been changed to" + ChatColor.RED + " red");
                return true;
            } else if(args[0].equalsIgnoreCase("blue")) {
                Variables.colors.replace(player.getUniqueId(), "blue");
                player.sendMessage(ChatColor.GREEN + "Your chat color has been changed to" + ChatColor.BLUE + " blue");
                return true;
            } else if(args[0].equalsIgnoreCase("gold")) {
                Variables.colors.replace(player.getUniqueId(), "gold");
                player.sendMessage(ChatColor.GREEN + "Your chat color has been changed to" + ChatColor.GOLD + " gold");
                return true;
            } else if(args[0].equalsIgnoreCase("gray")) {
                Variables.colors.replace(player.getUniqueId(), "gray");
                player.sendMessage(ChatColor.GREEN + "Your chat color has been changed to" + ChatColor.GRAY + " gray");
                return true;
            } else if(args[0].equalsIgnoreCase("green")) {
                Variables.colors.replace(player.getUniqueId(), "green");
                player.sendMessage(ChatColor.GREEN + "Your chat color has been changed to" + ChatColor.GREEN + " GREEN");
                return true;
            } else if(args[0].equalsIgnoreCase("purple")) {
                Variables.colors.replace(player.getUniqueId(), "purple");
                player.sendMessage(ChatColor.GREEN + "Your chat color has been changed to" + ChatColor.LIGHT_PURPLE + " purple");
                return true;
            } else if(args[0].equalsIgnoreCase("dark_green")) {
                Variables.colors.replace(player.getUniqueId(), "dark_green");
                player.sendMessage(ChatColor.GREEN +  "Your chat color has been changed to" + ChatColor.DARK_GREEN + " dark green");
                return true;
            } else if(args[0].equalsIgnoreCase("dark_purple")) {
                Variables.colors.replace(player.getUniqueId(), "dark_purple");
                player.sendMessage(ChatColor.GREEN + "Your chat color has been changed to" + ChatColor.DARK_PURPLE + " dark purple");
                return true;
            } else if(args[0].equalsIgnoreCase("yellow")) {
                Variables.colors.replace(player.getUniqueId(), "yellow");
                player.sendMessage(ChatColor.GREEN + "Your chat color has been changed to" + ChatColor.YELLOW + " yellow");
                return true;
            } else if(args[0].equalsIgnoreCase("aqua")) {
                Variables.colors.replace(player.getUniqueId(), "aqua");
                player.sendMessage(ChatColor.GREEN + "Your chat color has been changed to" + ChatColor.AQUA + " aqua");
                return true;
            } else {
                player.sendMessage(ChatColor.DARK_RED + "Error: Invalid Input");
                return false;
            }
        }
        return false;
    }
    // Chat Event
    @EventHandler
    public void onMessage(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if(Variables.colors.get(player.getUniqueId()).equalsIgnoreCase("red")) {
            event.setMessage(ChatColor.RED + event.getMessage());
        } else if(Variables.colors.get(player.getUniqueId()).equalsIgnoreCase("blue")) {
            event.setMessage(ChatColor.BLUE + event.getMessage());
        } else if(Variables.colors.get(player.getUniqueId()).equalsIgnoreCase("gold")) {
            event.setMessage(ChatColor.GOLD + event.getMessage());
        } else if(Variables.colors.get(player.getUniqueId()).equalsIgnoreCase("gray")) {
            event.setMessage(ChatColor.GRAY + event.getMessage());
        } else if(Variables.colors.get(player.getUniqueId()).equalsIgnoreCase("green")) {
            event.setMessage(ChatColor.GREEN + event.getMessage());
        } else if(Variables.colors.get(player.getUniqueId()).equalsIgnoreCase("purple")) {
            event.setMessage(ChatColor.LIGHT_PURPLE + event.getMessage());
        } else if(Variables.colors.get(player.getUniqueId()).equalsIgnoreCase("dark_green")) {
            event.setMessage(ChatColor.DARK_GREEN + event.getMessage());
        } else if(Variables.colors.get(player.getUniqueId()).equalsIgnoreCase("dark_purple")) {
            event.setMessage(ChatColor.DARK_PURPLE + event.getMessage());
        } else if(Variables.colors.get(player.getUniqueId()).equalsIgnoreCase("yellow")) {
            event.setMessage(ChatColor.YELLOW + event.getMessage());
        } else if(Variables.colors.get(player.getUniqueId()).equalsIgnoreCase("aqua")) {
            event.setMessage(ChatColor.AQUA + event.getMessage());
        } else {
            event.setMessage(ChatColor.RED + "Error");
        }
    }
}
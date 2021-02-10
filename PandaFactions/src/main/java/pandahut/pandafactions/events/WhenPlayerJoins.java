package pandahut.pandafactions.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pandahut.pandafactions.Variables;


public class WhenPlayerJoins implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Variables.colors.putIfAbsent(player.getUniqueId(), "gray");
        Variables.playerKills.putIfAbsent(player.getUniqueId(), 0);
        Variables.deaths.putIfAbsent(player.getUniqueId(), 0);
        event.setJoinMessage(player.getDisplayName() + ChatColor.GREEN + " has joined");
    }
}

package pandahut.pandafactions.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

import static org.bukkit.Bukkit.getServer;

public class OneSleep implements Listener {
    @EventHandler
    public void onSleep(PlayerBedEnterEvent event) {
        if(event.getBedEnterResult() == PlayerBedEnterEvent.BedEnterResult.OK) {
            String playerName = event.getPlayer().getDisplayName();
            Bukkit.broadcastMessage(playerName + ChatColor.GREEN + " has slept.");
            getServer().getWorlds().get(0).setTime(0);
            int random = (int) (Math.random()*180000)+12000;
            getServer().getWorlds().get(0).setClearWeatherDuration(random);
        }
    }
}

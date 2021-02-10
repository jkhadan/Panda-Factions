package pandahut.pandafactions.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import pandahut.pandafactions.Variables;

public class KillDeathEvent implements Listener {
    public void onKill(PlayerDeathEvent event) {
        Player player = event.getEntity();
        if(event.getEntity().getKiller() instanceof Player) {
            Player killer = player.getKiller();
            Variables.playerKills.replace(killer.getUniqueId(), Variables.playerKills.get(killer.getUniqueId())+1);
        }
        Variables.deaths.replace(player.getUniqueId(), Variables.deaths.get(player.getUniqueId())+1);
    }
}

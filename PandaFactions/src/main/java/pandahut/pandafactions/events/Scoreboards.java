package pandahut.pandafactions.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;
import pandahut.pandafactions.Variables;

public class Scoreboards implements Listener {

    @EventHandler
    public void onHealth(PlayerJoinEvent event)  {
        Player player = event.getPlayer();
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = manager.getNewScoreboard();
        Objective healthObjective = scoreboard.registerNewObjective("displayHealth", Criterias.HEALTH, ChatColor.DARK_RED + "❤");
        Objective sideObjective = scoreboard.registerNewObjective("stats", "dummy", ChatColor.GOLD + "" + ChatColor.BOLD + "Stats");
        Score kills = sideObjective.getScore(ChatColor.GREEN + "Kills: " + ChatColor.RED + Variables.playerKills.get(player.getUniqueId()));
        Score deaths = sideObjective.getScore(ChatColor.GREEN + "Deaths: " + ChatColor.RED + Variables.deaths.get(player.getUniqueId()));
        kills.setScore(11);
        deaths.setScore(9);
        healthObjective.setDisplaySlot(DisplaySlot.BELOW_NAME);
        sideObjective.setDisplaySlot(DisplaySlot.SIDEBAR);
        event.getPlayer().setScoreboard(scoreboard);
    }

}

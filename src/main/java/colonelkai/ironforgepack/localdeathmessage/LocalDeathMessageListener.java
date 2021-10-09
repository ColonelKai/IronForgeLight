package colonelkai.ironforgepack.localdeathmessage;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.ChatColor;

	/*
	I thought making death messages limited to 50 blocks
	would make RP much better during situations where
	death is important. So I just did it. 

	- Colonel_Kai
	*/

public class LocalDeathMessageListener implements Listener {
	@EventHandler(priority = EventPriority.HIGH)
	public void onPlayerDeath(PlayerDeathEvent e) {

		// store death message for later
		String deathMessage = e.getDeathMessage();
		// destroy the normal one
		e.setDeathMessage(null);

		// caching this would probably be a tiny bit faster
		Location loc = e.getEntity().getLocation();

		for(Player p : Bukkit.getOnlinePlayers()) {
			if(loc.distance(p.getLocation()) < 50) {
				// make it red and all for extra spook effect
				// don't ask why this has to be like this, it just has to be.
				p.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + deathMessage);
			}
		}
	}
}

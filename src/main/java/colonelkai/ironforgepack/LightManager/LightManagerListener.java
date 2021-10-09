package colonelkai.ironforgepack.LightManager;

import org.bukkit.block.Block;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;

import colonelkai.ironforgepack.IronForgePack;

import org.bukkit.entity.Monster;

public class LightManagerListener implements Listener {
	@EventHandler
    public void onEntitySpawn(CreatureSpawnEvent event) {
        if(event.getSpawnReason() != SpawnReason.NATURAL) {
            return;
        }

        LivingEntity livingEntity = event.getEntity();

        if(!(livingEntity instanceof Monster)) { // if not hostile
            return; // fuck you
        }

        Block block = livingEntity.getLocation().getBlock();

        if(block.getLightFromBlocks()!=0) {// if light level not 0
            event.setCancelled(true); // fuck you
        }
    }
}

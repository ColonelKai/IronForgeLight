package colonelkai.ironforgepack.pickaxemodifiers;

import java.util.List;
import java.util.Optional;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import colonelkai.ironforgepack.IronForgePack;

public class PickaxeModifierListener implements Listener {
	
    @EventHandler(priority = EventPriority.HIGH)
    public void onBlockBreak(BlockBreakEvent event) {
        ItemStack pickaxe = event.getPlayer().getInventory().getItemInMainHand(); // thank you bukkit

        List<PickaxeModifier> pMods = PickaxeModifiers.getModifiers();

        Optional<PickaxeModifier> optionalPMod = pMods
            .stream()
            .filter(pMod -> pMod.getPickaxe().getType().equals(pickaxe.getType()))
            .findAny();

        if(optionalPMod.isEmpty()) {
            return;
        }

        PickaxeModifier pMod = optionalPMod.get();

        if(pMod.canBreak(event.getBlock().getType())) {
            IronForgePack.logger.info("CanBreak Modifier Triggered.");
            IronForgePack.logger.info("EventBlockType: " + event.getBlock().getType());
            event.getBlock().getDrops().forEach(item -> {
                event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), item);
                IronForgePack.logger.info("Dropping: " + item.getType());
            });
            event.getBlock().setType(Material.AIR);
        } else if(pMod.cannotBreak(event.getBlock().getType())) {
            event.setDropItems(false);
        }
    }
}

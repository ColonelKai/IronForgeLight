package colonelkai.ironforgepack.weaponsearch;

import colonelkai.ironforgepack.IronForgePack;
import colonelkai.ironforgepack.plugin.modules.Module;
import org.bukkit.event.Listener;
import org.mose.command.BukkitCommandWrapper;

import java.util.HashMap;
import java.util.List;

public class WeaponSearchModule implements Module {
    @Override
    public void disable(IronForgePack ironforgepack) {

    }

    @Override
    public List<? extends Listener> getListeners() {
        return null;
    }

    @Override
    public HashMap<String, BukkitCommandWrapper> getCommands() {
        return null;
    }
}

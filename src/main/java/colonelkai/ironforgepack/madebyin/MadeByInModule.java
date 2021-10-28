package colonelkai.ironforgepack.madebyin;

import colonelkai.ironforgepack.IronForgePack;
import colonelkai.ironforgepack.madebyin.commands.MadeByCommand;
import colonelkai.ironforgepack.madebyin.commands.MadeInCommand;
import colonelkai.ironforgepack.plugin.modules.Module;
import org.bukkit.event.Listener;
import org.mose.command.BukkitCommandWrapper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MadeByInModule implements Module {
    @Override
    public void enable(IronForgePack ironforgepack) {
        Module.super.enable(ironforgepack);
    }

    @Override
    public void disable(IronForgePack ironforgepack) {

    }

    @Override
    public List<? extends Listener> getListeners() {
        return null;
    }

    @Override
    public HashMap<String, BukkitCommandWrapper> getCommands() {
        HashMap<String, BukkitCommandWrapper> hashMap = new HashMap<>();
        // MADEBY
        hashMap.put("MadeBy", new BukkitCommandWrapper(
            new MadeByCommand()
        ));
        // MADEIN
        hashMap.put("MadeIn", new BukkitCommandWrapper(
            new MadeInCommand()
        ));
        return hashMap;
    }
}

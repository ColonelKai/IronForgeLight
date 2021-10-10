package colonelkai.ironforgepack.nameswitcher;

import colonelkai.ironforgepack.IronForgePack;
import colonelkai.ironforgepack.plugin.modules.Module;
import colonelkai.ironforgepack.plugin.modules.ModuleID;
import org.bukkit.event.Listener;
import org.mose.command.ArgumentCommand;

import java.util.List;

public class NameSwitcherModule implements Module {
    ModuleID moduleID = ModuleID.NAMESWITCHER;

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
    public List<? extends ArgumentCommand> getCommands() {
        return null;
    }
}

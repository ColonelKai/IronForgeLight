package colonelkai.ironforgepack.PickaxeModifiers;

import colonelkai.ironforgepack.IronForgePack;
import colonelkai.ironforgepack.plugin.modules.Module;
import colonelkai.ironforgepack.plugin.modules.ModuleID;
import org.bukkit.event.Listener;

import java.util.List;

public class PickaxeModifierModule implements Module {
    ModuleID moduleID = ModuleID.PICKAXEMODIFIER;

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
}

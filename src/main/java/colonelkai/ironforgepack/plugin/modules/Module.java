package colonelkai.ironforgepack.plugin.modules;

import colonelkai.ironforgepack.IronForgePack;
import org.bukkit.event.Listener;
import org.mose.command.ArgumentCommand;
import org.mose.command.BukkitCommandWrapper;

import java.util.List;

public interface Module {
    public ModuleID moduleID = null;

    default void enable(IronForgePack ironforgepack) {
        this.getListeners()
                .forEach(
                        listener -> {
                            ironforgepack.getServer().getPluginManager()
                                    .registerEvents(listener, ironforgepack);
                        }
                );


    }

    void disable(IronForgePack ironforgepack);

    List<? extends Listener> getListeners();

    List<? extends ArgumentCommand> getCommands();
}

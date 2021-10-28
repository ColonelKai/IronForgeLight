package colonelkai.ironforgepack.plugin.modules;

import colonelkai.ironforgepack.IronForgePack;
import org.bukkit.event.Listener;
import org.mose.command.ArgumentCommand;
import org.mose.command.BukkitCommandWrapper;

import java.util.*;

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

        this.getCommands().forEach((k, v) ->
                Objects.requireNonNull(ironforgepack.getCommand(k)).setExecutor(v)
                );

    }

    void disable(IronForgePack ironforgepack);

    List<? extends Listener> getListeners();

    HashMap<String, BukkitCommandWrapper> getCommands();
}

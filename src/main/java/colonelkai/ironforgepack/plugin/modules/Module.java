package colonelkai.ironforgepack.plugin.modules;

import colonelkai.ironforgepack.IronForgePack;
import org.bukkit.event.Listener;

import java.util.List;

public interface Module {
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
}

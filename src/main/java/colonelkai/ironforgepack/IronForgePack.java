package colonelkai.ironforgepack;

import org.bukkit.plugin.java.JavaPlugin;

import colonelkai.ironforgepack.LightManager.LightManager;
import colonelkai.ironforgepack.PickaxeModifiers.PickaxeModifierListener;

public final class IronForgePack extends JavaPlugin {

    public static java.util.logging.Logger logger;

    @Override
    public void onEnable() {
        IronForgePack.logger = this.getLogger();

        this.getServer().getPluginManager().registerEvents(new PickaxeModifierListener(), this);
        this.getServer().getPluginManager().registerEvents(new LightManager(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}

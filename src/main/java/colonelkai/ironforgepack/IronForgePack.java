package colonelkai.ironforgepack;

import colonelkai.ironforgepack.plugin.modules.Modules;
import org.bukkit.plugin.java.JavaPlugin;

/*************************************************************************************
                                THINGS TO IMPLEMENT IN THE FUTURE

 todo A way to seal books
 todo Professions lol
 todo the madeby/madein feature

 *************************************************************************************/

public final class IronForgePack extends JavaPlugin {

    public static java.util.logging.Logger logger;

    @Override
    public void onEnable() {
        IronForgePack.logger = this.getLogger();
        enableModules();
    }

    private void enableModules() {
        Modules.set
                .forEach(module -> {
                    module.enable(this);
                    logger.info("Enabled Module: " + module.toString());
                        }
                    );
    }

}

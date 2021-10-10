package colonelkai.ironforgepack.plugin.modules.util;

import colonelkai.ironforgepack.IronForgePack;
import colonelkai.ironforgepack.plugin.Values.Values;
import colonelkai.ironforgepack.plugin.Values.Warnings;
import colonelkai.ironforgepack.plugin.modules.Module;
import colonelkai.ironforgepack.plugin.user.User;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public interface UserModuleData {
    HashMap<String, String> data = new HashMap<>();

    <T extends Module> T getModule();

    default void saveData(User user) {
        File file = new File(Values.playerDataFolderName
                + File.separator
                + user.getUuid() + ".yml");

        FileConfiguration fileConfig = YamlConfiguration.loadConfiguration(file);

        this.data.forEach((k, v) -> {
            fileConfig.set("module."+this.getModule().moduleID+"."+k, v);
        });

        try {
            fileConfig.save(file);
        } catch (IOException e) {
            IronForgePack.logger.warning(
                    Warnings.CANNOT_SAVE_UMD
                            + "\nUser: " + user.getUuid()
                            + "\nModule: " + this.getModule().toString()
                            + "\nError: " + e.getMessage()
            );
        }
    }

    default void loadData(User user) {

    }
}

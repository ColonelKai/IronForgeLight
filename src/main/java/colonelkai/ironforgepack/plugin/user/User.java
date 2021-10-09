package colonelkai.ironforgepack.plugin.user;

import colonelkai.ironforgepack.plugin.modules.util.UserModuleData;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class User {
    private UUID uuid;

    private final Set<? extends UserModuleData> userModuleDataSet = new HashSet<>();

    public void save() {
        this.userModuleDataSet.forEach(UserModuleData::saveData);
    }

    public void load() {
        this.userModuleDataSet.forEach(UserModuleData::loadData);
    }

    //<editor-fold desc="getters and setters">

    public UUID getUuid() {
        return uuid;
    }

    //</editor-fold>
}

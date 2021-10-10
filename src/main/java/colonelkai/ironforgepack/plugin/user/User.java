package colonelkai.ironforgepack.plugin.user;

import colonelkai.ironforgepack.plugin.modules.util.UserModuleData;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class User {
    private UUID uuid;

    private final Set<? extends UserModuleData> userModuleDataSet = new HashSet<>();

    public void save() {
        this.userModuleDataSet.forEach(umd -> umd.saveData(this));
    }

    public void load() {
        this.userModuleDataSet.forEach(umd -> umd.loadData(this));
    }

    //<editor-fold desc="getters and setters">

    public UUID getUuid() {
        return uuid;
    }

    //</editor-fold>
}

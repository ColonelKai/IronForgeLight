package colonelkai.ironforgepack.plugin.modules.util;

import colonelkai.ironforgepack.plugin.modules.Module;

import java.lang.reflect.Type;
import java.util.HashMap;

public interface UserModuleData {
    HashMap<String, String> data = new HashMap<>();

    <T extends Module> T getModule();

    void saveData();

    void loadData();
}

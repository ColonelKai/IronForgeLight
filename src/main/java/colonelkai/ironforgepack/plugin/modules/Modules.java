package colonelkai.ironforgepack.plugin.modules;

import colonelkai.ironforgepack.LightManager.LightManagerModule;
import colonelkai.ironforgepack.LocalDeathMessage.LocalDeathMessageModule;
import colonelkai.ironforgepack.PickaxeModifiers.PickaxeModifierModule;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface Modules {
    public final List<? extends Module> set = Arrays.asList(
            new LightManagerModule(),
            new LocalDeathMessageModule(),
            new PickaxeModifierModule()
    );
}

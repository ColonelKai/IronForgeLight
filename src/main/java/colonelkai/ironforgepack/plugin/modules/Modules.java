package colonelkai.ironforgepack.plugin.modules;

import colonelkai.ironforgepack.lightmanager.LightManagerModule;
import colonelkai.ironforgepack.localdeathmessage.LocalDeathMessageModule;
import colonelkai.ironforgepack.pickaxemodifiers.PickaxeModifierModule;

import java.util.Arrays;
import java.util.List;

public interface Modules {
    public final List<? extends Module> set = Arrays.asList(
            new LightManagerModule(),
            new LocalDeathMessageModule(),
            new PickaxeModifierModule()
    );
}

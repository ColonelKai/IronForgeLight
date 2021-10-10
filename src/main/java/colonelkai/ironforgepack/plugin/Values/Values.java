package colonelkai.ironforgepack.plugin.Values;

import colonelkai.ironforgepack.IronForgePack;

import java.io.File;

public interface Values {
    // A list of values that didn't warrant a class of their own,
    // So I just chucked them here

    // --- File Saving Stuff lol kill me ---
    static String playerDataFolderName = IronForgePack.getSelf()
            .getDataFolder() + File.separator + "playerdata";
}

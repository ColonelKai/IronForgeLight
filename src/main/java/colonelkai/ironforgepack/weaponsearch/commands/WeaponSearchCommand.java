package colonelkai.ironforgepack.weaponsearch.commands;

import org.jetbrains.annotations.NotNull;
import org.mose.command.ArgumentCommand;
import org.mose.command.CommandArgument;
import org.mose.command.arguments.collection.source.PlayerArgument;
import org.mose.command.context.CommandContext;

import java.util.List;
import java.util.Optional;

public class WeaponSearchCommand implements ArgumentCommand {
    private static final PlayerArgument PLAYER_ARGUMENT = new PlayerArgument("target");

    @Override
    public @NotNull List<CommandArgument<?>> getArguments() {
        return null;
    }

    @Override
    public @NotNull String getDescription() {
        return "/search <Player> \nSearch another players inventory for weapons.";
    }

    @Override
    public @NotNull Optional<String> getPermissionNode() {
        return Optional.of("ironforge.weaponsearch");
    }

    @Override
    public boolean run(CommandContext commandContext, String... args) {
        return true;
    }
}

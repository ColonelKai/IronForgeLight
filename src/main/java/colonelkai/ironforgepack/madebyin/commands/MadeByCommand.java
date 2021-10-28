package colonelkai.ironforgepack.madebyin.commands;

import org.jetbrains.annotations.NotNull;
import org.mose.command.ArgumentCommand;
import org.mose.command.CommandArgument;
import org.mose.command.arguments.operation.RemainingArgument;
import org.mose.command.arguments.simple.text.StringArgument;
import org.mose.command.context.CommandContext;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MadeByCommand implements ArgumentCommand {
    public static final RemainingArgument<String> REMAINING_ARGUMENT =
            new RemainingArgument<String>("madeby", new StringArgument(""));

    @Override
    public @NotNull List<CommandArgument<?>> getArguments() {
        return List.of(
                REMAINING_ARGUMENT
        );
    }

    @Override
    public @NotNull String getDescription() {
        return "";
    }

    @Override
    public @NotNull Optional<String> getPermissionNode() {
        return Optional.empty();
    }

    @Override
    public boolean run(CommandContext commandContext, String... args) {
        return false;
    }
}

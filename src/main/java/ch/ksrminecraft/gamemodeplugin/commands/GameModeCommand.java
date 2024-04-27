package ch.ksrminecraft.gamemodeplugin.commands;

import net.kyori.adventure.text.Component;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GameModeCommand implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage(Component.text("Du musst ein Spieler sein, um den Gamemode zu wechseln"));
            return true;
        }

        Player player = (Player) sender;

        // /gmode creative

        if (args[0].equalsIgnoreCase("creative")) {
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage(Component.text("Du bist jetzt im GameMode Creative"));
        } else if (args[0].equalsIgnoreCase("survival")) {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage(Component.text("Du bist jetzt im GameMode Survival"));
        } else if (args[0].equalsIgnoreCase("spectator")) {
            player.setGameMode(GameMode.SPECTATOR);
            player.sendMessage(Component.text("Du bist nun im Gamemode Spectator"));
        } else if (args[0].equalsIgnoreCase("adventure")) {
            player.setGameMode(GameMode.ADVENTURE);
            player.sendMessage(Component.text("Du bist nun im Gamemode Adventure"));
        } else {
            player.sendMessage(Component.text("Der Befehl ist ungültig."));
        }

        return true;
    }
}

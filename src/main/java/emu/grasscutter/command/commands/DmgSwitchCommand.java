package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.data.GameData;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.player.PlayerProgressManager;
import emu.grasscutter.server.packet.send.PacketOpenStateChangeNotify;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static emu.grasscutter.utils.Language.translate;

@Command(label = "dmgswitch", usage = {""}, permission = "player.unlockall", permissionTargeted = "player.unlockall.others")
public final class DmgSwitchCommand implements CommandHandler {

    public static boolean DealDmg = true;

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        DealDmg = !DealDmg;
        CommandHandler.sendMessage(sender, DealDmg + "");
    }
}

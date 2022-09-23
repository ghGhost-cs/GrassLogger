package emu.grasscutter.command.commands;

import emu.grasscutter.GameConstants;
import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.data.GameData;
import emu.grasscutter.data.GameDepot;
import emu.grasscutter.data.excels.AvatarData;
import emu.grasscutter.data.excels.ItemData;
import emu.grasscutter.data.excels.ReliquaryAffixData;
import emu.grasscutter.data.excels.ReliquaryMainPropData;
import emu.grasscutter.game.avatar.Avatar;
import emu.grasscutter.game.inventory.GameItem;
import emu.grasscutter.game.inventory.ItemType;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.props.ActionReason;
import emu.grasscutter.game.props.FightProperty;
import emu.grasscutter.utils.SparseSet;

import java.util.ArrayList;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Command(
    label = "givesalt",
    usage = {""},
    permission = "player.give",
    permissionTargeted = "player.give.others",
    threading = true)
public final class GiveSaltCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        // give all lvl90 c0 chars
        for (AvatarData avatarData : GameData.getAvatarDataMap().values()) {
            // Exclude test avatars
            int id = avatarData.getId();
            if (id < 10000002 || id >= 11000000) continue;

            // Don't try to add each avatar to the current team
            sender.addAvatar(makeAvatar(avatarData, 90, 6, 0), false);
        }
        List<GameItem> itemList = new ArrayList<>();
        // give all cons for chars as items
        for (ItemData itemdata : GameData.getItemDataMap().values()) {
            int id = itemdata.getId();
            if (id < 1100 || id > 1200) continue;  // all 'Stella Fortuna' fall in this range
            for (int i = 0; i < 6; i++) {
                itemList.add(new GameItem(itemdata));
            }
        }
        // give all lvl90 r1-5 weapons
        for (ItemData itemdata : GameData.getItemDataMap().values()) {
            int id = itemdata.getId();
            if (id < 11100 || id > 16000) continue;  // All extant weapons are within this range
            if (illegalWeaponIds.contains(id)) continue;
            if (!itemdata.isEquip()) continue;
            if (itemdata.getItemType() != ItemType.ITEM_WEAPON) continue;

            for (int i = 0; i < 5; i++) {
                GameItem item = new GameItem(itemdata);
                item.setLevel(90);
                item.setPromoteLevel(6);
                item.setRefinement(i);
                itemList.add(item);
            }
        }
        addItemsChunked(sender, itemList, 100);
    }

    private static Avatar makeAvatar(AvatarData avatarData, int level, int promoteLevel, int constellation) {
        Avatar avatar = new Avatar(avatarData);
        avatar.setLevel(level);
        avatar.setPromoteLevel(promoteLevel);
        avatar.forceConstellationLevel(constellation);
        avatar.recalcStats();
        return avatar;
    }

    private static void addItemsChunked(Player player, List<GameItem> items, int packetSize) {
        // Send the items in multiple packets
        int lastIdx = items.size() - 1;
        for (int i = 0; i <= lastIdx; i += packetSize) {
            player.getInventory().addItems(items.subList(i, Math.min(i + packetSize, lastIdx)));
        }
    }

    private static final SparseSet illegalWeaponIds = new SparseSet("""
        10000-10008, 11411, 11506-11508, 12505, 12506, 12508, 12509,
        13503, 13506, 14411, 14503, 14505, 14508, 15504-15506
        """);
}

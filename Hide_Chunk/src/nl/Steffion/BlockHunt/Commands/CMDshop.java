package nl.Steffion.BlockHunt.Commands;

import nl.Steffion.BlockHunt.Arena;
import nl.Steffion.BlockHunt.ConfigC;
import nl.Steffion.BlockHunt.InventoryHandler;
import nl.Steffion.BlockHunt.W;
import nl.Steffion.BlockHunt.Managers.MessageM;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class CMDshop extends DefaultCMD {

	@Override
	public boolean exectue(Player player, Command cmd, String label,
			String[] args) {

		Arena arena = null;
		for (Arena arena2 : W.arenaList) {
			if (arena2.playersInArena != null) {
				if (arena2.playersInArena.contains(player)) {
					arena = arena2;
				}
			}
		}
		if (arena != null) {
			InventoryHandler.openShop(player);
		} else {
			MessageM.sendFMessage(player,
					ConfigC.error_notInArena);
		}
		return true;
	}
}

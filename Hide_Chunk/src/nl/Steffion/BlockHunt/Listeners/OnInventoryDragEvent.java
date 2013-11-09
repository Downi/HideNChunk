package nl.Steffion.BlockHunt.Listeners;

import java.util.ArrayList;

import nl.Steffion.BlockHunt.Arena;
import nl.Steffion.BlockHunt.ArenaHandler;
import nl.Steffion.BlockHunt.W;
import nl.Steffion.BlockHunt.Managers.MessageM;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class OnInventoryDragEvent implements Listener {

	@EventHandler(priority = EventPriority.NORMAL)
	public void onInventoryDragEvent(InventoryDragEvent event) {
		Inventory inv = event.getInventory();
		if (inv.getType().equals(InventoryType.CHEST)) {
			if (inv.getName().contains("Shopblocks")) {
				//TODO
			}
		} 
	}

	public void save(Arena arena) {
		W.arenas.getFile().set(arena.arenaName, arena);
		W.arenas.save();
		ArenaHandler.loadArenas();
	}
}

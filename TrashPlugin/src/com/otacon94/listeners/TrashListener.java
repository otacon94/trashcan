package com.otacon94.listeners;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class TrashListener implements CommandExecutor  {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("You must be a  Player to use this command!");
			return false;
		}
		Player player = (Player) sender;
		if( player.hasPermission("trashplugin.use") ){
			Inventory inventory = Bukkit.createInventory(player, 36, "Trashcan");              
			player.openInventory(inventory);
			return true;
		}
		return false;
	}

}

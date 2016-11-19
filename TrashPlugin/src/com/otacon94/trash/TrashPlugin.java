package com.otacon94.trash;

import org.bukkit.plugin.java.JavaPlugin;

import com.otacon94.listeners.TrashListener;


public class TrashPlugin extends JavaPlugin {

	private static final String COMMAND1 = "cestino";
	private static final String COMMAND2 = "trash";
	
	@Override
	public void onEnable() {
		getLogger().info("OtaconTrashPlugin is now Enabled");
		getCommand(COMMAND1).setExecutor(new TrashListener());
		getCommand(COMMAND2).setExecutor(new TrashListener());
	}
	
	
	@Override
	public void onDisable() {
		getLogger().info("OtaconTrashPlugin is now Disabled");
	}

}

package com.justinschaaf.eventcanceller;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class EventCancellerPlugin extends JavaPlugin {

	FileConfiguration config = getConfig();
	
	@Override
	public void onEnable() {
		
		config.addDefault("creativeOverride", true);
		
		config.addDefault("errorMessagesEnabled", true);
		config.addDefault("errorMessageGeneric", "§4You can't do that!");
		
		config.addDefault("cancelInventoryOpen", true);
		config.addDefault("cancelInventoryOpenMessage", null);
		
		config.addDefault("cancelItemCraft", true);
		config.addDefault("cancelItemCraftMessage", null);
		
		config.addDefault("cancelItemDrop", true);
		config.addDefault("cancelItemDropMessage", null);
		
		config.addDefault("cancelItemPickup", true);
		config.addDefault("cancelItemPickupMessage", "");
		
		config.addDefault("cancelArrowPickup", false);
		config.addDefault("cancelArrowPickupMessage", "");
		
		config.addDefault("cancelPotionConsume", true);
		config.addDefault("cancelPotionConsumeMessage", null);
		
		config.addDefault("cancelItemConsume", false);
		config.addDefault("cancelItemConsumeMessage", null);
		
		config.addDefault("cancelItemDamage", true);
		config.addDefault("cancelItemDamageMessage", "");
		
		config.addDefault("cancelBedEnter", true);
		config.addDefault("cancelBedEnterMessage", null);
		
		getServer().getPluginManager().registerEvents(new EventListeners(this), this);
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
}

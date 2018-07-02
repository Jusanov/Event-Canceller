package net.jusanov.eventcanceller;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.event.player.PlayerPickupArrowEvent;
import org.bukkit.inventory.ItemStack;

public class EventListeners implements Listener {

	EventCancellerPlugin plugin;
	public EventListeners(EventCancellerPlugin instance) {
		plugin = instance;
	}
	
	@EventHandler
	public void onInventoryOpen(InventoryOpenEvent event) {
		
		String configPath = "cancelInventoryOpen";
		
		if (plugin.getConfig().getBoolean(configPath)) {
			
			event.setCancelled(true);
			
			errorMessageHandler(event.getPlayer(), configPath);
			
		}
		
	}
	
	@EventHandler
	public void onItemCraft(CraftItemEvent event) {
		
		String configPath = "cancelItemCraft";
		
		if (plugin.getConfig().getBoolean(configPath)) {
			
			event.setCancelled(true);
			
			errorMessageHandler(event.getWhoClicked(), configPath);
			
		}
		
	}
	
	@EventHandler
	public void onItemDrop(PlayerDropItemEvent event) {
		
		String configPath = "cancelItemDrop";
		
		if (plugin.getConfig().getBoolean(configPath)) {
			
			event.setCancelled(true);
			
			errorMessageHandler(event.getPlayer(), configPath);
			
		}
		
	}
	
	@EventHandler
	public void onItemPickup(EntityPickupItemEvent event) {
		
		if (event.getEntityType() == EntityType.PLAYER) {
		
			String configPath = "cancelItemPickup";
			
			if (plugin.getConfig().getBoolean(configPath)) {
				
				event.setCancelled(true);
				
				errorMessageHandler((HumanEntity) event.getEntity(), configPath);
				
			}
		
		}
		
	}
	
	@EventHandler
	public void onArrowPickup(PlayerPickupArrowEvent event) {
		
		String configPath = "cancelArrowPickup";
		
		if (plugin.getConfig().getBoolean(configPath)) {
			
			event.setCancelled(true);
			
			errorMessageHandler(event.getPlayer(), configPath);
			
		}
		
	}
	
	@EventHandler
	public void onItemConsume(PlayerItemConsumeEvent event) {
		
		String configPath1 = "cancelItemConsume";
		String configPath2 = "cancelPotionConsume";
		
		if (plugin.getConfig().getBoolean(configPath1)) {
			
			event.setCancelled(true);
			
			errorMessageHandler(event.getPlayer(), configPath1);
			
		} else if (plugin.getConfig().getBoolean(configPath2)) {
			
			if (event.getItem() == new ItemStack(Material.POTION)) {
				
				event.setCancelled(true);
				
				errorMessageHandler(event.getPlayer(), configPath2);
				
			}
			
		}
		
	}
	
	@EventHandler
	public void onItemDamage(PlayerItemDamageEvent event) {
		
		String configPath = "cancelItemDamage";
		
		if (plugin.getConfig().getBoolean(configPath)) {
			
			event.setCancelled(true);
			
			errorMessageHandler(event.getPlayer(), configPath);
			
		}
		
	}
	
	@EventHandler
	public void onBedEnter(PlayerBedEnterEvent event) {
		
		String configPath = "cancelBedEnter";
		
		if (plugin.getConfig().getBoolean(configPath)) {
			
			event.setCancelled(true);
			
			errorMessageHandler(event.getPlayer(), configPath);
			
		}
		
	}
	
	private void errorMessageHandler(HumanEntity player, String configPath) {
		
		if (plugin.getConfig().getBoolean("errorMessagesEnabled")) {
			
			if (plugin.getConfig().getString(configPath + "Message") != null) {
				player.sendMessage(plugin.getConfig().getString(configPath + "Message"));
			} else {
				plugin.getConfig().getString("errorMessageGeneric");
			}
			
		}
		
	}
	
}

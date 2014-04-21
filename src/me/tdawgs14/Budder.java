package me.tdawgs14;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Budder extends JavaPlugin {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED+"Player Only!");
			return true;
		}
		
		Player p = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("budder")) {
			ItemStack budder = new ItemStack(Material.GOLD_INGOT, 64);
			ItemMeta meta = budder.getItemMeta();
			meta.setDisplayName(ChatColor.GOLD+"Budder!!");
			budder.setItemMeta(meta);
			p.getInventory().addItem(budder);
			p.getWorld().playSound(p.getLocation(), Sound.FIZZ, 2, 1);
			return true;
		}
		return true;
	}

}

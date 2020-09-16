package nl.wifivibes.gamemodepl;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

public enum GM {
	
	CREATIVE,
	SURVIVAL,
	ADVENTURE,
	SPECTATOR,
	FLY;
	
	public static void changeGamemode(GM gamemode, Player p) {
		switch(gamemode) {
		case CREATIVE :
			p.setGameMode(GameMode.CREATIVE);
			p.sendMessage(ChatColor.GOLD + "Jouw gamemode is veranderd naar Creative!");
			break;
		case SURVIVAL :
			p.setGameMode(GameMode.SURVIVAL);
			p.sendMessage(ChatColor.GOLD + "Jouw gamemode is veranderd naar Survival!");
			break;
		case ADVENTURE :
			p.setGameMode(GameMode.ADVENTURE);
			p.sendMessage(ChatColor.GOLD + "Jouw gamemode is veranderd naar Adventure!");
			break;
		case SPECTATOR :
			p.setGameMode(GameMode.SPECTATOR);
			p.sendMessage(ChatColor.GOLD + "Jouw gamemode is veranderd naar Spectator!");
			break;
		case FLY :
			p.setAllowFlight(true);
			p.setFlying(true);
			p.sendMessage(ChatColor.GOLD + "Vliegen aangedaan");
			break;
		}
	}

}
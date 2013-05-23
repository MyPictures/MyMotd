package me.mypictures.mymotd;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.server.ServerListPingEvent;

public final class MyMotd extends JavaPlugin implements Listener {

	@Override
	public void onEnable(){
		getLogger().info("MyMotd successfully enabled!");
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler
	public void onServerListPing(ServerListPingEvent event){
		event.setMotd("MyPictures plugin was here!");
	}
	
	@Override
	public void onDisable() {
		getLogger().info("MyMotd successfully disabled!");
	}
	
}
package org.MultiNet.Multibukkit;

import org.MultiNet.Multibukkit.config;

import net.minestom.server.MinecraftServer;
import net.minestom.server.coordinate.Pos;
import net.minestom.server.entity.Player;
import net.minestom.server.event.GlobalEventHandler;
import net.minestom.server.event.player.AsyncPlayerConfigurationEvent;
import net.minestom.server.instance.InstanceContainer;
import net.minestom.server.instance.InstanceManager;
import net.minestom.server.instance.block.Block;
import org.apache.commons.lang.Validate;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginLoadOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.file
    
public class start {
    private static final MinestomServer server = new MinestomServer();

    public static final Logger logger = LoggerFactory.getLogger(Main.class);
    public void what() {
        System.out.println("loading MultiBukkit. Please Wait...");
        logger.info("loading...");
        
        config config = new config();
        System.out.println("Loading Bukkit Plugins...")
            Bukkit.setServer(server);
            server.loadPlugins();
        // Initialization
        System.out.println(Enabling Bukkit.);
        server.enablePlugins(PluginLoadOrder.STARTUP);
        MinecraftServer minecraftServer = MinecraftServer.init();
        InstanceManager instanceManager = MinecraftServer.getInstanceManager();
        // Create the instance
        InstanceContainer instanceContainer = instanceManager.createInstanceContainer();
        // Set the ChunkGenerator
        instanceContainer.setGenerator(unit ->
                unit.modifier().fillHeight(0, 40, Block.GRASS_BLOCK));
        // Add an event callback to specify the spawning instance (and the spawn position)
        GlobalEventHandler globalEventHandler = MinecraftServer.getGlobalEventHandler();
        globalEventHandler.addListener(AsyncPlayerConfigurationEvent.class, event -> {
            final Player player = event.getPlayer();
            event.setSpawningInstance(instanceContainer);
            player.setRespawnPoint(new Pos(0, 42, 0));
        });

        
        minecraftServer.start( "0.0.0.0", config.port);
        server.enablePlugins(PluginLoadOrder.POSTWORLD);
    }
}

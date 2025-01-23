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
    private static final MultiServer server = new MultiServer();

    public static final Logger logger = LoggerFactory.getLogger(Main.class);
    public void what() {
        System.out.println("멀티버킷 알파 불러오는 중. (바닐라 월드가 준비가 되지 않아 평면 상태로 월드를 생성합니다.)");
        config config = new config();
        System.out.println("플러그인 불러오는 중...")
            Bukkit.setServer(server);
            server.loadPlugins();
        // Initialization
        System.out.println("플러그인 활성화 단계 준비");
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
        System.out.println("서버를 시작합니다.");
        minecraftServer.start("0.0.0.0", config.port);
        System.out.println("월드 플러그인 활성화 단계 준비")
        server.enablePlugins(PluginLoadOrder.POSTWORLD);
        System.out.println("시작!")
    }
}

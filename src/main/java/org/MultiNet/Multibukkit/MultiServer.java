import com.destroystokyo.paper.entity.ai.MobGoals
import com.destroystokyo.paper.profile.PlayerProfile
import net.kyori.adventure.audience.Audience
import net.kyori.adventure.text.Component
import net.minestom.server.MinecraftServer
import net.minestom.server.adventure.audience.Audiences
import net.minestom.server.extras.MojangAuth
import org.bukkit.*
import org.bukkit.advancement.Advancement
import org.bukkit.block.data.BlockData
import org.bukkit.boss.*
import org.MultiNet.Multibukkit.command.MinestomCommandMap
import org.MultiNet.Multibukkit.entity.MinestomPlayer
import org.bukkit.entity.Entity
import org.bukkit.entity.Player
import org.bukkit.event.inventory.InventoryType
import org.bukkit.generator.ChunkGenerator
import org.bukkit.help.HelpMap
import org.bukkit.inventory.*
import org.bukkit.loot.LootTable
import org.bukkit.map.MapView
import org.bukkit.permissions.Permission
import org.bukkit.plugin.*
import org.bukkit.plugin.java.JavaPluginLoader
import org.bukkit.plugin.messaging.Messenger
import org.bukkit.plugin.messaging.StandardMessenger
import org.bukkit.scheduler.BukkitScheduler
import org.bukkit.scoreboard.ScoreboardManager
import org.bukkit.util.CachedServerIcon
import org.MultiNet.Multibukkit.scheduler.MinestomScheduler
import org.MultiNet.Multibukkit.util.MinestomUnsafeValues
import java.awt.image.BufferedImage
import java.io.File
import java.util.*
import java.util.function.Consumer
import java.util.logging.Level
import java.util.logging.Logger
import net.minestom.server.command.builder.CommandDispatcher
import net.minestom.server.data.DataImpl
import org.bukkit.command.*
import org.MultiNet.Multibukkit.command.CommandSender
import org.MultiNet.Multibukkit.command.ConsoleCommandSender
import world.cepi.kstom.Manager
import world.cepi.kstom.Manager.data
import world.cepi.kstom.command.register
import world.cepi.kstom.command.unregister
import world.cepi.kstom.data.data

public class MultiServer implements Server {
    private MinestomCommandMap commandMap = new MinestomCommandMap(this);
    private SimplePluginManager pluginManager = new SimplePluginManager(this, commandMap);
    private Logger logger = Logger.getLogger("Minecraft");
    private MinestomHelpMap helpMap = new MinestomHelpMap(this);
    private StandardMessenger messenger = new StandardMessenger();
    private SimpleServicesManager servicesManager = new SimpleServicesManager();
    private MinestomScheduler scheduler = new MinestomScheduler();

    // Override methods here...

    @Override
    public void sendPluginMessage(Plugin source, String channel, byte[] message) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public MutableSet<String> getListeningPluginChannels() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

  @Override
public MutableIterable<Audience> audiences() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public String getName() {
    return MinecraftServer.getBrandName();
}

@Override
public String getVersion() {
    return MinecraftServer.VERSION_NAME;
}

@Override
public String getBukkitVersion() {
    return MinecraftServer.VERSION_NAME;
}

@Override
public String getMinecraftVersion() {
    return MinecraftServer.VERSION_NAME;
}

@Override
public MutableCollection<Player> getOnlinePlayers() {
    return Collections.unmodifiableList(MinecraftServer.getConnectionManager().getOnlinePlayers().stream().map(MinestomPlayer::new).collect(Collectors.toList()));
}

@Override
public int getMaxPlayers() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public void setMaxPlayers(int maxPlayers) {
    throw new UnsupportedOperationException("Not yet implemented");
}
  @Override
public int getPort() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public int getViewDistance() {
    return MinecraftServer.getChunkViewDistance();
}

@Override
public String getIp() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public String getWorldType() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public boolean getGenerateStructures() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public int getMaxWorldSize() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public boolean getAllowEnd() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public boolean getAllowNether() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public boolean hasWhitelist() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public void setWhitelist(boolean value) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public MutableSet<OfflinePlayer> getWhitelistedPlayers() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public void reloadWhitelist() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public int broadcastMessage(String message) {
    Audiences.all().sendMessage(Component.text(message));
    return 1; // TODO actually return a useful value
}

@Override
public String getUpdateFolder() {
    return "update"; // TODO add to configuration
}

@Override
public File getUpdateFolderFile() {
    return new File("./plugins/update"); // TODO add to configuration
}

@Override
public long getConnectionThrottle() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public int getTicksPerAnimalSpawns() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public int getTicksPerMonsterSpawns() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public int getTicksPerWaterSpawns() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public int getTicksPerWaterAmbientSpawns() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public int getTicksPerAmbientSpawns() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public Player getPlayer(String name) {
    return MinecraftServer.getConnectionManager().findPlayer(name) != null ? new MinestomPlayer(MinecraftServer.getConnectionManager().findPlayer(name)) : null;
}

@Override
public Player getPlayer(UUID id) {
    return MinecraftServer.getConnectionManager().getPlayer(id) != null ? new MinestomPlayer(MinecraftServer.getConnectionManager().getPlayer(id)) : null;
}

@Override
public Player getPlayerExact(String name) {
    return MinecraftServer.getConnectionManager().getPlayer(name) != null ? new MinestomPlayer(MinecraftServer.getConnectionManager().getPlayer(name)) : null;
}

@Override
public MutableList<Player> matchPlayer(String name) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public UUID getPlayerUniqueId(String playerName) {
    return getPlayer(playerName) != null ? getPlayer(playerName).getUniqueId() : null;
}

@Override
public PluginManager getPluginManager() {
    return pluginManager;
}

@Override
public BukkitScheduler getScheduler() {
    return scheduler;
}

@Override
public ServicesManager getServicesManager() {
    return servicesManager;
}

@Override
public MutableList<World> getWorlds() {
    return Manager.instance.instances.stream().map(instance -> {
        if (instance.data == null) {
            instance.data = data -> {
                data.put(worldKey, new MinestomWorld(instance));
            };
        }
        return instance.data.get(worldKey);
    }).collect(Collectors.toCollection(ArrayList::new));
}

@Override
public World createWorld(WorldCreator creator) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public boolean unloadWorld(String name, boolean save) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public boolean unloadWorld(World world, boolean save) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public World getWorld(String name) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public World getWorld(UUID uid) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public World getWorld(NamespacedKey worldKey) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public MapView getMap(int id) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public MapView createMap(World world) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public ItemStack createExplorerMap(World world, Location location, StructureType structureType) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public ItemStack createExplorerMap(World world, Location location, StructureType structureType, int radius, boolean findUnexplored) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public void reload() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public void reloadData() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public Logger getLogger() {
    return logger;
}

@Override
public PluginCommand getPluginCommand(String name) {
    Command command = commandMap.getCommand(name);
    return command instanceof PluginCommand ? (PluginCommand) command : null;
}

@Override
public void savePlayers() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public boolean dispatchCommand(CommandSender sender, String commandLine) {
    if (commandMap.dispatch(sender, commandLine)) {
        return true;
    }
    if (sender instanceof Player) {
        sender.sendMessage("Unknown command. Type \"/help\" for help.");
    } else {
        sender.sendMessage("Unknown command. Type \"help\" for help.");
    }
    return false;
}

@Override
public boolean addRecipe(Recipe recipe) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public MutableList<Recipe> getRecipesFor(ItemStack result) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public Recipe getRecipe(NamespacedKey recipeKey) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public MutableIterator<Recipe> recipeIterator() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public void clearRecipes() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public void resetRecipes() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public boolean removeRecipe(NamespacedKey key) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public MutableMap<String, Array<String>> getCommandAliases() {
    // TODO commands configuration
    return new LinkedHashMap<>();
}

@Override
public int getSpawnRadius() {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public void setSpawnRadius(int value) {
    throw new UnsupportedOperationException("Not yet implemented");
}

@Override
public boolean getOnlineMode() {
    return MojangAuth.isEnabled();
}

@Override
public boolean getAllowFlight() {
    throw new UnsupportedOperationException("Not yet implemented");
}
    // ... and so on for the rest of the methods
}

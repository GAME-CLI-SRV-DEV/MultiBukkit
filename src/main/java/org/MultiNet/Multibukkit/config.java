package org.MultiNet.Multibukkit;

import net.kyori.adventure.text.Component;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;

public class config {
    private static final String PROPERTIES_FILE_NAME = "server.properties";

    public final Component motd;
    public final int port;
    public final boolean fastMode;
    public final boolean onlineMode;
    public final int ipv6port;
    public final boolean dualstack;
    public config() throws RuntimeException {
        initProperties();
        String jarPath = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent();
        Path propertiesFilePath = Paths.get(jarPath, PROPERTIES_FILE_NAME);
        Properties serverProperties = new Properties();
        try {
            serverProperties.load(new FileInputStream(String.valueOf(propertiesFilePath)));
            this.dualstack = Boolean.parseBoolean(serverProperties.getProperty("dualstack" , String.valueOf(true)));
            this.ipv6port = Integer.parseInt(serverProperties.getProperty("ipv6port", String.valueOf(25565)));
            this.port = Integer.parseInt(serverProperties.getProperty("port", String.valueOf(25565)));
            this.motd = Component.text(serverProperties.getProperty("motd", "your first server"));
            this.fastMode = Boolean.parseBoolean(serverProperties.getProperty("fast-mode", "false"));
            this.onlineMode = Boolean.parseBoolean(serverProperties.getProperty("online-mode", "true"));
        } catch (IOException | NumberFormatException e) {
            throw new RuntimeException("Failed to read server.properties", e);
        }
    }

    private void initProperties() {
        String jarPath = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent();
        Path propertiesFilePath = Paths.get(jarPath, PROPERTIES_FILE_NAME);
        if (!Files.exists(propertiesFilePath)) {
            try (InputStream propertiesStream = Main.class.getResourceAsStream("/"+PROPERTIES_FILE_NAME)) {
                if (propertiesStream != null) {
                    Files.copy(propertiesStream, propertiesFilePath, StandardCopyOption.REPLACE_EXISTING);
                }
            } catch (IOException e) {
                start.logger.error("Could not create server.properties file. Exiting.", e);
                System.exit(1);
            }
        }
    }


}

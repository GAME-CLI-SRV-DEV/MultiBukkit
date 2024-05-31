package org.MultiNet.Multibukkit;

import java.text.MessageFormat;
import java.util.*;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
// import org.bukkit.ChatColor; bye bye chat colorip
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.Component;

public class translationmanager {
    private static Locale locale;
    private static ResourceBundle bundle;
    private static final MiniMessage miniMessage = MiniMessage.builder().build();

    public translationmanager(String languageTag) {
        locale = Locale.forLanguageTag(languageTag);
        bundle = ResourceBundle.getBundle("translations", locale);
    }

    public static String translate(String key, Object... params) {
        if (bundle.containsKey(key)) {
            String format = bundle.getString(key);
            String message = MessageFormat.format(format, params);
            if (key.startsWith("cc_")) { // Adventure API usage // Bukkit API ChatColor-Adventure API Minimessage Multi-Using // NogyangSpigot
                return translateColorCodesWithChatColor(message); // Bukkit ChatColor-Adventure API Minimessage Multi-Using // NogyangSpigot
            } else if (key.startsWith("mm_")) { // Adventure API usage // Bukkit API ChatColor-Adventure API Minimessage Multi-Using // NogyangSpigot
                return translateColorCodesWithMiniMessage(message); // Bukkit ChatColor-Adventure API Minimessage Multi-Using // NogyangSpigot
            } else {
                return message;
            }
        } else {
            // Key not found in translations
            return key;
        }
    }


    private static String translateColorCodesWithChatColor(String message) {
        Component component = LegacyComponentSerializer.legacy('&').deserialize(message);
        return LegacyComponentSerializer.legacy('&').serialize(component);


    }

    private static String translateColorCodesWithMiniMessage(String message) {
        Component component = miniMessage.deserialize(message);
        return component.toString();  // You might need to adjust this line depending on how you want to use the translated message
    }
}

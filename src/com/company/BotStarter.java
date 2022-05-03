package com.company;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class BotStarter {
    public static JDA jda;
    public static String prefix = ".";

    public static void main(String[] args) throws LoginException {
        jda = JDABuilder.createDefault("OTcwOTUwNzA4OTA2MDYxODU1.GssEPX.tEeLW3dh0pGZiA6hoPSziYFJhNdmKnyHRhiFG0").build();

        jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
        jda.getPresence().setActivity(Activity.watching("Monkeys dancing"));
        jda.addEventListener(new Commands());
    }
}

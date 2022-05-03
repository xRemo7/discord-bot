package com.company;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(BotStarter.prefix + "hello")) {
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage("Hey there, I'm alive.").queue();
        }


        else if (args[0].equalsIgnoreCase(BotStarter.prefix + "info")) {
            EmbedBuilder info = new EmbedBuilder();
            info.setTitle("Testarea 🤖 Information");
            info.setDescription("Completely useless information about a useless bot called robo");
            info.setColor(0xf45642);
            info.setFooter("Created by Remo Aeberli", event.getMember().getUser().getAvatarUrl());
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessageEmbeds(info.build()).queue();
            info.clear();
        }

    }
}

package commands;

import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class userinfo extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
        String[] message = e.getMessage().getContentRaw().split(" ");

        if (message.length == 1 && message[0].equalsIgnoreCase("$user")) {
            e.getChannel().sendMessage("to use this command use: $user [name]").queue();
        } else if (message.length == 2 && message[0].equalsIgnoreCase("$user")) {
            String username = message[1];
            EmbedBuilder eb = new EmbedBuilder();
            eb.setTitle(username + "'s Info");
            eb.addField("Name", e.getAuthor().getName(), true);
            eb.setThumbnail(e.getAuthor().getAvatarUrl());
        }
    }
}

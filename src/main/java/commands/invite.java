package commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class invite extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] message = event.getMessage().getContentRaw().split(" ");
        int time = 3600;
         if (message[0].equalsIgnoreCase("$invite") && message.length == 1){
             event.getChannel().sendMessage("To use $invite do: $invite create").queue();
         } else if (message[0].equalsIgnoreCase("$invite") &&
         message.length >= 2 && message[1].equalsIgnoreCase("create")){
             event.getChannel().sendMessage("Hey " + event.getAuthor().getName() +" wanna send an invite?").queue();
             event.getChannel().sendMessage("Give them this link" + event.getChannel().createInvite().setMaxAge(time).complete().getURL()).queue();
             event.getChannel().sendMessage("The invite lasts for " +time +" seconds");
         }
    }
}

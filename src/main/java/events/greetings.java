package events;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class greetings extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        String name = event.getMember().getUser().getName();
        if (messageSent[0].equalsIgnoreCase("Hi")){

            if (!event.getMember().getUser().isBot()) {
                event.getChannel().sendMessage("Hi " + name).queue();
            }
        }
    }
}

package commands;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class calculate extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] message = event.getMessage().getContentRaw().split(" ");

        if (message[0].equalsIgnoreCase("!calculate") && message.length == 1){
            event.getChannel().sendMessage("To use this command use (without bracket): !calculate [add/sub] [first num] [second num]").queue();
        }else if (message[0].equalsIgnoreCase("!calculate") && message[1].equalsIgnoreCase("add")){
            int a = Integer.parseInt(message[2]);
            int b = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("The result is: " + (a+b)).queue();
        }else if (message[0].equalsIgnoreCase("!calculate") && message[1].equalsIgnoreCase("sub")){
            int a = Integer.parseInt(message[2]);
            int b = Integer.parseInt(message[3]);
            event.getChannel().sendMessage("The result is: " + (a-b)).queue();
        }
    }
}

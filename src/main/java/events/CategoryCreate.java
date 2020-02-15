package events;

import net.dv8tion.jda.core.events.channel.category.CategoryCreateEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class CategoryCreate extends ListenerAdapter {

    public void onCategoryCreate(CategoryCreateEvent categoryCreate){
        categoryCreate.getGuild().getDefaultChannel().sendMessage("New category").queue();
    }

}

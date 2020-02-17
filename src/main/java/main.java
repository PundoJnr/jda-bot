import commands.calculate;
import commands.invite;
import commands.userinfo;
import events.CategoryCreate;
import events.greetings;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;

import javax.security.auth.login.LoginException;

public class main {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "Njc3ODMxNzQwMDc2ODUxMjEw.XkZ-LQ.l3wlp3Hz343-2QOShL8YzQhDpdc";
        builder.setToken(token);
        builder.addEventListener(new greetings());
        builder.addEventListener(new CategoryCreate());
        builder.addEventListener(new calculate());
        builder.addEventListener(new invite());
        builder.addEventListener(new userinfo());
        builder.buildAsync();
    }

}

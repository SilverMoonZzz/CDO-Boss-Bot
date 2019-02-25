import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MessageReceivedListener extends ListenerAdapter {

    public void onMessageReceived(MessageReceivedEvent e) {

        Bot bot = Bot.getInstance();

        if(e.getMessage().getContentRaw().startsWith("!ping")) {
            System.out.println("Ping received..");
            bot.sendMessage("Pong!");
        }

        if(e.getMessage().getContentRaw().startsWith("!nextboss")) {
            System.out.println("Nextboss commands received..");
            bot.nextBoss();
            System.out.println("Command executed");
        }

        if(e.getMessage().getContentRaw().startsWith("!entropy")) {
            System.out.println("Ping received..");
            bot.sendMessage("Sucks dick!");
        }

        if(e.getMessage().getContentRaw().startsWith("ayy")) {
            System.out.println("Ping received..");
            bot.sendMessage("Lmao!");
        }
    }
}

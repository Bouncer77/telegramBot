import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class Main {
    public static void main(String args[]) throws TelegramApiRequestException {

        org.apache.log4j.BasicConfigurator.configure();

        ApiContextInitializer.init();
        TelegramBotsApi telegram = new TelegramBotsApi();
        //telegram.registerBot(new Bot());
/*        Bot bot = new Bot();
        try {
            telegram.registerBot(bot);
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }*/

        Bot bot = new Bot();
        try {
            telegram.registerBot(bot);
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }
}

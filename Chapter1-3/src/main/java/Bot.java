import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Bot extends TelegramLongPollingBot {

    // При получение сообщения от пользователя
    public void onUpdateReceived(Update update) {
        update.getUpdateId();

        String chat_id = String.valueOf(update.getMessage().getChatId());

        // Класс для отправки сообщений
        SendMessage sendMessage = new SendMessage().setChatId(chat_id);

        // Если пользователь отправил "Привет", то бот ответит "Привет, Дружище"
        if(update.getMessage().getText().equals("Привет")){
            sendMessage.setText("Привет дружище");
            try {
                execute(sendMessage);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }

    }

    // Получение имени бота
    public String getBotUsername() {
        return "BananaSaleBot";
    }

    // Получение токена бота
    public String getBotToken() {
        return "1197305015:AAGyVnKxsCHOzW-SDLep2xnCgtTUTkqEqCs";
    }
}

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import Bot.MyAmazingBot;

public class MyMain {
	public static void main (String[] args) {
		System.out.println("oi");
		
		ApiContextInitializer.init();
		
		TelegramBotsApi botsApi = new TelegramBotsApi();
		
		try {
            botsApi.registerBot(new MyAmazingBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
	}
}

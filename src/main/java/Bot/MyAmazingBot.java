package Bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyAmazingBot extends TelegramLongPollingBot{
	private SendMessage message;
	//@Override
	public void onUpdateReceived(Update update) {
		// TODO
		if (update.hasMessage() && update.getMessage().hasText()) {
			if(update.getMessage().getText().contains("/reset")){
				System.out.println("Reset!");
				message = new SendMessage()
						.setChatId(update.getMessage().getChatId())
						.setText("Porque você quer me resetar?");
				
			}
			else {
				System.out.println("Not reset");
		        message = new SendMessage() // Create a SendMessage object with mandatory fields
		                .setChatId(update.getMessage().getChatId())
		                .setText(update.getMessage().getText());        
			}
			sendMessage(message);
	    }
	}
	
	//@Override
    public String getBotUsername() {
        // TODO
		return "Wolf";
    }

    @Override
    public String getBotToken() {
        // TODO
    	return Bot_credentials.get_credentials();
    }
    
    public void sendMessage(SendMessage message) {
    	try {
            execute(message); // Call method to send the message
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    
}

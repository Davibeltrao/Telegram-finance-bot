package Bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Finance_Bot extends TelegramLongPollingBot{
	private SendMessage message;
	private int msg_count = 0;
	//@Override
	public void onUpdateReceived(Update update) {
		// TODO
		if (update.hasMessage() && update.getMessage().hasText()) {
			if(update.getMessage().getText().contains("/reset")){
				System.out.println("Reset!");
				message = new SendMessage()
						.setChatId(update.getMessage().getChatId())
						.setText("Você é linda");
				
			}
			else {
				if(msg_count == 0) {
					System.out.println("Not reset");
					System.out.println(update.getMessage().getText());
			        message = new SendMessage() // Create a SendMessage object with mandatory fields
			                .setChatId(update.getMessage().getChatId())
			                .setText("Estou em manutenção. Aguarde uma próxima versão, obrigado");
				}
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

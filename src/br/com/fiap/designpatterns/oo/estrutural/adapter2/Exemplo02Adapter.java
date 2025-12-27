package br.com.fiap.designpatterns.oo.estrutural.adapter2;

import br.com.fiap.designpatterns.oo.estrutural.adapter2.adapters.EmailSenderAdapter;
import br.com.fiap.designpatterns.oo.estrutural.adapter2.adapters.WhatsAppSenderAdapter;
import br.com.fiap.designpatterns.oo.estrutural.adapter2.sender.SendMessageUseCase;

public class Exemplo02Adapter {
    public static void main(String[] args) {

        Sender emailSenderAdapter = new EmailSenderAdapter();
        Sender whatsAppSenderAdapter = new WhatsAppSenderAdapter();

        boolean sendCondicao = obterCondicao();

        SendMessageUseCase sendMessageUseCase;
        if (sendCondicao) {
            sendMessageUseCase = new SendMessageUseCase(emailSenderAdapter);
        } else {
            sendMessageUseCase = new SendMessageUseCase(whatsAppSenderAdapter);
        }

        Message message = new Message();
        sendMessageUseCase.send(message);

    }

    private static Message obterMessage() {
        return new Message();
    }

    private static boolean obterCondicao() {
        return false;
    }
}

package br.com.fiap.designpatterns.oo.estrutural.adapter2.sender;

import br.com.fiap.designpatterns.oo.estrutural.adapter2.Message;
import br.com.fiap.designpatterns.oo.estrutural.adapter2.Sender;

public class SendMessageUseCase {
    private Sender sender;

    public SendMessageUseCase(Sender sender) {
        this.sender = sender;
    }

    public void send(Message message) {
        sender.send(message);
    }
}

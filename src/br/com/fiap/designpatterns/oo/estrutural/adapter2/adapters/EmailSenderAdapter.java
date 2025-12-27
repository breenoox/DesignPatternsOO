package br.com.fiap.designpatterns.oo.estrutural.adapter2.adapters;

import br.com.fiap.designpatterns.oo.estrutural.adapter2.Message;
import br.com.fiap.designpatterns.oo.estrutural.adapter2.Sender;

public class EmailSenderAdapter implements Sender {

    @Override
    public void send(Message message) {
        System.out.println("Envio para EMAIL");
    }
}

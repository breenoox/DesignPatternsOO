package br.com.fiap.designpatterns.oo.criacional.factorymethod.domain;

public class NotaTrabalho extends Nota {

    public NotaTrabalho(double value) {
        super(value);
    }

    @Override
    public String getType() {

        return "Trabalho";
    }
}

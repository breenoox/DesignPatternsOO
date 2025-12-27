package br.com.fiap.designpatterns.oo.criacional.factorymethod.domain;

public class NotaProva extends Nota {

    public NotaProva(double value) {
        super(value);
    }

    @Override
    public String getType() {
        return "Prova";
    }
}

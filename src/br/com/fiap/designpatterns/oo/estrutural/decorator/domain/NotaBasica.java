package br.com.fiap.designpatterns.oo.estrutural.decorator.domain;

import br.com.fiap.designpatterns.oo.estrutural.decorator.Nota;

public class NotaBasica implements Nota {
    private double value;

    public NotaBasica(double value) {
        this.value = value;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String getDescricao() {
        return "Nota básica";
    }
}

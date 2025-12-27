package br.com.fiap.designpatterns.oo.criacional.factorymethod.domain;

public abstract class Nota {
    protected double value;

    public Nota(double nota) {
        this.value = nota;
    }

    public double getValue() {
        return value;
    }

    public abstract String getType();
}

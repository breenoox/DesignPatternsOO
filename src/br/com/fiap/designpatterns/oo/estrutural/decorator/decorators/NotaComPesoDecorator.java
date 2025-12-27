package br.com.fiap.designpatterns.oo.estrutural.decorator.decorators;

import br.com.fiap.designpatterns.oo.estrutural.decorator.Nota;

public class NotaComPesoDecorator extends NotaDecorator {
    private double peso;

    public NotaComPesoDecorator(Nota notaASerDecorada, double peso) {
        super(notaASerDecorada);
        this.peso = peso;
    }

    @Override
    public double getValue() {
        return notaASerDecorada.getValue() * peso;
    }

    @Override
    public String getDescricao() {
        return notaASerDecorada.getDescricao() + " com peso";
    }
}

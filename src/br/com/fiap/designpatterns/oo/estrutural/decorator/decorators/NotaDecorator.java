package br.com.fiap.designpatterns.oo.estrutural.decorator.decorators;

import br.com.fiap.designpatterns.oo.estrutural.decorator.Nota;

public abstract class NotaDecorator implements Nota {
    protected Nota notaASerDecorada;

    public NotaDecorator(Nota notaASerDecorada) {
        this.notaASerDecorada = notaASerDecorada;
    }

    @Override
    public double getValue() {
        return notaASerDecorada.getValue();
    }

    @Override
    public String getDescricao() {
        return notaASerDecorada.getDescricao();
    }
}

package br.com.fiap.designpatterns.oo.estrutural.decorator.decorators;

import br.com.fiap.designpatterns.oo.estrutural.decorator.Nota;

public class NotaBonusDecorator extends NotaDecorator {
    private double bonus;

    public NotaBonusDecorator(Nota notaASerDecorada, double bonus) {
        super(notaASerDecorada);
        this.bonus = bonus;
    }

    @Override
    public double getValue() {
        return notaASerDecorada.getValue() + bonus;
    }

    @Override
    public String getDescricao() {
        return notaASerDecorada.getDescricao() + "com bônus";
    }
}

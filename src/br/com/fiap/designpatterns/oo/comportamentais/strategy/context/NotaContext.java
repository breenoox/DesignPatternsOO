package br.com.fiap.designpatterns.oo.comportamentais.strategy.context;

import br.com.fiap.designpatterns.oo.comportamentais.strategy.strategies.NotaStrategy;

public class NotaContext {
    private NotaStrategy strategy;

    public void setStrategy(NotaStrategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double[] grades) {
        return strategy.calculateAverage(grades);
    }
}

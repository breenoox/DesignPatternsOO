package br.com.fiap.designpatterns.oo.comportamentais.chainofresponsibility.rules;

public abstract class BaseRule {
    protected BaseRule nextRule;

    public void setNextHandler (BaseRule nextRule) {
        this.nextRule = nextRule;
    }

    public abstract void check(double grade);
}

package br.com.fiap.designpatterns.oo.criacional.factorymethod.factory;

import br.com.fiap.designpatterns.oo.criacional.factorymethod.domain.Nota;

public abstract class NotaFactory {
    public abstract Nota criarNota(double value);
}

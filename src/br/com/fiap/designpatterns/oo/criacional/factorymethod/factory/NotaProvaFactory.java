package br.com.fiap.designpatterns.oo.criacional.factorymethod.factory;

import br.com.fiap.designpatterns.oo.criacional.factorymethod.domain.Nota;
import br.com.fiap.designpatterns.oo.criacional.factorymethod.domain.NotaProva;

public class NotaProvaFactory extends NotaFactory {

    @Override
    public Nota criarNota(double value) {
        return new NotaProva(value);
    }
}

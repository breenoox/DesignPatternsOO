package br.com.fiap.designpatterns.oo.criacional.factorymethod.factory;

import br.com.fiap.designpatterns.oo.criacional.factorymethod.domain.Nota;
import br.com.fiap.designpatterns.oo.criacional.factorymethod.domain.NotaTrabalho;

public class NotaTrabalhoFactory extends NotaFactory {

    @Override
    public Nota criarNota(double value) {
        return new NotaTrabalho(value);
    }
}

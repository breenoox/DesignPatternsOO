package br.com.fiap.designpatterns.oo.criacional.factorymethod;

import br.com.fiap.designpatterns.oo.criacional.factorymethod.domain.Nota;
import br.com.fiap.designpatterns.oo.criacional.factorymethod.factory.NotaFactory;
import br.com.fiap.designpatterns.oo.criacional.factorymethod.factory.NotaProvaFactory;
import br.com.fiap.designpatterns.oo.criacional.factorymethod.factory.NotaTrabalhoFactory;

import java.util.Arrays;
import java.util.List;

public class Exemplo02FactoryMethod {
    public static void main(String[] args) {
        List<NotaFactory> notaFactories = Arrays.asList(new NotaProvaFactory(), new NotaTrabalhoFactory());

        for (NotaFactory notaFactory : notaFactories) {
            double notaRecebida = obterNotaTela();
            Nota nota = notaFactory.criarNota(notaRecebida);

            System.out.println("Tipo de nota: " + nota.getType() + ", Valor: " + nota.getValue());
        }
    }

    private static double obterNotaTela() {
        return 0;
    }
}

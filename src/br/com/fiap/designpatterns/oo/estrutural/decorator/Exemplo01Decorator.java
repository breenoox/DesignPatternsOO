package br.com.fiap.designpatterns.oo.estrutural.decorator;

import br.com.fiap.designpatterns.oo.estrutural.decorator.decorators.NotaBonusDecorator;
import br.com.fiap.designpatterns.oo.estrutural.decorator.decorators.NotaComPesoDecorator;
import br.com.fiap.designpatterns.oo.estrutural.decorator.domain.NotaBasica;

public class Exemplo01Decorator {
    public static void main(String[] args) {

        Nota notaBasica = new NotaBasica(85.0);
        System.out.println("Valor: " + notaBasica.getValue());
        System.out.println("Descrição: " + notaBasica.getDescricao());

        Nota bonusGrade = new NotaBonusDecorator(notaBasica, 5);
        System.out.println("Valor: " + bonusGrade.getValue());
        System.out.println("Descrição: " + bonusGrade.getDescricao());

        Nota weightGrade = new NotaComPesoDecorator(bonusGrade, 1.2);
        System.out.println("Valor: " + weightGrade.getValue());
        System.out.println("Descrição: " + weightGrade.getDescricao());
    }
}

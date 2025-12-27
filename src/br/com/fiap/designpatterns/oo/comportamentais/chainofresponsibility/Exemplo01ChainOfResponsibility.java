package br.com.fiap.designpatterns.oo.comportamentais.chainofresponsibility;

import br.com.fiap.designpatterns.oo.comportamentais.chainofresponsibility.rules.AprovadorAutomaticoRule;
import br.com.fiap.designpatterns.oo.comportamentais.chainofresponsibility.rules.BaseRule;
import br.com.fiap.designpatterns.oo.comportamentais.chainofresponsibility.rules.RejeicaoRule;
import br.com.fiap.designpatterns.oo.comportamentais.chainofresponsibility.rules.RevisorRule;

public class Exemplo01ChainOfResponsibility {
    public static void main(String[] args) {

        //Instâncias das regras
        BaseRule aprovadorAutomaticoRule = new AprovadorAutomaticoRule();
        BaseRule revisorRule = new RevisorRule();
        BaseRule rejeicaoRule = new RejeicaoRule();

        //Cadeia de responsabilidade
        aprovadorAutomaticoRule.setNextHandler(revisorRule);
        revisorRule.setNextHandler(rejeicaoRule);

        double[] grades = {90, 85, 65};

        for (double grade : grades) {
            aprovadorAutomaticoRule.check(grade);
        }

        System.out.println("FIM");
    }
}

package br.com.fiap.designpatterns.oo.comportamentais.chainofresponsibility.rules;

public class AprovadorAutomaticoRule extends BaseRule {


    @Override
    public void check(double grade) {
        if (grade >= 90) {
            System.out.println("Nota: " + grade + " aprovada automaticamente.");
        } else if (nextRule != null) {
            nextRule.check(grade);
        }
    }
}

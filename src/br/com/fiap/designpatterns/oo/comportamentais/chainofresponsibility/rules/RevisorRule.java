package br.com.fiap.designpatterns.oo.comportamentais.chainofresponsibility.rules;

public class RevisorRule extends BaseRule {
    @Override
    public void check(double grade) {
        if (grade >= 70 && grade < 90) {
            System.out.println("Nota: " + grade + " precisa de revisão.");
        } else if (nextRule != null) {
            nextRule.check(grade);
        }
    }
}

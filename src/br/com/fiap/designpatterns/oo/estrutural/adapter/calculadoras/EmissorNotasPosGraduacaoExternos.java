package br.com.fiap.designpatterns.oo.estrutural.adapter.calculadoras;

import br.com.fiap.designpatterns.oo.estrutural.adapter.Nota;

public class EmissorNotasPosGraduacaoExternos implements Nota {
    private int score;

    public EmissorNotasPosGraduacaoExternos(int score) {
        this.score = score;
    }

    @Override
    public double getValue() {
        return score;
    }

    @Override
    public String getTipoDescricao() {

        System.out.println("Executa regra de notas de POS GRADUAÇÃO");

        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }
}

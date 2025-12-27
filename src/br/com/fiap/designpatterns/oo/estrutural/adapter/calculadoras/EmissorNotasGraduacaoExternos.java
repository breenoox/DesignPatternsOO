package br.com.fiap.designpatterns.oo.estrutural.adapter.calculadoras;

public class EmissorNotasGraduacaoExternos {
    private int score;

    public EmissorNotasGraduacaoExternos(int score) {
        this.score = score;
    }

    public double getValue() {
        return score;
    }

    public String getNotaDescricao() {

        System.out.println("Executa regra de notas de GRADUAÇÃO");

        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }
}

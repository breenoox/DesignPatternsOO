package br.com.fiap.designpatterns.oo.estrutural.adapter;

import br.com.fiap.designpatterns.oo.estrutural.adapter.adapters.NotaGraduacaoAdapter;
import br.com.fiap.designpatterns.oo.estrutural.adapter.adapters.NotaPosGraduacaoAdapter;
import br.com.fiap.designpatterns.oo.estrutural.adapter.calculadoras.EmissorNotasGraduacaoExternos;
import br.com.fiap.designpatterns.oo.estrutural.adapter.calculadoras.EmissorNotasPosGraduacaoExternos;

import java.util.Arrays;
import java.util.List;

public class Exemplo01Adapter {
    public static void main(String[] args) {
        EmissorNotasGraduacaoExternos externalGradeGraduacao = new EmissorNotasGraduacaoExternos(85);
        EmissorNotasPosGraduacaoExternos externalGradePosGraduacao = new EmissorNotasPosGraduacaoExternos(85);

        List<Nota> notas = Arrays.asList(new NotaGraduacaoAdapter(externalGradeGraduacao), new NotaPosGraduacaoAdapter(externalGradePosGraduacao));

        for (Nota nota : notas) {
            //Utilizando os métodos da interface NOTA.

            System.out.println("Nota: " + nota.getValue());
            System.out.println("Descricao da Nota: " + nota.getTipoDescricao());
        }
    }
}

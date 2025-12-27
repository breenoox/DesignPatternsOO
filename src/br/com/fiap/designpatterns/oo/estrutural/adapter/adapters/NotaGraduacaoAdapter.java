package br.com.fiap.designpatterns.oo.estrutural.adapter.adapters;

import br.com.fiap.designpatterns.oo.estrutural.adapter.Nota;
import br.com.fiap.designpatterns.oo.estrutural.adapter.calculadoras.EmissorNotasGraduacaoExternos;

public class NotaGraduacaoAdapter implements Nota {
    private EmissorNotasGraduacaoExternos externalGrade;

    public NotaGraduacaoAdapter(EmissorNotasGraduacaoExternos externalGrade) {
        this.externalGrade = externalGrade;
    }

    @Override
    public double getValue() {
        return externalGrade.getValue();
    }

    @Override
    public String getTipoDescricao() {
        return externalGrade.getNotaDescricao();
    }
}

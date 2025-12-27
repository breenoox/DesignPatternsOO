package br.com.fiap.designpatterns.oo.estrutural.adapter.adapters;

import br.com.fiap.designpatterns.oo.estrutural.adapter.Nota;
import br.com.fiap.designpatterns.oo.estrutural.adapter.calculadoras.EmissorNotasPosGraduacaoExternos;

public class NotaPosGraduacaoAdapter implements Nota {
    private EmissorNotasPosGraduacaoExternos externalGrade;

    public NotaPosGraduacaoAdapter(EmissorNotasPosGraduacaoExternos externalGrade) {
        this.externalGrade = externalGrade;
    }

    @Override
    public double getValue() {
        return externalGrade.getValue();
    }

    @Override
    public String getTipoDescricao() {
        return externalGrade.getTipoDescricao();
    }
}

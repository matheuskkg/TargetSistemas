package teste.questao3.faturamento;

import teste.questao3.DiaValor;
import teste.questao3.FaturamentoAcimaMedia;

import java.util.List;

public class CalculosFaturamento {

    private List<DiaValor> diasValores;

    public CalculosFaturamento(List<DiaValor> diasValores) {
        this.diasValores = diasValores;
    }

    public DiaValor maiorFaturamento() {
        DiaValor res = new DiaValor();

        for (DiaValor dv : diasValores) {
            if (dv.getValor() > res.getValor()) {
                res = dv;
            }
        }

        return res;
    }

    //Menor faturamento desconsiderando dias em que o faturamento é igual a 0
    public DiaValor menorFaturamento() {
        DiaValor res = null;

        for (DiaValor dv : diasValores) {
            if (dv.getValor() != 0) {
                if (res == null || dv.getValor() < res.getValor()) {
                    res = dv;
                }
            }
        }

        return res;
    }

    public FaturamentoAcimaMedia diasFaturamentoAcimaMedia() {
        double media = calcularFaturamentoMedio();

        int dias = 0;
        for (DiaValor dv : diasValores) {
            if (dv.getValor() > media) {
                dias++;
            }
        }

        return new FaturamentoAcimaMedia(dias, media);
    }

    private double calcularFaturamentoMedio() {
        double faturamentoTotal = 0;
        int dias = 0;

        for (DiaValor dv : diasValores) {
            if (dv.getValor() != 0) {
                faturamentoTotal += dv.getValor();
                dias++;
            }
        }

        return faturamentoTotal / dias;
    }
}

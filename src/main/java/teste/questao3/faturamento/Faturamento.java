package teste.questao3.faturamento;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import teste.questao3.DiaValor;
import teste.questao3.FaturamentoAcimaMedia;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Utilizando Jackson para trabalhar com o .json
 */

public class Faturamento {

    public static void faturamento() {
        ObjectMapper mapper = new ObjectMapper();
        List<DiaValor> diasValores = null;

        try {
            diasValores = mapper.readValue(new File("src/main/java/teste/questao3/dados.json"), new TypeReference<>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        CalculosFaturamento calcF = new CalculosFaturamento(diasValores);

        DiaValor menor = calcF.menorFaturamento();
        DiaValor maior = calcF.maiorFaturamento();
        FaturamentoAcimaMedia media = calcF.diasFaturamentoAcimaMedia();

        System.out.println("O menor valor de faturamento foi de " + menor.getValor() + " e ocorreu no dia " + menor.getDia());
        System.out.println("O maior valor de faturamento foi de " + maior.getValor() + " e ocorreu no dia " + maior.getDia());
        System.out.println("O faturamento médio foi de " + media.media() + ". O faturamento foi acima da média em " + media.dias() + " dias");
    }

}

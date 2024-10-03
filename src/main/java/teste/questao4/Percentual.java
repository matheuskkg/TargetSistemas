package teste.questao4;

import java.util.HashMap;
import java.util.Map;

public class Percentual {

    private static Map<String, Double> dados;

    public static void percentual() {
        dados = new HashMap<>();
        dados.put("SP", 67836.43);
        dados.put("RJ", 36678.66);
        dados.put("MG", 29229.88);
        dados.put("ES", 27165.48);
        dados.put("Outros", 19849.53);

        double total = 0.0;
        for (Map.Entry<String, Double> entry : dados.entrySet()) {
            total += entry.getValue();
        }

        for (Map.Entry<String, Double> entry : dados.entrySet()) {
            System.out.printf("%s representa %.2f do faturamento mensal da distribuidora\n", entry.getKey(), (entry.getValue() / total) * 100);
        }

    }

}

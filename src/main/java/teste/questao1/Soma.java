package teste.questao1;

public class Soma {

    public static void soma() {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("Ao final do processamento, o valor da variável SOMA será: " + SOMA);
    }

}

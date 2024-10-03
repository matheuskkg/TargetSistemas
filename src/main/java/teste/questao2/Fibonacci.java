package teste.questao2;

public class Fibonacci {

    public static void fibonacci() {
        int target = 55;

        int a = 0;
        int b = 1;
        int temp = 0;
        while (b < target) {
            temp = a + b;
            a = b;
            b = temp;
        }

        if (target == 0 || b == target) {
            System.out.println("O número " + target + " pertence à sequência");
        } else {
            System.out.println("O número " + target + " não pertence à sequência");
        }
    }

}

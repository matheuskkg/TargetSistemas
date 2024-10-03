package teste.questao5;

public class InverterString {

    public static void invertedString() {
        String input = "Testando inverter uma string com uma string longa";
        char[] inputArr = input.toCharArray();

        int left = 0;
        int right = inputArr.length - 1;
        while (left < right) {
            char temp = inputArr[left];
            inputArr[left++] = inputArr[right];
            inputArr[right--] = temp;
        }

        String output = new String(inputArr);
        System.out.println("Input: " + input + "\nOutput: " + output);
    }

}

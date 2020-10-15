import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        for (int i = 0; i < input.length; i++) {
            boolean isTopInteger = true;
            int currentNumber = input[i];

            for (int j = i+1; j < input.length; j++) {
                if (currentNumber <= input[j]) {
                    isTopInteger = false;
                }

            }
            if(isTopInteger){
                System.out.print(currentNumber+" ");
            }

        }
        /* String[] line = scanner.nextLine().split(" ");
         *//*int[] numbers = new int[line.length];
        for (int i = 0; i < line.length ; i++) {
            numbers[i] = Integer.parseInt(line[i]);*/


    }
}


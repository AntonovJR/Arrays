import java.util.Arrays;
import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= Integer.parseInt(scanner.nextLine());
        }
        int[] numbersReversed = new int[numbers.length];
        for (int i = 0; i < numbersReversed.length ; i++) {
            numbersReversed[i]= numbers[numbers.length-1-i];
            
        }
        for (int i = 0; i <numbersReversed.length ; i++) {
            System.out.print(numbersReversed[i]+" ");

        }

    }
}

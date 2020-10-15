import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrayString = scanner.nextLine();
        String[] numberAsStrings = arrayString.split(" ");
        int sumEven = 0;
        int sumOdd = 0;
        int[] arr = new int[numberAsStrings.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(numberAsStrings[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumEven += arr[i];
            }else{
                sumOdd += arr[i];

            }

        }
        System.out.println(sumEven-sumOdd);
    }
}

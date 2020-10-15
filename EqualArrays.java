import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstArr = scanner.nextLine();
        String[] firstAsString = firstArr.split(" ");
        int[] first = new int[firstAsString.length];

        String secondArr = scanner.nextLine();
        String[] secondAsString = secondArr.split(" ");
        int[] second = new int[secondAsString.length];

        int sum = 0;

        for (int i = 0; i < firstAsString.length; i++) {
            first[i] = Integer.parseInt(firstAsString[i]);
        }
        for (int i = 0; i < secondAsString.length; i++) {
            second[i] = Integer.parseInt(secondAsString[i]);
        }
        for (int i = 0; i <first.length ; i++) {
            sum+= first[i];
            if (first[i] != second[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.",i);
                return;

            }
        }
        System.out.printf("Arrays are identical. Sum: %d",sum);
    }
}

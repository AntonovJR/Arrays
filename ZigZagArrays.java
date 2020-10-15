import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split(" ");
            if(i%2==0){

                firstArr[i-1] = Integer.parseInt(input[1]);
                secondArr[i-1] = Integer.parseInt(input[0]);

            }else{
                firstArr[i-1] = Integer.parseInt(input[0]);
                secondArr[i-1] = Integer.parseInt(input[1]);

            }

            }
        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i] + " ");

        }

    }
}

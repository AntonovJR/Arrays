import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String[] input = firstString.split(" ");
        String secondString = scanner.nextLine();
        String[] inputSecond = secondString.split(" ");

        for (int i = 0; i <inputSecond.length ; i++) {
            for (int j = 0; j < input.length ; j++) {
               if(inputSecond[i].equals(input[j])){
                   System.out.print(inputSecond[i]+" ");
               }

            }

        }

    }
}

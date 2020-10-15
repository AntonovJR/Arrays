import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <rotations ; i++) {
            String oldElement = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = oldElement;

        }
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]+" ");

        }
    }
}


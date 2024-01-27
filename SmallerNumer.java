import java.util.Scanner;

public class SmallerNumer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("534");
        int num1 = scanner.nextInt();

        System.out.print("987");
        int num2 = scanner.nextInt();

        System.out.print("453");
        int num3 = scanner.nextInt();

        int smallest = num1;

        if (num2 < smallest) {
            smallest = num2;
        }

        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println(smallest);

        scanner.close();
    }
}
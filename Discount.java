import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        double discount = 0.0;

        if (purchaseAmount >= 500 && purchaseAmount <= 1000) {
            discount = 0.1; // 10% discount
        } else if (purchaseAmount > 1000) {
            discount = 0.2; // 20% discount
        }

        double payableAmount = purchaseAmount - (purchaseAmount * discount);

        System.out.println("Discount applied: " + (discount * 100) + "%");
        System.out.println("Final payable amount: " + payableAmount);

        scanner.close();
    }
}
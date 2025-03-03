import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");
        int income = scanner.nextInt();System.out.print("Enter your spendings: ");
        int spending = scanner.nextInt();

        int result = income - spending;

        System.out.println("Итого (руб): ");
        System.out.println(result);

    }
}

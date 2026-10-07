import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("перше число: ");
        double a = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("пруге число: ");
        double b = Double.parseDouble(sc.nextLine().replace(',', '.'));
        System.out.print("оператор (+, -, *, /): ");
        char op = sc.nextLine().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("на нуль ділити не можна");
                } else {
                    System.out.println(a + " / " + b + " = " + (a / b));
                }
                break;
            default:
                System.out.println("невідомий оператор");
        }
    }
}
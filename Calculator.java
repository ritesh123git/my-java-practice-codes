import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        while (true) {
            System.out.print("Enter your operator: ");
            int op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter first number: ");
                int a = sc.nextInt();
                System.out.print("Enter second number: ");
                int b = sc.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0) {
                        ans = a / b;
                    }
                }
                if (op == '%') {
                    ans = a % b;
                }

            } else if (op == 'x' || op == 'X') {
                break;

            } else {
                System.out.println("invalid operator");
            }

            System.out.println("Your answer is: "+ans);

        }

    }
}
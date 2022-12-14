import java.util.Scanner;
public class While_loop_infinite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;
        while (n <= num) {
            System.out.println(num);
            num++;

        }
    }
}
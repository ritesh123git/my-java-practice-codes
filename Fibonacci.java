import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =0;
        int b =1;
        int n=sc.nextInt();
        int count =2;
        while(count<=n){
           int tempo=b;
            b=b+a;
            a=tempo;//here we are storing the value of an in b here the value of b will be given to a and the value of answer is given to b
            count++;
        }
        System.out.println(b);
    }
}


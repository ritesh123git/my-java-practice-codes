import java.util.Scanner;
public class SumOfNumberDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfDigits=0;
        int Original_n =n;
        while(n>0){
            sumOfDigits+=n%10;//this will give us last digit eg. if input is 645 output is 5
            n=n/10;//this will give input 643/10=64.3 but output will be 64
             }
        System.out.println("sum of digits"+Original_n+"="+sumOfDigits);
    }
}

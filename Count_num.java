import java.util.Scanner;
public class Count_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int numOfDigits=0;
        int Original_n = n ;
      //  int Original_n =n;

        while(n>0){
            n=n/10;
            numOfDigits++;
        }
        System.out.print("Your entered number contains "+Original_n+"="+numOfDigits);
    }
}

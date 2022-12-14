import java.util.*;
public class NUmber_conversion2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal=sc.nextInt();
        int ans =0;
        int power=1;
        while(decimal>0){
            int parity=decimal%2;
            ans+=(parity*power);
            power*=10;
            decimal/=2;

        }
        System.out.print(ans);
    }
}
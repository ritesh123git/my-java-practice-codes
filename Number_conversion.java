import java.util.*;
public class Number_conversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary=sc.nextInt();
        int ans =0;
        int power=1;
        while(binary>0){
            int unit_digit=binary%10;
            ans+=(unit_digit*power);
            power*=2;
            binary/=10;
        }
        System.out.println(ans);
    }
}
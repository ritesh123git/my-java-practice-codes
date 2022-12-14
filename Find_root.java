import java.util.Scanner;
public class Find_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),b = sc.nextInt();
        int ans =1;
        int i = 1;
        while(i<=b){//jab tak ye condition satisfy nahi hota tab tak loop chalega jab i=b ho jaye tab tak loop band ho jayega
            ans=ans*a;
            i++;

        }
        System.out.println(ans);
    }
}

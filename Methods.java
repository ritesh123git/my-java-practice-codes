import java.util.Scanner;
class Addition{
    int add(int a , int b) {
        int ans = a+b;
        return ans;
    }
}

        public class Methods {
            public static void main(String[] args) {
            Addition obj = new Addition();
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
                System.out.print("Addition of two number is");
               int ans= obj.add(x,y);
                System.out.print(ans);
            }
        }

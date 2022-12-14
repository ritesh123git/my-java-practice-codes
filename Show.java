import java.util.Scanner;

public class Show {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0){
                int c = sc.nextInt();
                if( c >0 && c<=1000 ){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
            }
        }
    }


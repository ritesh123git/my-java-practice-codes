import java.util.Scanner;
public class Deserve {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your percentage:");
            float percentage = sc.nextInt();
            if(percentage>=50 && percentage<=100) {
                System.out.print("you are qualified");
            }
            else if(percentage<=50){
                System.out.println("you are not eligible");
            }
            else{
                System.out.println("Error");
            }
        }
    }

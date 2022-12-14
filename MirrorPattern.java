import java.util.Scanner;
public class MirrorPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row =sc.nextInt();
       // int col =sc.nextInt();
        for (int i=1;i<=(2*row)-1;i++){
            if (i>row) {
                for (int j = 1; j <= ((2*row)-i); j++) {
                    System.out.print("*");
                }
            }
                else{
                    for (int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                }
            System.out.println();
            }

        }
    }
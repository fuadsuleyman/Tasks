package Triangle;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter count of row in our triange: ");

        int n = scanner.nextInt(); // here n is count of row

        creatTriangle2(n);
    }

    public static void creatTriangle2(int x){
        for (int i = 0; i < x; i++){
            for (int j = x; j > 0; j--){
                if (j > i+1){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }
}

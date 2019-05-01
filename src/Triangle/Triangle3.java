package Triangle;

import java.util.Scanner;

public class Triangle3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter count of row in our triange: ");

        int n = scanner.nextInt(); // here n is count of row

        creatTriangle3(n);
}

    public static void creatTriangle3(int n){
        for (int i = n; i > 0; i--){
            for (int j = 0; j <= i; j++){
                if(j>=i){
                    int k = i;
                    while (k<=n){
                        System.out.print("* ");
                        k=k+1;
                    }
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}


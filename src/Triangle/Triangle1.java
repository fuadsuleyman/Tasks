package Triangle;

import java.util.Scanner;

public class Triangle1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter count of row: ");
        int n = scanner.nextInt(); // here n is count of row

        creatTriangle1(n);

    }

        public static void creatTriangle1(int n){
            for (int i = 0; i < n; i++){
                for (int j = 0; j <= i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

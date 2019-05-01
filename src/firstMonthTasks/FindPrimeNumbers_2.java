package firstMonthTasks;

import java.util.Scanner;

public class FindPrimeNumbers_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number: ");
        double number = scanner.nextInt();

        for (int i = 1; i <= number; i++){
            int counter = 0;
            for (int j = 1; j <= i; j++)
            if (i % j == 0){
                counter++;
            }
            if (counter<=2){
                System.out.print(i+" ");
            }
        }
    }
}

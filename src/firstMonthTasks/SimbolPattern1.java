package firstMonthTasks;

import java.util.Scanner;

public class SimbolPattern1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any simvol: ");
        String simvol = scanner.next();

        System.out.print("Enter how many simvol you want see: ");
        int count = scanner.nextInt();

        System.out.print("if you want see simvol in row enter 1 else in column enter 2: ");
        String rowOrColumn = scanner.next();

        for (int i = 0; i < count; i++){
            if (rowOrColumn.equals("1")){
                System.out.print(" "+simvol);
            }else if (rowOrColumn.equals("2")){
                System.out.println(" "+simvol);
            }else System.out.println("input is wrong");
        }

    }



}

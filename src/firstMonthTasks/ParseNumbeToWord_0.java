package firstMonthTasks;

import java.util.Scanner;

public class ParseNumbeToWord_0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three digits number: ");
        int number = scanner.nextInt();

        String lastDigitString = null;
        int lastDigit = number % 10;
        int temp = number / 10;

        switch (lastDigit){
            case 0:
                lastDigitString = null;
                break;
            case 1:
                lastDigitString = "one";
                break;
            case 2:
                lastDigitString = "two";
                break;
            case 3:
                lastDigitString = "three";
                break;
            case 4:
                lastDigitString = "four";
                break;
            case 5:
                lastDigitString = "five";
                break;
            case 6:
                lastDigitString = "six";
                break;
            case 7:
                lastDigitString = "seven";
                break;
            case 8:
                lastDigitString = "eigth";
                break;
            case 9:
                lastDigitString = "nine";
                break;
        }

        int middleDigit = temp % 10;
        temp = temp / 10;
        String middleDigitString = null;
        if (middleDigit == 0){
            middleDigitString = null;
        }else if (middleDigit == 1 && lastDigit==0){
            middleDigitString = "ten";
        }else if (middleDigit == 1 && lastDigitString.equals("one")){
            middleDigitString = "eleven";
        }else if (middleDigit == 2){
            middleDigitString = "twenty";
        }else if (middleDigit == 1 && lastDigitString.equals("two")){
            middleDigitString = "twelve";
        }else if (middleDigit == 3) {
            middleDigitString = "thirty";
        }else if (middleDigit == 1 && lastDigitString.equals("three")) {
            middleDigitString = "thirteen";
        }else if (middleDigit == 4) {
            middleDigitString = "fourty";
        }else if (middleDigit == 1 && lastDigitString.equals("four")) {
            middleDigitString = "fourteen";
        }else if (middleDigit == 5) {
            middleDigitString = "fivety";
        }else if (middleDigit == 1 && lastDigitString.equals("five")) {
            middleDigitString = "fiveteen";
        }else if (middleDigit == 6) {
            middleDigitString = "sixty";
        }else if (middleDigit == 1 && lastDigitString.equals("six")) {
            middleDigitString = "sixteen";
        }else if (middleDigit == 7) {
            middleDigitString = "seventy";
        }else if (middleDigit == 1 && lastDigitString.equals("seven")) {
            middleDigitString = "seventeen";
        }else if (middleDigit == 8) {
            middleDigitString = "eighty";
        }else if (middleDigit == 1 && lastDigitString.equals("eight")){
            middleDigitString = "eighteen";
        }else if (middleDigit == 9) {
            middleDigitString = "ninety";
        }else if (middleDigit == 1 && lastDigitString.equals("nine")) {
            middleDigitString = "nineteen";
        }
        int firstDigit = temp;
        String firstDigitString = null;
        if (firstDigit==0){
            firstDigitString = null;
        }else if (firstDigit==1){
            firstDigitString = "one hundred";
        }else if (firstDigit==2){
            firstDigitString = "two hundred";
        }else if (firstDigit==3){
            firstDigitString = "three hundred";
        }else if (firstDigit==4){
            firstDigitString = "four hundred";
        }else if (firstDigit==5){
            firstDigitString = "five hundred";
        }else if (firstDigit==6){
            firstDigitString = "six hundred";
        }else if (firstDigit==7){
            firstDigitString = "seven hundred";
        }else if (firstDigit==8){
            firstDigitString = "eigth hundred";
        }else if (firstDigit==9){
            firstDigitString = "nine hundred";
        }

        if (lastDigit == 0 && middleDigit == 0 && firstDigit ==0){
            System.out.println("zero zero zero");
        }else if(lastDigit == 0 && middleDigit != 0 && firstDigit != 0){
            System.out.println(firstDigitString + " " + middleDigitString);
        }else if (middleDigit == 0 && firstDigit != 0 && lastDigit != 0){
            System.out.println(firstDigitString + " " + lastDigitString);
        }else if (firstDigit == 0 && middleDigit != 0 && middleDigit != 1 && lastDigit != 0){
            System.out.println(middleDigitString + " " + lastDigitString);
        }else if(firstDigit == 0 && middleDigit == 1 && lastDigit != 0){
            System.out.println(middleDigitString);
        }else if (firstDigit == 0 && lastDigit ==0){
            System.out.println(middleDigitString);
        }else if (firstDigit == 0 && middleDigit == 0){
            System.out.println(lastDigitString);
        }else if (middleDigit == 0 && lastDigit == 0){
            System.out.println(firstDigitString);
        }else if(firstDigit != 0 && middleDigit == 1){
            System.out.println(firstDigitString + " " + middleDigitString);
        }else if(lastDigit != 0 && middleDigit != 0 && firstDigit != 0){
            System.out.println(firstDigitString+" "+middleDigitString+" "+lastDigitString);
        } else System.out.println("Please enter number with three digit!");
    }
}




package If_Else;

import java.util.Scanner;

public class SingleDigitInWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number (0-9)");
        int input = sc.nextInt();
        if (input == 0) {
            System.out.println("Zero");
        } else if (input == 1) {
            System.out.println("One");
        } else if (input == 2) {
            System.out.println("Two");
        } else if (input == 3) {
            System.out.println("Three");
        } else if (input == 4) {
            System.out.println("Four");
        } else if (input == 5) {
            System.out.println("Five");
        } else if (input == 6) {
            System.out.println("Six");
        } else if (input == 7) {
            System.out.println("Seven");
        } else if (input == 8) {
            System.out.println("Eight");
        }else if(input == 9) {
            System.out.println("Nine");
        }else{
            System.out.println("Invalid Number!");
        }
    }
}

package If_Else;

import java.util.Scanner;

public class SecondProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number (1,10,100,1000...)");
        int input = sc.nextInt();
        if (input == 1) {
            System.out.println("Unit");
        } else if (input == 10) {
            System.out.println("Ten");
        } else if (input == 100) {
            System.out.println("One Hundred");
        } else if (input == 1000) {
            System.out.println("One Thousand");
        } else if (input == 10000) {
            System.out.println("Ten Tousand");
        } else if (input == 100000) {
            System.out.println("One Lakh");
        }else{
            System.out.println("Invalid Number!");
        }
    }
}

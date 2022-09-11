package while_loop;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int sum = 0;
        int i = 1;
        while (num >= i){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum : " + sum);
    }
}

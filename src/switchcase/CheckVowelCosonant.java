package switchcase;

import java.util.Locale;
import java.util.Scanner;

public class CheckVowelCosonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Character(a-z)");
        char ch = sc.next().toLowerCase().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is Vowel");
                break;
            default:
                System.out.println("It is Consonant");
                break;
        }
    }
}

package PalindromeNumber;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while(flag == false) {
            System.out.println("Enter Palindrome Number: ");
            int number = scanner.nextInt();
            boolean result = Palindrome.isPalindrome(number);
            if (result == true) {
                System.out.printf("Given number %d is Palindrome\n", number);
                flag = result;
            } else {
                System.out.printf("Given number %d is not a Palindrome\n", number);
            }
        }
//        Palindrome.isPalindrome(123);
//        boolean palindrome = false;

//        while(palindrome == false) {
//            System.out.println("Enter the palindrome number: ");
//            int number = scanner.nextInt();
//            boolean value = Palindrome.isPalindrome(number);
//            if (value == true) {
//                palindrome = true;
//                System.out.printf("Number %d is palindrome number..\n", number);
//            } else {
//                System.out.printf("Number %d is not a palindrome number..\n", number);
//            }
//        }
    }
    public static boolean isPalindrome(int x) {
        int number = x;
        int reverse = 0;
        boolean result = false;
        while(x != 0 && x >= 0) {
            int remainder = x%10;
            reverse = reverse * 10 + remainder;
            x = x/10;
        }
        result = (number == reverse) ? true : false;
        return result;
    }
}

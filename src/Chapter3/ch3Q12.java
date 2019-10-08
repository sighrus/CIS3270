package Chapter3;

import java.util.Scanner;

public class ch3Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        String n = input.next();

        String[] arr = n.split("");

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i].equals(arr[arr.length - 1 - i])) {
                System.out.println(n + " is a palindrome");
            } else {
                System.out.println(n + " is not a palindrome");
            }
        }
    }
}

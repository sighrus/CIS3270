package Chapter2;

import java.util.Scanner;

public class ch2Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int n = input.nextInt();
        if (n >= 0 && n <= 1000) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            System.out.println("The sum of the digits is " + sum);
        } else
            System.out.println("Number is not within range of 0 and 1000");
    }
}

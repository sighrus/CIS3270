package Chapter2;

import java.util.Scanner;

public class ch2Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        int sub = input.nextInt();
        int grat = input.nextInt();
        System.out.println("The gratuity is $" + sub * grat / 100.0 + " and the total is $" + (sub + (sub * grat / 100.0)));
    }
}

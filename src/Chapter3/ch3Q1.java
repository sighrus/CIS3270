package Chapter3;

import java.util.Scanner;

public class ch3Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double det = Math.sqrt(b * b - 4 * a * c);

        if (det > 0) {
            double r1 = ((-b) + det) / (2 * a);
            double r2 = ((-b) - det) / (2 * a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (det == 0) {
            double r1 = (-b) / (2 * a);
            System.out.println("The equation has one roots " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}

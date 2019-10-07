package Chapter2;

import java.util.Scanner;

public class ch2Q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();
        double z1 = input.nextDouble();
        double z2 = input.nextDouble();

        double side1 = Math.sqrt(Math.pow(x1 - y1, 2) + Math.pow(x2 - y2, 2));
        double side2 = Math.sqrt(Math.pow(x1 - z1, 2) + Math.pow(x2 - z2, 2));
        double side3 = Math.sqrt(Math.pow(y1 - z1, 2) + Math.pow(y2 - z2, 2));

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("The area of the triangle is " + area);
    }
}

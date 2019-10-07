package Chapter2;

import java.util.Scanner;

public class ch2Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double lb = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double inch = input.nextDouble();

        double kg = lb * (.45359237);
        double meter = inch * (.0254);
        System.out.println("BMI is " + kg/Math.pow(meter, 2));
    }
}

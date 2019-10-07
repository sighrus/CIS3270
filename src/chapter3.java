import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;

public class chapter3 {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
//        ch3Q1();
//        ch3Q4();

    }

    public static void ch3Q1() {
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

    public static void ch3Q4() {
        double randNumber = Math.random();
        double d = randNumber * 12;

        int randomInt = (int) d + 1;

        switch (randomInt) {
            case 1:
                System.out.println("The month of " + randomInt + " is " + "January");
                break;
            case 2:
                System.out.println("The month of " + randomInt + " is " + "February");
                break;
            case 3:
                System.out.println("The month of " + randomInt + " is " + "March");
                break;
            case 4:
                System.out.println("The month of " + randomInt + " is " + "April");
                break;
            case 5:
                System.out.println("The month of " + randomInt + " is " + "May");
                break;
            case 6:
                System.out.println("The month of " + randomInt + " is " + "June");
                break;
            case 7:
                System.out.println("The month of " + randomInt + " is " + "July");
                break;
            case 8:
                System.out.println("The month of " + randomInt + " is " + "August");
                break;
            case 9:
                System.out.println("The month of " + randomInt + " is " + "September");
                break;
            case 10:
                System.out.println("The month of " + randomInt + " is " + "October");
                break;
            case 11:
                System.out.println("The month of " + randomInt + " is " + "November");
                break;
            case 12:
                System.out.println("The month of " + randomInt + " is " + "December");
        }
    }

    public static void ch3Q5() {

    }
}

import java.util.Scanner;

public class chapter2 {

    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ch2Q5();
        ch2Q6();
        ch2Q7();
        ch2Q14();
        ch2Q19();


    }

    public static void ch2Q5() {
        System.out.println("Enter the subtotal and a gratuity rate: ");
        int sub = input.nextInt();
        int grat = input.nextInt();
        System.out.println("The gratuity is $" + sub * grat / 100.0 + " and the total is $" + (sub + (sub * grat / 100.0)));
    }

    public static void ch2Q6() {
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

    public static void ch2Q7() {
        System.out.println("Enter the number of minutes: ");
        int min = input.nextInt();
        int years = min / (365 * 24 * 60);
        int remDays = (min / (24 * 60)) % 365;
        System.out.println(min + " minutes is approximately " + years + " years and " + remDays + " days");

    }

    public static void ch2Q14() {
        System.out.println("Enter weight in pounds: ");
        double lb = input.nextDouble();
        System.out.println("Enter height in inches: ");
        double inch = input.nextDouble();

        double kg = lb * (.45359237);
        double meter = inch * (.0254);
        System.out.println("BMI is " + kg/Math.pow(meter, 2));
    }

    public static void ch2Q19() {
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


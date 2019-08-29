import java.util.Scanner;

public class chapter2 {

    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        ch2Q5();
        ch2Q6();
        ch2Q7();


    }

    public static void ch2Q5() {
        System.out.println("Enter the subtotal and a gratuity rate: ");
        int sub = input.nextInt();
        int grat = input.nextInt();
        System.out.println("The gratuity is $" + sub*grat/100.0 + " and the total is $" + (sub + (sub*grat/100.0)));
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

    public static void ch2Q8() {

    }


}


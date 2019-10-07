package Chapter2;

import java.util.Scanner;

public class ch2Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int min = input.nextInt();
        int years = min / (365 * 24 * 60);
        int remDays = (min / (24 * 60)) % 365;
        System.out.println(min + " minutes is approximately " + years + " years and " + remDays + " days");
    }
}

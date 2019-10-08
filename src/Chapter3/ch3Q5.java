package Chapter3;

import java.util.Scanner;

public class ch3Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] arr = new String[]{"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        System.out.println("Enter today's day: ");
        int currentDay = input.nextInt();

        System.out.println("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();
        if (currentDay + elapsedDays >= 0 && currentDay + elapsedDays <= 6) {
            System.out.println("Today is " + arr[currentDay] + " and the future day is " + arr[currentDay + elapsedDays]);
        } else if (currentDay + elapsedDays > 6 && ((elapsedDays % 7) + currentDay) <= 6){
            System.out.println("Today is " + arr[currentDay] + " and the future day is " + arr[currentDay + (elapsedDays % 7)]);
        } else if (elapsedDays % 7 + currentDay > 6) {
            System.out.println("Today is " + arr[currentDay] + " and the future day is " + arr[currentDay + (elapsedDays % 7) - 7]);
        } else {
            System.out.println("Error");
        }


    }

}

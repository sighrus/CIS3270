package Chapter3;

public class ch3Q4 {
    public static void main(String[] args) {
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
}

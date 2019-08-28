public class chapter1 {
    public static void main(String[] args) {

        ch1Q11();
        ch1Q13();

    }

    public static void ch1Q11() {
        int p = 312032486;
        int n = 24 * 60 * 60;
        int birth = n / 7;
        int death = n / 13;
        int imm = n / 45;

        for (int i = 0; i < 5; i++) {
            p += birth - death + imm;
        }
        System.out.println("Population over next 5 years is: " + p);
    }


    public static void ch1Q13() {
        double x = (44.5 * .55 - 50.2 * 5.9) / (3.4 * .55 - 50.2 * 2.1);
        double y = (3.4 * 5.9 - 44.5 * 2.1) / (3.4 * .55 - 50.2 * 2.1);
        System.out.println("Value of x and y respectively is: " + x + " and " + y);
    }
}

public class ch1Q11 {
    public static void main(String[] args) {
        int p = 312032486;
        int n = 24 * 60 * 60;
        int birth = n / 7;
        int death = n / 13;
        int imm = n / 45;

        for (int i = 1; i <= 5; i++) {
            p += birth - death + imm;
            System.out.println("Population for year " + i + " is: " + p);
        }
    }
}

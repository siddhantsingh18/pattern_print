public class hollow_right_angle_triangle {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <=n; i++) {
            // part 1 without spaces
            if(i == 1 || i == 2 || i == 5) {
                for(int j = 1; j<=i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                // with spaces
                System.out.print("* ");

                for(int j = 1; j <= i - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

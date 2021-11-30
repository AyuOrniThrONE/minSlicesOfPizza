import java.util.Scanner;

public class pizza1 {
    public static int pizzaSolve(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return pizzaSolve(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        if (1 <= t && t <= 200000) {
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int k = sc.nextInt();

                int c = pizzaSolve(n, k);
                System.out.println(n / c);

            }
        }
    }
}
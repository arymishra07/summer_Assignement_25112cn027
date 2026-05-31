package Day_4;

import java.util.*;

public class q4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0, b = 1;

        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(b);
        } else {
            int term = 0;

            for (int i = 3; i <= n; i++) {
                term = a + b;
                a = b;
                b = term;
            }

            System.out.println("Nth Fibonacci Term = " + b);
        }

        sc.close();
    }
}

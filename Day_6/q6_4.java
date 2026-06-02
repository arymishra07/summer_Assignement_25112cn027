package Day_6;
import java.util.Scanner;

public class q6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= x;
        }

        System.out.println(result);

        sc.close();
    }
}

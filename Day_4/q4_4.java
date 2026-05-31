package Day_4;
import java.util.*;

public class q4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Armstrong Numbers:");

        for (int num = start; num <= end; num++) {
            int original = num;
            int temp = num;

            int digits = String.valueOf(num).length();
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }

        sc.close();
    }
}
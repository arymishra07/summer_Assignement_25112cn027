package Day_4;
import java.util.*;

public class q4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int original = num;

        int digits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, digits);
            num /= 10;
        }

        if (sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");

        sc.close();
    }
}

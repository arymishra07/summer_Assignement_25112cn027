package Day_12;
import java.util.Scanner;
public class q12_2 {
    
    static boolean isArmstrong(int n) {
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isArmstrong(n))
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}

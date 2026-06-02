package Day_6;
import java.util.Scanner;

public class q6_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long binary = sc.nextLong();
        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int digit = (int)(binary % 10);
            decimal += digit * (1 << power);
            power++;
            binary /= 10;
        }

        System.out.println(decimal);

        sc.close();
    }
}
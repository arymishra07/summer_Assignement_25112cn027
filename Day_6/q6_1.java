package Day_6;
import java.util.Scanner;

public class q6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num == 0) {
            System.out.println(0);
            return;
        }

        String binary = "";

        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }

        System.out.println(binary);

        sc.close();
    }
}
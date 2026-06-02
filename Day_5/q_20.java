package Day_5;

import java.util.Scanner;

public class q_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long largestPrimeFactor = -1;

        while (num % 2 == 0) {
            largestPrimeFactor = 2;
            num /= 2;
        }

        for (long i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                largestPrimeFactor = i;
                num /= i;
            }
        }

        if (num > 2) {
            largestPrimeFactor = num;
        }

        System.out.println(largestPrimeFactor);

        sc.close();
    }
}
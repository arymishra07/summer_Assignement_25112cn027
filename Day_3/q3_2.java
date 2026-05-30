package Day_3;
import java.util.Scanner;   

public class q3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        if (start > end) { // ensure start <= end
            int tmp = start;
            start = end;
            end = tmp;
        }

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int num = start; num <= end; num++) {
            if (num <= 1)
                continue;

            boolean isPrime = true;

            int limit = (int) Math.sqrt(num);
            for (int i = 2; i <= limit; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.print(num + " ");
        }

        sc.close();
    }
}

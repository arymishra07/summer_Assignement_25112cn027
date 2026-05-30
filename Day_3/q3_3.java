package Day_3;

public class q3_3 {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
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
    }
    
}

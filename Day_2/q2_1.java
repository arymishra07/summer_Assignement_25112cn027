import java.util.Scanner;

public class q2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int num = Math.abs(number);
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
        
        scanner.close();
    }
}

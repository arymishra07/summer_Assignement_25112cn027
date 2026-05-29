import java.util.Scanner;

public class ReverseNumber {
    
    public static int reverseNumber(int num) {
        int reversed = 0;
        int temp = num;
        
        boolean isNegative = num < 0;
        if (isNegative) {
            temp = Math.abs(num);
        }
        
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }
        
        return isNegative ? -reversed : reversed;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Reverse a Number ===");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = reverseNumber(number);
        
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + result);
        
        scanner.close();
    }
}

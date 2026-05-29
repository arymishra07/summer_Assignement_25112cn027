import java.util.Scanner;

public class ReverseNumber {
    
    // Method to reverse a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        int temp = num;
        
        // Handle negative numbers
        boolean isNegative = num < 0;
        if (isNegative) {
            temp = Math.abs(num);
        }
        
        // Reverse the number
        while (temp > 0) {
            int digit = temp % 10;           // Extract last digit
            reversed = reversed * 10 + digit; // Add digit to reversed number
            temp = temp / 10;                 // Remove last digit
        }
        
        // Return with negative sign if input was negative
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

import java.util.Scanner;

public class q2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int product = 1;
        int n = Math.abs(num);
        
        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        
        System.out.println("Product of digits: " + product);
        sc.close();
    }
}

package Day_12;


    import java.util.Scanner;
public class q12_1 {
    static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (isPalindrome(n))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
package Day_11;

    
import java.util.Scanner;

public class q11_2 {
    static int maximum(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(maximum(a, b));
    }
}
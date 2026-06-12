package Day_11;

import java.util.Scanner;

public class q11_1 {

    
 
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sum(a, b));
    }
}

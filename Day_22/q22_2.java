package Day_22;

import java.util.Scanner;

public class q22_2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println(0);
            return;
        }

        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println(count);
    }
}

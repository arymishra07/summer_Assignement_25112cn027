package Day_23;

import java.util.Scanner;

public class q23_2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char result = '\0';

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    result = str.charAt(i);
                    break;
                }
            }

            if (result != '\0')
                break;
        }

        if (result != '\0')
            System.out.println(result);
        else
            System.out.println("No repeating character");
    }
}

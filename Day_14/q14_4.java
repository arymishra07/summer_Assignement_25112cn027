package Day_14;


    
import java.util.Scanner;

public class q14_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i < n; i++) {
            boolean printed = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    printed = true;
                    break;
                }
            }

            if (printed)
                continue;

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.print(arr[i] + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Duplicates");
        }
    }
}

package Day_17;

import java.util.Scanner;

public class q17_2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] union = new int[n1 + n2];
        int k = 0;

        for(int i = 0; i < n1; i++) {
            boolean found = false;

            for(int j = 0; j < k; j++) {
                if(union[j] == arr1[i]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                union[k++] = arr1[i];
            }
        }

        for(int i = 0; i < n2; i++) {
            boolean found = false;

            for(int j = 0; j < k; j++) {
                if(union[j] == arr2[i]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                union[k++] = arr2[i];
            }
        }

        for(int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }
}
}

package MergeSort;

import java.util.Scanner;

public class mergeOpgave {
    private static int[] merge(int[] A1, int[] A2) {

        // The length of the output must be the number of elements in the two input arrays

        int[] A = new int[A1.length + A2.length];

        // Pointers pointing to the next element to look at in A1 / A2

        int p = 0, p1 = 0, p2 = 0;

        // Look at the next element in each of the two next arrays

        // as long as they both have more elements

        while (p1 < A1.length && p2 < A2.length) {

            // Take the bigger of the two and add to the output

            if (A1[p1] < A2[p2]) {
                A[p] = A1[p1];

                p1++;

            } else {
                A[p] = A2[p2];

                p2++;

            }

            p++;

        }

        // Finally insert remaining elements from the list

        //  that was not yet looked entirely through

        while (p1 < A1.length) {
            A[p] = A1[p1];

            p1++;
            p++;

        }

        while (p2 < A2.length) {
            A[p] = A2[p2];

            p2++;
            p++;

        }
        return A;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N ; i++) {
            A[i] = scan.nextInt();
        }
        int M = scan.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M ; i++) {
            B[i] = scan.nextInt();
        }

        int[] C = merge(A,B);
        for (int value : C) {
            System.out.println(value);
        }
    }
}

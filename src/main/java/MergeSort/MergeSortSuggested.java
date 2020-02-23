package MergeSort;

import java.util.Scanner;

public class MergeSortSuggested {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n ; i++) {
            A[i] = scan.nextInt();
        }
        int[] sortedA = sort(A);
        for (int i = 0; i < n ; i++) {
            System.out.println(sortedA[i]);
        }
    }



    private static int[] sort(int[] numbers) {
        if (numbers.length <= 1) {

            return numbers;
        }

        // Divide numbers in two lists of roughly equal size

        int[] A1 = new int[numbers.length / 2];
        int[] A2 = new int[(numbers.length + 1) / 2];

        for (int i = 0; i < A1.length; i++) {
            A1[i] = numbers[i];

        }

        for (int i = 0; i < A2.length; i++) {
            A2[i] = numbers[A1.length + i];

        }

        // Recursively sort the two new lists

        A1 = sort(A1);
        A2 = sort(A2);

        // Combine the two sorted lists into one sorted list by merging them
        return merge(A1, A2);
    }

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
}

package ChristmasLightChain;

import java.util.Scanner;

public class ChristmasLightChain {
    public static void main(String[] args) {
        int count = 1;
        int max = 1;
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] numbers = new int[N];
        for (int i = 0; i < N ; i++) {
            numbers[i]=scan.nextInt();
        }
       int[]sorted = sort(numbers);
//        if(sorted[0] - sorted[1] == 1)
//            count = 1;

        for (int i = 1; i < N ; i++) {
            if(sorted[i] - sorted[i-1] == 1) {
                count++;
                if (count > max)
                    max = count;
            }
            else
                count = 1;
        }
        System.out.println(max);



    }

    private static int[] sort(int[] numbers) {
        if (numbers.length <= 1) {
            return numbers;
        }

        int[] A1 = new int[numbers.length / 2];
        int[] A2 = new int[(numbers.length + 1) / 2];

        for (int i = 0; i < A1.length; i++) {
            A1[i] = numbers[i];
        }

        for (int i = 0; i < A2.length; i++) {
            A2[i] = numbers[A1.length + i];

        }
        A1 = sort(A1);
        A2 = sort(A2);

        return merge(A1, A2);
    }

    private static int[] merge(int[] A1, int[] A2) {


        int[] A = new int[A1.length + A2.length];


        int p = 0, p1 = 0, p2 = 0;
        while (p1 < A1.length && p2 < A2.length) {
            if (A1[p1] < A2[p2]) {
                A[p] = A1[p1];
                p1++;
            } else {
                A[p] = A2[p2];
                p2++;
            }
            p++;
        }

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

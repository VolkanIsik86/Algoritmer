package Peaks;

import java.util.Scanner;

public class peak2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n ; i++) {
            A[i] = scan.nextInt();
        }
        System.out.println(peak2(A,n));
    }

    public static int peak2(int[] A , int n){
        int max = 0;
        for (int i = 0; i < n ; i++) {
            if (A[i] > A[max])
                max = i;
        }
        return max;
    }
}



//    FINDMAX(A, n)
//max = 0
//        for i = 0 to n-1
//        if (A[i] > A[max]) max = i
//        return max
package Peaks;

import java.util.Scanner;

public class peak3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n ; i++) {
            A[i] = scan.nextInt();
        }
        System.out.println(peak3(A,0,n));
    }
    public static int peak3(int[] A , int i , int j){
        int m = (i+j)/2;
        if (m==0 && A[m]>A[m+1])
            return m;
        if (m==j-1 && A[m+1] > A[m])
            return m;


        if (A[m] >= A[m-1] && A[m] >= A[m+1]){
            return m;
        }
        else if (A[m-1] > A[m]){
            return peak3(A,i,m-1);
        }
        else if (A[m] < A[m+1]){
            return peak3(A,m+1,j);
        }
        return -1;
    }
}

//    PEAK3(A,i,j)
//m = ⎣(i+j)/2)⎦
//        if A[m] ≥ neighbors return m
//        elseif A[m-1] > A[m]
//        return PEAK3(A,i,m-1)
//        elseif A[m] < A[m+1]
//        return PEAK3(A,m+1,j)
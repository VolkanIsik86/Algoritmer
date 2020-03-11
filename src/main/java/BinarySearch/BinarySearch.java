package BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] A , int i , int j , int x){
        if(j<i)
            return -1;
        int m = (i+j)/2;
        if (A[m]==x)
            return m;
        else if(A[m] < x)
            return binarySearch(A,m+1,j,x);
        else
            return binarySearch(A,i,m-1,x);


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N ; i++) {
            A[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        int[] q = new int[m];
        for (int i = 0; i < m ; i++) {
            q[i]  = scan.nextInt();
        }
        for (int i = 0; i < m ; i++) {
            System.out.println(binarySearch(A,0,N-1,q[i]));
        }
    }
}

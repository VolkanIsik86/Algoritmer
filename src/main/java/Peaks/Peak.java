package Peaks;

import java.util.Scanner;

public class Peak {
    public static int findPeak(int[] a){
        if (a[0]>=a[1]){
            return 0;
        }
        for (int i = 1; i <a.length-1 ; i++) {
            if(a[i-1] <= a[i] && a[i]>= a[i+1] ){
                return i;
            }
        }
        if (a[a.length -2] <= a[a.length-1]){
            return a.length -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n ; i++) {
            A[i] = scan.nextInt();
        }

        System.out.println(Peak.findPeak(A));
    }
}

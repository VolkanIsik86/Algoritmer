package MergeSort;

public class MergeSort {
    public static void main(String[] args) {
    int[] A = {2,3,3,1};

    mergeSort(A,0, 3);

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }
    public static void merge(int[] A , int p , int q , int r){
        int n1= q-p+1;
        int n2 = r-q;
        int[] L = new int[n1+2];
        int[] R = new int[n2+2];
        for (int i = 1; i <= n1 ; i++) {
            L[i] = A[p+i-1];
        }
        for (int j = 1; j <= n2 ; j++) {
            R[j] = A[q+j];
        }
        L[n1+1] = Integer.MAX_VALUE;
        R[n2+1] = Integer.MAX_VALUE;
        int i = 1;
        int j = 1;
        for (int k = p; k <= r ; k++) {
            if (L[i] <= R[j]){
                A[k] = L[i];
                i = i +1;
            }
            else {
                A[k] = R[j];
                j = j + 1;
            }
            }
    }
        public static void mergeSort(int[]A , int p , int r){
        if(p<r) {
            int q = ((p + r) / 2);
            mergeSort(A, p, q);
            mergeSort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }
}

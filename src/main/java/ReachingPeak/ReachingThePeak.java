package ReachingPeak;


import java.util.Scanner;

public class ReachingThePeak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        int [] A = new int[N];

        peak(A,0,N-1);

    }

    public static int peak(int[] A , int i , int j ){
        int m = (i+j) / 2;
        if (i==(j-1)) {
            System.out.println(j);
            return i;
        }

        if (i==j) {

            //    System.out.println(i);
                //result.add(i);

                return i;

        }
        if(!((j-m)==2) || (m-i)==2)
         peak(A,i,m-1);

         peak(A,m+1,j);

        return -1;
    }
}

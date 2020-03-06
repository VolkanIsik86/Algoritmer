package ReachingPeak;


import java.util.Scanner;

public class ReachingThePeak {
    static int call;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        int[] A = new int[N];
        call = (int)(Math.ceil(Math.log(N) / Math.log(2)));
        peak(A, 0, N - 1,0);

    }
    public static int peak(int[] A, int i, int j,int calls) {
        calls++;
        int m = (i + j) / 2;

        if (i == j) {
            if (call == calls)
                System.out.println(m);
            if (call == 0) {
                System.out.println(m);
                return i;
            }

            return i;
        }
        if(call==1) {
            System.out.println(i);
            System.out.println(j);
            return i;
        }

            if (!(m==i))
           peak(A, i, (m - 1),calls);
           peak(A, (m + 1), j,calls);

        return -1;
    }
}
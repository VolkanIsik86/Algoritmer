package Queue;

import java.util.Scanner;

public class Queue {
    static int top = -1;
    static int tail = 0;
    static int[] A = new int[1];
    public static void enqueue(int x){
        if (top == (A.length-1)){
            int[] B = new int[A.length*2];
            for (int i = 0; i < A.length ; i++) {
                B[i] = A[i];
            }
            A=B;
        }

        top++;
        A[top]=x;
    }
    public static void dequeue(){
        System.out.println(A[tail]);
        A[tail]=Integer.MIN_VALUE;
        tail++;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < N ; i++) {
            String input = scan.nextLine();

            if(input.substring(0,1).equalsIgnoreCase("E")){
                enqueue(Integer.parseInt(input.substring(2)));
            }
            if(input.substring(0).equalsIgnoreCase("D")){
                dequeue();
            }
        }

    }
}





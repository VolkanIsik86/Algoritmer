package Stack;

import java.util.Scanner;

public class Stack {
    static int top = -1;
    static int [] A = new int[1];
    public static void push(int x){
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
    public static void pop(){
        if(top>=0){
            System.out.println(A[top]);
            A[top]= Integer.MIN_VALUE;
        }
        top--;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < N ; i++) {
            String input = scan.nextLine();

            if(input.substring(0,2).equalsIgnoreCase("PU")){
                push(Integer.parseInt(input.substring(3)));
            }
            if(input.substring(0,2).equalsIgnoreCase("PO")){
                pop();
            }
        }

    }
}

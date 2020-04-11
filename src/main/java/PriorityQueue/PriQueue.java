package PriorityQueue;

import java.util.ArrayList;
import java.util.Scanner;

public class PriQueue {
    static int n = 0;
    static int[] Heap;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        Heap = new int[N];

        for (int i = 0; i < N ; i++) {
            String input = scan.nextLine();

            if(input.charAt(0)=='I'){
                int x = Integer.parseInt(input.substring(2));
                insert(x);
            }
            else if(input.charAt(0)=='E'){
                System.out.println(extractMax());
            }
            else if(input.charAt(0)=='P'){
                for (int j = 1; j < n+1 ; j++) {
                    System.out.println(Heap[j]);
                }
            }
        }
    }

    static int max(){
    return Heap[1];
    }
    static int extractMax(){
        int r = Heap[1];
       Heap[1] = Heap[n];
        n = n - 1;
        bubbleDown(1);
        return r;
    }
    static void insert(int x){
        n = n + 1;
        Heap[n]=x;
        bubbleUP(n);
    }
    static void bubbleUP(int n){
        if(n<2)
            return;
        int parent =  Heap[n/2];
        int child = Heap[n];

        if(child > parent){
            Heap[n/2] = child;
            Heap[n]=parent;
            int m = n/2;
            bubbleUP(m);
        }
    }
    static void bubbleDown(int n){

        if((n*2) < Heap.length) {
            int parent = Heap[n];
            int child = Heap[n*2];
            int child2 = Heap[(n*2)+1];

            if(child2>child && (n*2) < Heap.length ){
                Heap[(n*2)+1]=parent;
                Heap[n]=child;
                n = (n * 2) + 1;
                bubbleDown(n);
            }

            else if (parent < child) {
                Heap[n*2]=parent;
                Heap[n]=child;
                n = n * 2;
                bubbleDown(n);
            }
        }
    }


}

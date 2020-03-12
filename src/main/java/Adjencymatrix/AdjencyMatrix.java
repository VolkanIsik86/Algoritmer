package Adjencymatrix;

import java.util.Scanner;

public class AdjencyMatrix {

    static void insert(boolean[][] matrix , int v , int u){
        matrix[v][u]=true;
        matrix[u][v]=true;
    }
    static String adjacent(boolean[][] matrix , int v , int u){
        if(matrix[v][u]==true)
            return "YES";
        else
            return "NO";
    }
    static void neighbors(boolean[][] matrix , int v) {
        for (int i = 0; i <matrix[v].length ; i++) {
            if(matrix[v][i]==true){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();
        int E = scan.nextInt();
        boolean[][] matrix = new boolean[V][V];


        for (int i = 0; i < E ; i++) {
            int v = scan.nextInt();
            int u = scan.nextInt();
            insert(matrix,v,u);
        }

        int adja = scan.nextInt();

            for (int j = 0; j < adja ; j++) {
                int v = scan.nextInt();
                int u = scan.nextInt();
                System.out.println(adjacent(matrix,v,u));

        }
        int neigh = scan.nextInt();

            for (int j = 0; j < neigh ; j++) {
                int v = scan.nextInt();
                neighbors(matrix,v);
            }
        }

}
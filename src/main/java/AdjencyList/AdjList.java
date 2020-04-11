package AdjencyList;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjList {
   static ArrayList<Integer>[] G;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int V = scan.nextInt();
        G = new ArrayList[V];
        init(G,V);

        int E = scan.nextInt();
        for (int i = 0; i < E ; i++) {
            int v = scan.nextInt();
            int u = scan.nextInt();
            insert(v , u);
        }

        int nrOFQueries = scan.nextInt();
        for (int i = 0; i < nrOFQueries ; i++) {
            int v = scan.nextInt();
            int u = scan.nextInt();
            scan.nextLine();
            System.out.println(adjacent(v,u));
        }


        int nrOfPrint = scan.nextInt();
        for (int i = 0; i < nrOfPrint ; i++) {
            int v = scan.nextInt();
            scan.nextLine();
            int[] neig = neighbors(v);
            for (int j = 0; j < neig.length ; j++) {
                System.out.println(neig[j]);
            }
        }
    }
   public static String adjacent(int v , int u){
        String temp = "NO";

       for (int i = 0; i < G[v].size() ; i++) {
          if(G[v].get(i) == u){
              temp = "YES";
              return temp;
          }
       }
       return temp;
   }
   public static int[] neighbors(int v){
        int temp[] = new int[G[v].size()];
       for (int i = 0; i < G[v].size() ; i++) {
           temp[i] = G[v].get(i);
       }
       return temp;
   }
   public static void insert(int v, int u){
       G[v].add(u);
       G[u].add(v);

   }
   public static void init(ArrayList<Integer>[] G,int V){
       for (int i = 0; i < V ; i++) {
            G[i] = new ArrayList<Integer>();
       }
   }
}

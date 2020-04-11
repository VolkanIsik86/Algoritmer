package DFS;
import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
      static ArrayList<Integer>[] edges;
      static int time;
      static boolean[] visited;

    public static void dfs(boolean[] visited){

        //Besøg en specifik vertex
        visit(0);

        //Besøg alle vertex
      //  for (int vertex = 0; vertex < edges.length ; vertex++) {
        //    if(!visited[vertex]){
       //         visit(vertex);
        //    }
      //  }
    }

    private static void visit(int vertex) {
        visited[vertex] = true;
        System.out.println(vertex);
        for (int neigbour = 0; neigbour < edges[vertex].size()  ; neigbour++) {
            if(!visited[edges[vertex].get(neigbour)]){
                visit(edges[vertex].get(neigbour));
            }
        }
        System.out.println(vertex);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();
        edges = new ArrayList[V];
        for (int i = 0; i < V ; i++) {
            edges[i] = new ArrayList<>();
        }
        visited = new boolean[V];
        for (int i = 0; i < V ; i++) {
            visited[i] = false;
        }
        int E = scan.nextInt();
        for (int i = 0; i < E ; i++) {
            int v = scan.nextInt();
            int u = scan.nextInt();
            edges[v].add(u);
        }

        dfs(visited);

    }
}

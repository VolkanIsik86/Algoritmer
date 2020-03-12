package DFS;

import java.util.*;

public class DFS {
    private LinkedList<Integer>[] edges;
    private boolean[] visited;
    public void dfs(){
        for(int vertex = 0 ; vertex < edges.length; vertex++){
            visited[vertex] = false;
        }
        for (int vertex = 0; vertex < edges.length; vertex++){
            if(!visited[vertex]){
                visit(vertex);
            }
        }
    }
    void visit(int vertex){
        visited[vertex] = true;
        for (int neighbour = 0; neighbour < edges[vertex].size(); neighbour++) {
            if(!visited[neighbour]){
                visit(neighbour);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();
        int E = scan.nextInt();
    }

}

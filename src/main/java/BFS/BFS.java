package BFS;

import java.util.ArrayList;
import java.util.Scanner;

public class BFS {
    static boolean[] visited;
    static ArrayList<Integer>[] edges;
    static Queue Q = new Queue();
    public static void bfs(int S){
        int discovery = 0;
        visited[S] = true;
        Q.enqueue(S);
        while (Q.elements>0){
            int vertex = Q.dequeue();
            for (int i = 0; i < edges[vertex].size() ; i++) {
                if (!visited[edges[vertex].get(i)]) {
                    visited[edges[vertex].get(i)] = true;
                    Q.enqueue(edges[vertex].get(i));
                    if (i==0)
                        discovery++;
                }


            }
        }
        System.out.println(discovery);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();
        edges = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            edges[i] = new ArrayList<>();
        }
        visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i] = false;
        }
        int E = scan.nextInt();
        for (int i = 0; i < E; i++) {
            int v = scan.nextInt();
            int u = scan.nextInt();
            edges[v].add(u);
        }
        bfs(0);
    }













    static class Queue {
        int elements = 0;
        // Probably add some local variables here
        class Node {
            public Node next;
            public int value;
        }
        private Node start = null, end = null;

        public int getElements() {
            return elements;
        }

        public void enqueue(int e) {
            elements++;
            Node node = new Node();
            node.value = e;
            if (end != null) {
                end.next = node;
            }
            end = node;
            if (start == null) {
                start = node;
            }
        }

        public int dequeue() {
            elements--;
            int value = start.value;
            start = start.next;
            if (start == null) {
                end = null;
            }
            return value;
        }
    }
}

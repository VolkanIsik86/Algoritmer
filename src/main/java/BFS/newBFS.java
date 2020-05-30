package BFS;

import java.util.Scanner;

public class newBFS {

   static class node{
        node prev=null;
        node next=null;
        int key;
        node parent = null;
        int d =0;

    }

    public static class AdjacencyList {
        node nodes[];
        public AdjacencyList(int numberofNodes){
            this.nodes = new node[numberofNodes];
            for (int i = 0; i <numberofNodes ; i++) {
                nodes[i]= new node();
                nodes[i].key = i;
            }
        }
        public void insert(int v, int u){
            node x = nodes[v];
            while (x.next!=null) {
                   x = x.next;
               }
                node temp = new node();
                temp.key = u;
                x.next = temp;
        }
    }
   static class Queue {
        // Probably add some local variables here
        class Qnode {

            public Qnode next;
            public node ref;
            public int value;

        }
        private Qnode start = null, end = null;

        public void enqueue(node e) {

            Qnode node = new Qnode();
            node.value = e.key;
            node.ref = e;
            if (end != null) {
                end.next = node;
            }
            end = node;
            if (start == null) {
                start = node;
            }
        }
        public node dequeue() {
            Qnode temp = start;
            start = start.next;

            if (start == null) {
                end = null;
            }
            return temp.ref;
        }
        public boolean isEmpty(){
            if(start==null && end == null){
                return true;
            }
            else return false;
        }
    }

    public static int BFS(AdjacencyList adjacencyList){
       boolean marks[] = new boolean[adjacencyList.nodes.length];
       Queue Q = new Queue();
       marks[0] = true;
        adjacencyList.nodes[0].d=0;
        Q.enqueue(adjacencyList.nodes[0]);
        while (!Q.isEmpty()){
            node v = Q.dequeue();
            node ind = v;
            int discovery = v.d;
            while (v.next!=null){
                if (!marks[v.next.key]) {
                    node u = adjacencyList.nodes[v.next.key];
                    marks[u.key] = true;
                    u.d = discovery + 1;
                    u.parent = ind;
                    Q.enqueue(u);

                }
                v = v.next;
            }
        }

       return adjacencyList.nodes[1].d;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int V = scan.nextInt();
        int E = scan.nextInt();

        AdjacencyList adjacencyList = new AdjacencyList(V);

        for (int i = 0; i < E ; i++) {
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();
            adjacencyList.insert(v1,v2);
        }
        System.out.println(BFS(adjacencyList));




    }

}

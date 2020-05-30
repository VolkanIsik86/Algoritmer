package BFS;

//import java.util.Queue;
//
//public class suggestedBFS {
//    public int bfs(int start, int end) {
//
//        int[] dist = new int[V];
//
//
//
//        for (int i = 0; i < V; i++) {
//
//            dist[i] = -1;
//
//        }
//
//
//
//        Queue queue = new LinkedList();
//
//        queue.offer(start);
//
//        dist[start] = 0;
//
//
//
//        while (queue.peek() != null) {
//
//            int cur = queue.remove();
//
//
//
//            if (cur == end) {
//
//                return dist[end];
//
//            }
//
//
//
//            for (Integer neighbour : edges[cur]) {
//
//                if (dist[neighbour] == -1) {
//
//                    queue.offer(neighbour);
//
//                    dist[neighbour] = dist[cur] + 1;
//
//                }
//
//            }
//
//        }
//
//
//
//        return -1;
//
//    }
//}

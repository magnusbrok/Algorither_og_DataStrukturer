package øvelserSiff.week6_DirectedGraphs;

import java.util.*;

public class BFSImpl {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int V = scan.nextInt();
        DirectedGraph.init(V, adjList);

        int E = scan.nextInt();
        for (int i = 0; i < E; i++){
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();
            DirectedGraph.addEdge(v1, v2, adjList);
        }

        int dist = BFS.iterative(0, 4, adjList);
        System.out.println(dist);
    }

    private static class DirectedGraph {

        public static void init(int V, ArrayList<ArrayList<Integer>> adjList){
            for (int i = 0; i < V; i++){
                adjList.add(new ArrayList<>());
            }
        }

        public static void addEdge(int v1, int v2, ArrayList<ArrayList<Integer>> adjList){
            adjList.get(v1).add(v2);
            Collections.sort(adjList.get(v1));
        }
    }

    private static class BFS {
        static int n;
        static ArrayList<ArrayList<Integer>> adjList;
        static boolean[] marked;
        static int[] distance;

        private static void init(ArrayList<ArrayList<Integer>> adj){
            n = adj.size();
            adjList = adj;
            marked = new boolean[n];
            distance = new int[n];
        }

        public static int iterative(int s, int f, ArrayList<ArrayList<Integer>> adj) {
            init(adj);

            Queue<Integer> queue = new LinkedList<>();
            queue.add(s);
            distance[s] = 0;

            while (!queue.isEmpty()){
                int v = queue.remove();
                ArrayList<Integer> neighbours = adjList.get(v);

                for (int i : neighbours) {
                    if (!marked[i]) {
                        marked[i] = true;
                        distance[i] = distance[v] + 1;
                        if (i == f){
                            return distance[f];
                        }
                        queue.add(i);
                    }
                }
            }
            return -1; // if f is not reachable or do not exist
        }
    }
}

package øvelserSiff.week6_DirectedGraphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class DFSImpl {

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

        String str = DFS.recursive(0, adjList);
        System.out.println(str);
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

    private static class DFS{
        static int n;
        static ArrayList<ArrayList<Integer>> adjList;
        static boolean[] marked;
        static int time;

        public static String recursive(int v, ArrayList<ArrayList<Integer>> adj){
            n = adj.size();
            adjList = adj;
            marked = new boolean[n];
            time = 0;
            StringBuilder path = new StringBuilder();
            visit(v, path);
            return path.toString();
        }

        private static void visit(int v, StringBuilder path){
            marked[v] = true;
//            System.out.print(time++ + " ");
            path.append(v).append("\n");
            for (int i : adjList.get(v)){
                if (!marked[i]){
                    visit(i, path);
                }
            }
//            System.out.print(time++ + " ");
            path.append(v).append("\n");
        }

        public static String iterative(int v, ArrayList<ArrayList<Integer>> adj) {
            n = adj.size();
            adjList = adj;
            marked = new boolean[n];
            StringBuilder discoveryOrder = new StringBuilder();

            Stack<Integer> stack = new Stack<>();
            stack.push(v);

            while (!stack.isEmpty()) {
                int s = stack.pop();
                if (marked[s]) {
                    continue;
                }

                marked[s] = true;
                discoveryOrder.append(s).append(" ");
                if (!adjList.get(s).isEmpty()) {
                    ArrayList<Integer> neighbours = adjList.get(s);
                    neighbours.sort(Collections.reverseOrder());
                    for (int i : neighbours) {
                        if (!marked[i]) stack.push(i);
                    }
                }
            }
            return discoveryOrder.toString();
        }
    }
}

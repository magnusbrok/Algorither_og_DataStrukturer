package øvelserSiff.week6_DirectedGraphs;

import øvelserSiff.week5_UndrirectedGraphs.AdjacencyLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class DFS {

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

        DirectedGraph.DFSIterative(0, adjList);
    }

    private static class DirectedGraph {

        public static void init(int V, ArrayList<ArrayList<Integer>> adjList){
            for (int i = 0; i < V; i++){
                adjList.add(new ArrayList<>());
            }
        }

        public static void addEdge(int v1, int v2, ArrayList<ArrayList<Integer>> adjList){
            adjList.get(v1).add(v2);
            adjList.get(v1).sort(Collections.reverseOrder());
        }

        public static String DFSIterative(int v, ArrayList<ArrayList<Integer>> adjList){
            int n = adjList.size();
            boolean[] marked = new boolean[n];
            StringBuilder discoveryOrder = new StringBuilder();

            Stack<Integer> stack = new Stack<>();
            stack.push(v);

            while (!stack.isEmpty()){
                int s = stack.pop();
                if (marked[s]) {
                    continue;
                }

                marked[s] = true;
                discoveryOrder.append(s).append(" ");
                if(!adjList.get(s).isEmpty()){
                    ArrayList<Integer> neighbours = adjList.get(s);
                    for (int i : neighbours){
                        if (!marked[i]) stack.push(i);
                    }
                }
            }
            return discoveryOrder.toString();
        }
    }
}

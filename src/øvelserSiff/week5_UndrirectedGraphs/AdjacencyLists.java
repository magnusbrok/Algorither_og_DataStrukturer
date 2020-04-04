package øvelserSiff.week5_UndrirectedGraphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AdjacencyLists {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        int V = scan.nextInt();
        UndirectedGraph.init(V, adjList);

        int E = scan.nextInt();
        for (int i = 0; i < E; i++){
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();
            UndirectedGraph.addEdge(v1, v2, adjList);
        }

        int Q1 = scan.nextInt();
        for (int i = 0; i < Q1; i++){
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();
            if (UndirectedGraph.isNeighbours(v1, v2, adjList)) System.out.println("YES");
            else System.out.println("NO");
        }

        int Q2 = scan.nextInt();
        for (int i = 0; i < Q2; i++){
            int v = scan.nextInt();
            ArrayList<Integer> neighbours = UndirectedGraph.neighbours(v, adjList);
            Collections.sort(neighbours);
            StringBuilder str = new StringBuilder();
            for (int neighbour : neighbours) {
                str.append(neighbour).append(" ");
            }
            System.out.println(str);
        }

    }

    public static class UndirectedGraph {

        public static void init(int V, ArrayList<ArrayList<Integer>> adjList){
            for (int i = 0; i < V; i++){
                adjList.add(new ArrayList<>());
            }
        }

        public static void addEdge(int v1, int v2, ArrayList<ArrayList<Integer>> adjList){
            adjList.get(v1).add(v2);
            adjList.get(v2).add(v1);
        }

        public static boolean isNeighbours(int v1, int v2, ArrayList<ArrayList<Integer>> adjList){
            return adjList.get(v1).contains(v2);
        }

        public static ArrayList<Integer> neighbours(int v, ArrayList<ArrayList<Integer>> adjList){
            return adjList.get(v);
        }
    }
}

package øvelserSiff.week5_UndrirectedGraphs;

import java.util.Scanner;

public class AdjacencyMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int V = scan.nextInt();
        boolean[][] adjMatrix = new boolean[V][V];

        int E = scan.nextInt();
        for (int i = 0; i < E; i++){
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();
            UndirectedGraph.addEdge(v1, v2, adjMatrix);
        }

        int Q1 = scan.nextInt();
        for (int i = 0; i < Q1; i++){
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();
            if (UndirectedGraph.isNeighbours(v1, v2, adjMatrix)) System.out.println("YES");
            else System.out.println("NO");
        }

        int Q2 = scan.nextInt();
        for (int i = 0; i < Q2; i++){
            int v = scan.nextInt();
            String neighbours = UndirectedGraph.neighbours(v, adjMatrix);
            System.out.println(neighbours);
        }

    }

    public static class UndirectedGraph {

        public static void addEdge(int v1, int v2, boolean[][] adjMatrix){
            adjMatrix[v1][v2] = true;
            adjMatrix[v2][v1] = true;
        }

        public static boolean isNeighbours(int v1, int v2, boolean[][] adjMatrix){
            return adjMatrix[v1][v2];
        }

        public static String neighbours(int v, boolean[][] adjMatrix){
            boolean[] neighbours = adjMatrix[v];
            int length = adjMatrix.length;
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < length; i++) {
                if (neighbours[i]) str.append(i).append(" ");
            }
            return str.toString();
        }
    }
}

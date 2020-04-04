package afleveringer.Mandatory4;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class HazardousHands {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        int patientZero = scan.nextInt();
        int nrPersons = scan.nextInt();
        int nrHandshakes = scan.nextInt();


        Graph graph = new Graph(nrPersons);

        for (int i = 0 ; i < nrHandshakes ; i++){
            graph.addEdge(scan.nextInt(), scan.nextInt());
        }




        System.out.println(graph.findInfected(patientZero));


    }

    public static class Graph{
        private int n;
        private  LinkedList<Integer> adjacency[];

        Graph(int v)
        {
            n = v;
            adjacency = new LinkedList[v];
            for (int i=0; i<v; ++i)
                adjacency[i] = new LinkedList();
        }

        // Function to add an edge into the graph
        void addEdge(int v,int w)
        {
            adjacency[v].add(w);
            adjacency[w].add(v);
        }

        public int findInfected(int patientZero) {
            // Mark all the vertices as not visited(By default
            // set as false)
            boolean visited[] = new boolean[n];
            int currentPerson;
            int numberOffInfected = 1;

            // Create a queue for BFS
            LinkedList<Integer> queue = new LinkedList<Integer>();

            // Mark the current node as visited and enqueue it
            visited[patientZero]=true;
            queue.add(patientZero);

            while (queue.size() != 0)
            {
                // Dequeue a vertex from queue and print it
                currentPerson = queue.poll();


                // Get all adjacent vertices of the dequeued vertex s
                // If a adjacent has not been visited, then mark it
                // visited and enqueue it
                Iterator<Integer> i = adjacency[currentPerson].listIterator();
                while (i.hasNext())
                {
                    int n = i.next();
                    if (!visited[n])
                    {
                        visited[n] = true;
                        queue.add(n);
                        numberOffInfected++;

                    }
                }
            }
            return numberOffInfected;
        }
    }
}
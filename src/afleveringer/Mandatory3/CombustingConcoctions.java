package afleveringer.Mandatory3;

import java.util.ArrayList;
import java.util.Scanner;

public class CombustingConcoctions {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < N; i++){
            adjList.add(new ArrayList<>());
        }
        for (int i = 0; i < M; i++){
            int s = scan.nextInt();
            int f = scan.nextInt();
            adjList.get(s).add(f);
            adjList.get(f).add(s);
        }

        String output = ALG(adjList, N);

        System.out.println(output);

    }

    public static String ALG(ArrayList<ArrayList<Integer>> adjList, int N){
        ArrayList<Integer> pot1 = new ArrayList<>();
        ArrayList<Integer> pot2 = new ArrayList<>();
        int i = 1;

        pot1.add(0);

        while (i < N){
            boolean pot1OK = true;
            boolean pot2OK = true;
            ArrayList<Integer> explosive = adjList.get(i);
            int n = explosive.size();
            int e = 0;

            // Check each adjacent ingredient weather it in one of the pots
            while (e < n){
                if (pot1.contains(explosive.get(e))){
                    pot1OK = false;
                }
                if (pot2.contains(explosive.get(e))){
                    pot2OK = false;
                }
                if (!pot1OK && !pot2OK){
                    return "BOOM!";
                }
                e++;
            }

            if (pot1OK){
                pot1.add(i);
            }
            else {
                pot2.add(i);
            }

            i++;
        }

        String output = "";

        if (pot1.size() > pot2.size()){
            for (Integer curr : pot1 ) {
                output += curr + " ";

            }
            output += "\n";
            for (Integer curr : pot2 ) {
                output += curr + " ";
            }

        }else{
            for (Integer curr : pot2 ) {
                output += curr + " ";
            }
            output += "\n";
            for (Integer curr : pot1 ) {
                output += curr + " ";
            }
        }
        return output;
    }

    public static ArrayList<ArrayList<Integer>> generateAdjList(int N, int M, String str){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < N; i++){
            adjList.add(new ArrayList<>());
        }

        Scanner scan = new Scanner(str);
        for (int i = 0; i < M; i++){
            int s = scan.nextInt();
            int f = scan.nextInt();
            adjList.get(s).add(f);
            adjList.get(f).add(s);
        }

        return adjList;
    }
}

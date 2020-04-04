package afleveringer.Mandatory4;

import java.util.ArrayList;
import java.util.Scanner;

public class ClustersOfCapitalism {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int b = scan.nextInt();
        int N = scan.nextInt();
        int[] surplus = new int[N];
        for (int i = 0; i < N; i++){
            surplus[i] = scan.nextInt();
        }
        Republic.init(N, surplus);

        int M = scan.nextInt();
        for (int k = 0; k < M; k++){
            int i = scan.nextInt();
            int j = scan.nextInt();
            Republic.union(i, j);
        }
        
        ArrayList<Integer> states = ALG(Republic.p);

        String result = ALG2(states, b, Republic.surplus);

        System.out.println(result);
    }

    public static ArrayList<Integer> ALG(int[] p){
        ArrayList<Integer> states = new ArrayList<>();
        for (int i : p) {
            int state = Republic.find(i);
            if (!states.contains(state)){
                states.add(state);
            }
        }
        return states;
    }

    public static String ALG2(ArrayList<Integer> states, int b, int[] surplus){
        int S = states.size();
        int B = S-1;
        int costs = B*b;
        int share = costs / S + 1;

        for (int i : states) {
            if(surplus[i] < share){
                return "Impossible";
            }
        }
        return "" + costs;
    }

    private static class Republic {

        public static int[] p;
        public static int[] surplus;
        private static int[] size;

        public static void init(int N, int[] c){
            p = new int[N];
            for (int i = 0; i < N; i++){
                p[i] = i;
            }
            surplus = c;
            size = new int[N];
            for (int i = 0; i < N; i++){
                size[i] = 1;
            }
        }

        public static void union(int i, int j){
            int ri = find(i);
            int rj = find(j);

            if(ri != rj){
                if(size[ri] < size[rj]){
                    p[ri] = rj;
                    size[rj] += size[ri];
                    surplus[rj] += surplus[ri];
                }
                else{
                    p[rj] = ri;
                    size[ri] = size[ri]+size[rj];
                    surplus[ri] += surplus[rj];
                }
            }
        }

        public static int find(int i){
            ArrayList<Integer> route = new ArrayList<>();
            while (i != p[i]){
                route.add(i);
                i = p[i];
            }
            for (int r : route){
                p[r] = i;
            }
            return i;
        }
    }
}

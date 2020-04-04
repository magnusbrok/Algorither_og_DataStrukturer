package øvelserSiff.week7_union;

import java.util.Scanner;

public class QuickFind {
    private static int[] id;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        scan.nextLine(); // wft? fixes the bug...

        init(N);

        for (int k = 0; k < M; k++){
            String str = scan.nextLine();
            Scanner strScan = new Scanner(str);

            if (strScan.next().contains("F")){
                int i = Integer.parseInt(strScan.next());
                int r = find(i);
                System.out.println(r);
            }
            else {
                int i = Integer.parseInt(strScan.next());
                int j = Integer.parseInt(strScan.next());
                union(i, j);
            }
        }
    }

    public static void init(int N){
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public static int find(int i){
        return id[i];
    }

    public static void union(int i, int j){
        int iID = find(i);
        int jID = find(j);

        if(iID != jID){
            for(int k = 0; k < id.length; k++){
                if(id[k] == iID){
                    id[k] = jID;
                }
            }
        }
    }
}

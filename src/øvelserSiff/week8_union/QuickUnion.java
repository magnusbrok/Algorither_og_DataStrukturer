package øvelserSiff.week8_union;

import java.util.Scanner;

public class QuickUnion {

    private static int[] p;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();

        scan.nextLine(); // wft? fixes the bug...

        p = init(N);

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

    public static int[] init(int N){
        int[] arr = new int[N];
        for (int i = 0; i < N; i++){
            arr[i] = i;
        }
        return arr;
    }

    public static int find(int i){
        while (i != p[i]){
            i = p[i];
        }
        return i;
    }

    public static void union(int i, int j){
        int ri = find(i);
        int rj = find(j);

        if(ri != rj){
            p[ri] = rj;
        }
    }
}

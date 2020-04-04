package øvelserSiff.week8_union;

import java.util.Arrays;
import java.util.Scanner;

public class WeightedUnion {

    private static int[] p;
    private static int[] size;

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

        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(size));
    }

    public static void init(int N){
        p = new int[N];
        for (int i = 0; i < N; i++){
            p[i] = i;
        }
        size = new int[N];
        for (int i = 0; i < N; i++){
            size[i] = 1;
        }
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
            if(size[ri] < size[rj]){
                p[ri] = rj;
                size[rj] = size[ri]+size[rj];
            }
            else{
                p[rj] = ri;
                size[ri] = size[ri]+size[rj];
            }
        }
    }
}

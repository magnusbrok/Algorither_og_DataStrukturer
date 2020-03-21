package afleveringer.Mandatory3;

import java.util.Arrays;
import java.util.Scanner;

public class ChristmasLightChain {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n;
        int longestChain = 0;

        n = scan.nextInt();
        int[] husNumre = new int[n];

        for (int i = 0; i < n; i++) {
            husNumre[i] = scan.nextInt();
        }
        Arrays.sort(husNumre);


        int a = 0;
        int b = 1;
        while (a < n - 1 && b < n) {
            if (husNumre[a]+(b-a) == husNumre[b]) {
                if ((b - a + 1) > longestChain) {
                    longestChain = b-a+1;
                }
                b++;
            } else {
                a = b;
                b = a+1;
            }
        }
        System.out.println(longestChain);
    }

}

package øvelserMagnus.week1;

import java.util.Scanner;

public class PeakAlgo1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
// make array from input
        int n = scan.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] > array[max]) max = i;
        }
        System.out.println(max);
    }
}

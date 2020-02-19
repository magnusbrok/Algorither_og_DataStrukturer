package øvelserMagnus.week1;

import java.util.Scanner;

public class PeakAlgo3 {
    public static void main(String[] args) {
        PeakAlgo3 peakAlgo3 = new PeakAlgo3();
        Scanner scan = new Scanner(System.in);
        // make array from input
  //      int n = 10;
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int n = scan.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }

       // System.out.println(peakAlgo3.peak(array, 0, array.length-1));
        System.out.println(peakAlgo3.peakiterative(array));
    }

    int peak(int[] array, int i, int j) {

        int m = (i+j)/2;
/**
        System.out.println("m =" +m);
        System.out.println("i =" + i);
        System.out.println("j =" +j);
        System.out.println("");
 **/
        if (m == j && m == i) {
            return m;
        }
        if (array[m] >= array[m + 1] && array[m] >= array[m - 1]) {
            return m;
        }

        else if (array[m-1] >= array[m]) return peak(array, i, m-1);
        else if (array[m] <= array[m+1]) return peak(array, m+1,j);
        else return 0;
    }

    int peakiterative(int[] array){
        boolean peakFound= false;
        int i = 0;
        int j = array.length-1;




        while (!peakFound){
            int m = (i+j)/2;

            if (m == j && m == i) {
                return m;
            }
            if (array[m] >= array[m + 1] && array[m] >= array[m - 1]) {
                return m;
            }

            if (array[m-1] >= array[m]) j = m-1;
            else if (array[m] <= array[m+1]) i = m+1;
        }
        return 0;
    }
}
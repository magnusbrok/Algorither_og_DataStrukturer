package afleveringer.Mandatory2;

import java.util.ArrayList;
import java.util.Scanner;

public class ReachingPeak {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ReachingPeak peakClass = new ReachingPeak();

        ArrayList<Integer> worstSpots = new ArrayList<>();
        int n = scan.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        System.out.println(peakClass.findWorstPeak(array, 0, n-1, worstSpots));

    }

    public ArrayList<Integer> findWorstPeak(int[] array, int i, int j, ArrayList<Integer> worstSpots){


        if (i != j) {
            worstSpots.add(i);
            return worstSpots;
        }

        else {
            worstSpots.add(halfArray(array, i, j));
        }




        return worstSpots;
    }

    public int halfArray(int[] array, int i, int j){


        return 0;
    }
}

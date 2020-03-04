package afleveringer.Mandatory2;

import java.util.ArrayList;
import java.util.Scanner;

public class ReachingPeak {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ReachingPeak peakClass = new ReachingPeak();

        int n = scan.nextInt();
        int [] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = i;
        }

        System.out.println(peakClass.findWorstPeak(array, 0, n-1));

    }

    public ArrayList<Integer> findWorstPeak(int[] array, int i, int j){

        ArrayList<Integer> worstSpots = new ArrayList<>();

        if (i == j) {
            worstSpots.add(0);
            return worstSpots;
        } 


        return worstSpots;
    }
}

package øvelserSiff.week1_IntroductionAndPeaks;

import java.util.Scanner;

public class OPG_51_Linear {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n, peak;

        n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        peak = findPeak(arr,n);

        System.out.println(peak);
    }


    private static int findPeak(int[] arr, int n){

        int maxPeakIndex = 0;

        for (int i = 0; i < n; i++)
            if (arr[i] > arr[maxPeakIndex]){
                maxPeakIndex = i;
            }

        return maxPeakIndex;
    }
}

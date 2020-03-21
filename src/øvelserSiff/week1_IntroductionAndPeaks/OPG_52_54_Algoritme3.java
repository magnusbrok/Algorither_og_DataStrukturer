package øvelserSiff.week1_IntroductionAndPeaks;

import java.util.Scanner;

public class OPG_52_54_Algoritme3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = 0, peak = 0;

        n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        peak = findPrakItterative(arr, 0, n-1);

        System.out.println(peak);
    }


    private static int findPeakRecursive(int[] arr, int i, int j){

        int m = (i + j)/2;

        if(m == 0 || m == arr.length-1){
            return m;
        }
        else if (arr[m -1] <= arr[m] && arr[m] >= arr[m+1] ){
            return m;
        }
        else if (arr[m -1] > arr[m]){
            return findPeakRecursive(arr, i, m-1);
        }
        else {
            return findPeakRecursive(arr, i+1, j);
        }
    }

    public static int findPrakItterative(int[] arr, int i, int j){

        do{
            int midIndex = (i + j)/2;

            if(midIndex == 0 || midIndex == arr.length-1){
                return midIndex;
            }
            else if (arr[midIndex -1] <= arr[midIndex] && arr[midIndex] >= arr[midIndex+1] ) {
                return midIndex;
            }
            else if (arr[midIndex -1] > arr[midIndex]){

                j = midIndex-1;

            }
            else {
                i = midIndex+1;
            }

        }while (true);
    }
}

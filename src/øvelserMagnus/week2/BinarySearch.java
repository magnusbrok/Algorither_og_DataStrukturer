package øvelserMagnus.week2;

import java.util.Scanner;

public class BinarySearch {


    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        Scanner scan = new Scanner(System.in);
/**
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] targets = {1, 5, 111};
 **/

        int arrayLenght = scan.nextInt();
        int[] array = new int[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
            array[i] = scan.nextInt();
        }
        int targetsLenght = scan.nextInt();
        int[] targets = new int[targetsLenght];

        for (int i = 0; i < targetsLenght; i++) {
            targets[i] = scan.nextInt();
        }

        for (int i : targets) {
            System.out.println(binarySearch.binarySearchRecursive(array,0, array.length-1, i));
        }

    }


    public int binarySearchRecursive(int[] array, int i, int j, int target) {

        if (j < i) return -1;

        int m = (i+j)/2;

        if (array[m] == target) return m;
        else if (array[m] < target) return binarySearchRecursive(array, m+1, j, target);
        else return binarySearchRecursive(array, i, m-1, target);
    }

}

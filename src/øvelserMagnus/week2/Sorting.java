package øvelserMagnus.week2;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Sorting sorter = new Sorting();
        Scanner scan = new Scanner(System.in);

 int[] array = {1, 10, 3, 4, 5};
 int[] array2 = {3, 5, 111, 4, 10};
/**

        int arrayLenght = scan.nextInt();
        int[] array = new int[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
            array[i] = scan.nextInt();
        }
        int array2Lenght = scan.nextInt();
        int[] array2 = new int[array2Lenght];

        for (int i = 0; i < array2Lenght; i++) {
            array2[i] = scan.nextInt();
        }

        for (int i : array2) {
        }
 **/
        int [] mergerdArray = sorter.merge(array, array2);
        for (int i = 0; i < mergerdArray.length-2; i++){
            System.out.print(mergerdArray[i]+" ");
        }
        System.out.print("" + mergerdArray[mergerdArray.length-1]);
    }


    public int[] merge(int[] array, int[] arrayTwo){

        int[] mergedArray = new int[array.length+arrayTwo.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= arrayTwo[i]){
                mergedArray[i] = array[i];
            } else mergedArray[i] = arrayTwo[i];
        }

        return mergedArray;
    }
}

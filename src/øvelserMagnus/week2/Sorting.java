package øvelserMagnus.week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Sorting sorter = new Sorting();
        Scanner scan = new Scanner(System.in);

         ArrayList<Integer> array1 = new ArrayList<Integer>();
         //array1.add(2); array1.add(4); array1.add(6);

         ArrayList<Integer> array2 = new ArrayList<>();
        //array2.add(1); array2.add(3); array2.add(5);


        int arrayLenght = scan.nextInt();

        for (int i = 0; i < arrayLenght; i++) {
            array1.add(scan.nextInt());
        }
        int array2Lenght = scan.nextInt();

        for (int i = 0; i < array2Lenght; i++) {
            array2.add(scan.nextInt());
        }

        ArrayList<Integer> mergerdArray = sorter.merge(array1, array2);

        for (int i = 0; i < mergerdArray.size(); i++) {
            System.out.print(mergerdArray.get(i) + " ");
        }
    }


    public ArrayList<Integer> merge(ArrayList<Integer> array1, ArrayList<Integer> array2){

        ArrayList<Integer> returnArray = new ArrayList<>();
        int posOne = 0;
        int posTwo = 0;


        while (returnArray.size() < array1.size() + array2.size()) {

            if (posOne >= array1.size()) {
                returnArray.add(array2.get(posTwo));
                posTwo++;
            }
            if (posTwo >= array2.size()) {
                returnArray.add(array1.get(posOne));
                posOne++;

            } else if (posOne < array1.size() && posTwo < array2.size()) {
                if (array1.get(posOne) >= array2.get(posTwo)) {
                    returnArray.add(array2.get(posTwo));
                    posTwo++;
                } else {
                    returnArray.add(array1.get(posOne));
                    posOne++;
                }
            }
        }
        return returnArray;
    }
}

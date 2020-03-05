package øvelserSiff.week4_IntroductionDataStructures;

import java.util.LinkedList;
import java.util.Scanner;

public class OPG51_StackUsingLinkedList {

    private static LinkedList<Integer> linkedList =  new LinkedList<>();

    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);

        int n = Integer.parseInt(inputScan.nextLine());

        for (int i = 0; i < n; i++){
            String str = inputScan.nextLine();
            Scanner strScan = new Scanner(str);

            if (strScan.next().contains("PU")){
                Integer integer = Integer.parseInt(strScan.next());
                push(integer);
            }
            else if (!linkedList.isEmpty()){
                System.out.println(pop());
            }
        }


    }

    public static void push(Integer element){
        linkedList.add(element);
    }

    public static Integer pop() {
        return linkedList.removeLast();
    }

}

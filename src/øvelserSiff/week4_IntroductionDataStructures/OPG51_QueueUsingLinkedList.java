package øvelserSiff.week4_IntroductionDataStructures;

import java.util.LinkedList;
import java.util.Scanner;

public class OPG51_QueueUsingLinkedList {

    private static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);

        int n = Integer.parseInt(inputScan.nextLine());

        for (int i = 0; i < n; i++){
            String str = inputScan.nextLine();
            Scanner strScan = new Scanner(str);

            if (strScan.next().contains("E")){
                Integer integer = Integer.parseInt(strScan.next());
                ENQueue(integer);
            }
            else if (!linkedList.isEmpty()){
                System.out.println(DEQueue());
            }
        }
    }

    public static void ENQueue(Integer element) {
        linkedList.add(element);
    }

    public static Integer DEQueue() {
        return linkedList.removeFirst();
    }
}

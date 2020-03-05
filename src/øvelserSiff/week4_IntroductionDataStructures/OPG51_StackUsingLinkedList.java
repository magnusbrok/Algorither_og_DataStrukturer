package øvelserSiff.week4_IntroductionDataStructures;

import java.util.LinkedList;

public class OPG51_StackUsingLinkedList {

    private static LinkedList<Integer> linkedList =  new LinkedList<>();

    public static void main(String[] args) {



    }

    public static void push(Integer element){
        linkedList.add(element);
    }

    public static Integer pop() {
        return linkedList.removeLast();
    }

}

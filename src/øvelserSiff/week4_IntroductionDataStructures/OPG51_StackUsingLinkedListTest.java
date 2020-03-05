package øvelserSiff.week4_IntroductionDataStructures;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class OPG51_StackUsingLinkedListTest {

    @Test
    void pushpop() {
        int i = 9;
        Integer input = i;

        OPG51_StackUsingLinkedList.push(input);

        Integer output = OPG51_StackUsingLinkedList.pop();

        assertEquals(input, output);
    }

    @Test
    void InputTest() {
        int n = 8;
        String input = "PU 3 \n PU 5 \n PU 1 \n PO \n PU 4 \n PU 2 \n PO \n PO";
        ArrayList<String> outputAct = new ArrayList<>();

        Scanner inputScan = new Scanner(input);
        for (int i = 0; i < n; i++){
            String str = inputScan.nextLine();
            Scanner strScan = new Scanner(str);

            if (strScan.next().contains("PU")){
                Integer integer = Integer.parseInt(strScan.next());
                OPG51_StackUsingLinkedList.push(integer);
            }
            else {
                outputAct.add("" + OPG51_StackUsingLinkedList.pop());
            }
        }

        ArrayList<String> outputExp = new ArrayList<>();
        outputExp.add("1");
        outputExp.add("2");
        outputExp.add("4");

        assertEquals(outputExp, outputAct);
    }
}
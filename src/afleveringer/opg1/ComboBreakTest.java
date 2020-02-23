package afleveringer.opg1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ComboBreakTest {

    @Test
    void breakCombo2TestRegularInput1() {

        // Arrange
        int n;
        String str;
        Scanner scan;

        // Arrange input
        n = 8;
        str = "C L R C S R C L";
        scan = new Scanner(str);
        ArrayList<String> input = new ArrayList<>();
        for(int i = 0; i < n; i++){
            input.add(scan.next());
        }

        // Arrange expected output
        n = 5;
        str = "M F C M E";
        scan = new Scanner(str);
        ArrayList<String> outputExp = new ArrayList<>();
        for(int i = 0; i < n; i++){
            outputExp.add(scan.next());
        }

        // Act
        ArrayList<String> outputAct = ComboBreak.breakCombo2(input, input.size());

        // Assert
        assertEquals(outputExp, outputAct);
    }

    @Test
    void breakCombo2TestRegularInput2() {

        // Arrange
        int n;
        String str;
        Scanner scan;

        // Arrange input
        n = 17;
        str = "C R L S R L C S L L C R S L R C S";
        scan = new Scanner(str);
        ArrayList<String> input = new ArrayList<>();
        for(int i = 0; i < n; i++){
            input.add(scan.next());
        }

        // Arrange expected output
        n = 5;
        str = "F F E F F";
        scan = new Scanner(str);
        ArrayList<String> outputExp = new ArrayList<>();
        for(int i = 0; i < n; i++){
            outputExp.add(scan.next());
        }

        // Act
        ArrayList<String> outputAct = ComboBreak.breakCombo2(input, input.size());

        // Assert
        assertEquals(outputExp, outputAct);
    }
}
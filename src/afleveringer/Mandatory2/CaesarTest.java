package afleveringer.Mandatory2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    /**
     * Letters and "Delete"
     */
    void CaesarTestInput1(){

        // Arrange input
        int n = 17;
        String str = "A ^ L G ^ O ^ R ^ I T H M S ^ ^ ^";
        Scanner scan = new Scanner(str);

        ArrayList<String> input = new ArrayList<>();
        for(int i = 0; i < n; i++){
            input.add(scan.next());
        }

        // Arrange expected output
        n = 3;
        str = "L I T";
        scan = new Scanner(str);

        Stack<String> outputExp = new Stack<>();
        for(int i = 0; i < n; i++)
            outputExp.push(scan.next());

        // Act
        Stack<String> outputAct = Caesar.ALG(input, input.size());

        // Assert
        assertEquals(outputExp, outputAct);

    }

    /**
     * Cipher-shift twice
     */
    @Test
    void CaesarTestInput2(){

        // Arrange input
        int n = 15;
        String str = "A B C 1 ^ A B C 2 A ^ ^ A B C";
        Scanner scan = new Scanner(str);

        ArrayList<String> input = new ArrayList<>();
        for(int i = 0; i < n; i++){
            input.add(scan.next());
        }

        // Arrange expected output
        n = 9;
        str = "A B C B C D D E F";
        scan = new Scanner(str);

        Stack<String> outputExp = new Stack<>();
        for(int i = 0; i < n; i++)
            outputExp.push(scan.next());

        // Act
        Stack<String> outputAct = Caesar.ALG(input, input.size());

        // Assert
        assertEquals(outputExp, outputAct);

    }

    /**
     * Cipher-shift
     */
    @Test
    void CaesarTestInput3(){

        // Arrange input
        int n = 12;
        String str = "H E L L O 3 ^ T L O I A";
        Scanner scan = new Scanner(str);

        ArrayList<String> input = new ArrayList<>();
        for(int i = 0; i < n; i++){
            input.add(scan.next());
        }

        // Arrange expected output
        n = 10;
        str = "H E L L O W O R L D";
        scan = new Scanner(str);

        Stack<String> outputExp = new Stack<>();
        for(int i = 0; i < n; i++)
            outputExp.push(scan.next());

        // Act
        Stack<String> outputAct = Caesar.ALG(input, input.size());

        // Assert
        assertEquals(outputExp, outputAct);

    }

    /**
     * Cipher-shift
     */
    @Test
    void CaesarTestInput4(){

        // Arrange input
        int n = 9;
        String str = "A B C 1 ^ ^ A B C";
        Scanner scan = new Scanner(str);

        ArrayList<String> input = new ArrayList<>();
        for(int i = 0; i < n; i++){
            input.add(scan.next());
        }

        // Arrange expected output
        n = 5;
        str = "A B B C D";
        scan = new Scanner(str);

        Stack<String> outputExp = new Stack<>();
        for(int i = 0; i < n; i++)
            outputExp.push(scan.next());

        // Act
        Stack<String> outputAct = Caesar.ALG(input, input.size());

        // Assert
        assertEquals(outputExp, outputAct);

    }

    /**
     * Cipher-shift overflow
     */
    @Test
    void CaesarTestInput5(){

        // Arrange input
        int n = 4;
        String str = "A 2 ^ Z";
        Scanner scan = new Scanner(str);

        ArrayList<String> input = new ArrayList<>();
        for(int i = 0; i < n; i++){
            input.add(scan.next());
        }

        // Arrange expected output
        n = 2;
        str = "A B";
        scan = new Scanner(str);

        Stack<String> outputExp = new Stack<>();
        for(int i = 0; i < n; i++) {
            outputExp.push(scan.next());
        }

        // Act
        Stack<String> outputAct = Caesar.ALG(input, input.size());

        // Assert
        assertEquals(outputExp, outputAct);

    }

    /**
     * Cipher-shift double overflow
     */
    @Test
    void CaesarTestInput6(){

        // Arrange input
        int n = 3;
        String str = "54 ^ A";
        Scanner scan = new Scanner(str);

        ArrayList<String> input = new ArrayList<>();
        for(int i = 0; i < n; i++){
            input.add(scan.next());
        }

        // Arrange expected output
        n = 1;
        str = "C";
        scan = new Scanner(str);

        Stack<String> outputExp = new Stack<>();
        for(int i = 0; i < n; i++) {
            outputExp.push(scan.next());
        }

        // Act
        Stack<String> outputAct = Caesar.ALG(input, input.size());

        // Assert
        assertEquals(outputExp, outputAct);

    }

    /**
     * Cipher-shift with multi-digit
     */
    @Test
    void CaesarTestInput7(){

        // Arrange input
        int n = 30;
        String str = "W E L L D O N E Y O U N G P A D C Z I X 12 ^ ^ ^ ^ ^ O K O B";
        Scanner scan = new Scanner(str);

        ArrayList<String> input = new ArrayList<>();
        for(int i = 0; i < n; i++){
            input.add(scan.next());
        }

        // Arrange expected output
        n = 20;
        str = "W E L L D O N E Y O U N G P A D A W A N";
        scan = new Scanner(str);

        Stack<String> outputExp = new Stack<>();
        for(int i = 0; i < n; i++) {
            outputExp.push(scan.next());
        }

        // Act
        Stack<String> outputAct = Caesar.ALG(input, input.size());

        // Assert
        assertEquals(outputExp, outputAct);

    }

}
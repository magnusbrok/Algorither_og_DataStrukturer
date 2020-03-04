package afleveringer.Mandatory2;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    /**
     * Letters and "Delete"
     */
    void CaesarTestInput1(){

        // Arrange
        int n;
        String str;
        Scanner scan;

        // Arrange input
        n = 17;
        str = "A ^ L G ^ O ^ R ^ I T H M S ^ ^ ^";
        scan = new Scanner(str);

        char[] input = new char[n];
        for(int i = 0; i < n; i++){
            input[i] = scan.next().charAt(0);
        }

        // Arrange expected output
        n = 3;
        str = "L I T";
        scan = new Scanner(str);

        Stack<String> outputExp = new Stack<>();
        for(int i = 0; i < n; i++)
            outputExp.push(scan.next());

        // Act
        Stack<String> outputAct = Caesar.ALG(input, input.length);

        // Assert
        assertEquals(outputExp, outputAct);

    }

    /**
     * Cipher-shift twice
     */
    @Test
    void CaesarTestInput2(){
        // Arrange input
        char[] input = {'A', 'B', 'C', '1', '^', 'A', 'B', 'C', '2', 'A', '^', '^', 'A', 'B', 'C'};

        // Arrange expected output
        int n = 9;
        String str = "A B C B C D D E F";
        Scanner scan = new Scanner(str);

        Stack<String> outputExp = new Stack<>();
        for(int i = 0; i < n; i++)
            outputExp.push(scan.next());

        // Act
        Stack<String> outputAct = Caesar.ALG(input, input.length);

        // Assert
        assertEquals(outputExp, outputAct);

    }

    /**
     * Cipher-shift
     */
    @Test
    void CaesarTestInput3(){

        // Arrange input
        char[] input = {'H', 'E', 'L', 'L', 'O', '3', '^', 'T', 'L', 'O', 'I', 'A'};

        // Arrange expected output
        int n = 10;
        String str = "H E L L O W O R L D";
        Scanner scan = new Scanner(str);

        Stack<String> outputExp = new Stack<>();
        for(int i = 0; i < n; i++)
            outputExp.push(scan.next());

        // Act
        Stack<String> outputAct = Caesar.ALG(input, input.length);

        // Assert
        assertEquals(outputExp, outputAct);

    }

    /**
     * Cipher-shift
     */
    @Test
    void CaesarTestInput4(){

        // Arrange input
        char[] input = {'A', 'B', 'C', '1', '^', '^', 'A', 'B', 'C'};

        // Arrange expected output
        int n = 5;
        String str = "A B B C D";
        Scanner scan = new Scanner(str);

        Stack<String> outputExp = new Stack<>();
        for(int i = 0; i < n; i++)
            outputExp.push(scan.next());

        // Act
        Stack<String> outputAct = Caesar.ALG(input, input.length);

        // Assert
        assertEquals(outputExp, outputAct);

    }

    /**
     * Cipher-shift overflow
     */
    @Test
    void CaesarTestInput5(){

        // Arrange input
        char[] input = {'A', '2', '^', 'Z'};

        // Arrange expected output
        int n = 2;
        String str = "A B";
        Scanner scan = new Scanner(str);

        Stack<String> outputExp = new Stack<>();
        for(int i = 0; i < n; i++) {
            outputExp.push(scan.next());
        }

        // Act
        Stack<String> outputAct = Caesar.ALG(input, input.length);

        // Assert
        assertEquals(outputExp, outputAct);

    }


}
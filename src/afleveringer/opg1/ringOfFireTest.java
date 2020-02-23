package afleveringer.opg1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ringOfFireTest {

    @Test
    void ALGRegularInput1(){

        // Arrange
        String str;
        Scanner scan;

        // Arrange input
        str = "11 2 3";
        scan = new Scanner(str);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();

        // Arrange expected output
        int l = 3;
        str = "3 7 11";
        scan = new Scanner(str);
        ArrayList<Integer> outputExp = new ArrayList<>();
        for(int i = 0; i < l; i++){
            outputExp.add(scan.nextInt());
        }

        // Act
        ArrayList<Integer> outputAct = ringOfFire.ALG(n, c, k);

        // Assert
        assertEquals(outputExp, outputAct);

    }

    @Test
    void ALGRegularInput2(){

        // Arrange
        String str;
        Scanner scan;

        // Arrange input
        str = "5 6 1";
        scan = new Scanner(str);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int k = scan.nextInt();

        // Arrange expected output
        int l = 1;
        str = "4";
        scan = new Scanner(str);
        ArrayList<Integer> outputExp = new ArrayList<>();
        for(int i = 0; i < l; i++){
            outputExp.add(scan.nextInt());
        }

        // Act
        ArrayList<Integer> outputAct = ringOfFire.ALG(n, c, k);

        // Assert
        assertEquals(outputExp, outputAct);

    }

}
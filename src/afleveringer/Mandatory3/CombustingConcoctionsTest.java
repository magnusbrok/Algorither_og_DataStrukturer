package afleveringer.Mandatory3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class CombustingConcoctionsTest {

    @Test
    void ALGTestInput1() {
        int N = 5;
        int M = 5;
        String input =
                "0 1\n" +
                "1 2\n" +
                "2 3\n" +
                "3 4\n" +
                "2 4";

        ArrayList<ArrayList<Integer>> adjList = CombustingConcoctions.generateAdjList(N, M, input);

        String output = CombustingConcoctions.ALG(adjList, N);

        assertEquals("BOOM!", output);
    }

    @Test
    void ALGTestInput2() {
        int N = 6;
        int M = 6;
        String input =
                "0 1\n" +
                "1 2\n" +
                "2 3\n" +
                "3 4\n" +
                "1 5\n" +
                "3 5";

        ArrayList<ArrayList<Integer>> adjList = CombustingConcoctions.generateAdjList(N, M, input);

        String output = CombustingConcoctions.ALG(adjList, N);

        assertEquals("0 2 4 5 \n" + "1 3 ", output);
    }

    @Test
    void ALGTestInput3() {
        int N = 20;
        int M = 20;
        String input =
                "5 6\n" +
                "13 19\n" +
                "3 19\n" +
                "5 12\n" +
                "4 12\n" +
                "6 8\n" +
                "2 5\n" +
                "0 6\n" +
                "0 1\n" +
                "0 7\n" +
                "4 11\n" +
                "0 18\n" +
                "11 19\n" +
                "7 9\n" +
                "10 17\n" +
                "7 19\n" +
                "17 19\n" +
                "5 14\n" +
                "16 19\n" +
                "9 15";

        ArrayList<ArrayList<Integer>> adjList = CombustingConcoctions.generateAdjList(N, M, input);

        String output = CombustingConcoctions.ALG(adjList, N);

        assertEquals("1 2 3 6 7 11 12 13 14 15 16 17 18  \n" + "0 4 5 8 9 10 19 ", output);
    }
}
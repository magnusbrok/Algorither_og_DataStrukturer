package afleveringer;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

    // magnus test til Combobreaker

    public static void main(String[] args) {

        int attacksCountered = 0;
        Scanner scanner = new Scanner(System.in);


        int N = scanner.nextInt();

        ArrayList<String> enemyMoves = new ArrayList<>();
        ArrayList<String> counterMoves = new ArrayList<>();

/**
        enemyMoves.add("C");
        enemyMoves.add("L");
        enemyMoves.add("R");
        enemyMoves.add("C");
        enemyMoves.add("S");
        enemyMoves.add("R");
        enemyMoves.add("C");
        enemyMoves.add("L");
**/
        int currPos = 0;
        String currCombo = "";


        for(int i = 0; i < N; i++){
            enemyMoves.add(scanner.next());
        }

        while (currPos < N) {


            if (currPos + 3 < N) {

                currCombo = enemyMoves.get(currPos)+ enemyMoves.get(currPos+1)
                        + enemyMoves.get(currPos+2) + enemyMoves.get(currPos+3);
            } else currCombo = "";

            //System.out.println("CurrentCombo:" +currCombo);


            if (currCombo.contains("C") && currCombo.contains("L") && currCombo.contains("R") && currCombo.contains("S")) {
                counterMoves.add("F");
                currPos += 4;

            }
            else {
                //System.out.println("CurrentPos: " + enemyMoves.get(currPos));
                switch (enemyMoves.get(currPos)) {
                    case "C":
                        counterMoves.add("M");
                        break;
                    case "L":
                        counterMoves.add("E");
                        break;
                    case "R":
                        counterMoves.add("C");
                        break;
                    case "S":
                        counterMoves.add("S");
                        break;
                }
                currPos++;

                }

            //System.out.println("countermoves: " + counterMoves);
        }

        //System.out.println("FINAL COUNTERMOVES: " + counterMoves);

        for (int i = 0; i < counterMoves.size(); i++) {
            System.out.print(counterMoves.get(i)+" ");
        }
    }
}

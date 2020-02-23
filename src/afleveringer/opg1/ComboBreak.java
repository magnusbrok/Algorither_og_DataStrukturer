package afleveringer.opg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComboBreak {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<String> input = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            input.add(scan.next());
        }

        ArrayList<String> output = breakCombo2(input, input.size());

        for (int i = 0; i < output.size(); i++){
            System.out.print(output.get(i) + " ");
        }

    }

    private static ArrayList<String> breakCombo1(ArrayList<String> A, int i, int n, ArrayList<String> combo, ArrayList<String> result){

        if(i < n){
            if (i < n-3){
                ArrayList<String> subList = new ArrayList(A.subList(i, i+4));
                Collections.sort(subList);

                if(subList.equals(combo)){

                    result.add("F");
                    return breakCombo1(A, i+4, n, combo, result);
                }
            }
            if(A.get(i).equalsIgnoreCase("C")){

                result.add("M");
                return breakCombo1(A, i+1, n, combo, result);
            }
            else if(A.get(i).equalsIgnoreCase("L")){

                result.add("E");
                return breakCombo1(A, i+1, n, combo, result);

            }
            else if(A.get(i).equalsIgnoreCase("R")){

                result.add("C");
                return breakCombo1(A, i+1, n, combo, result);
            }
            else if(A.get(i).equalsIgnoreCase("S")){

                result.add("S");
                return breakCombo1(A, i+1, n, combo, result);
            }

        }

        return result;
    }

    public static ArrayList<String> breakCombo2(ArrayList<String> A, int n){

        ArrayList<String> counterMoves = new ArrayList<>();
        int i = 0;
        String currCombo;

        while (i < n) {

            if (i + 3 < n) {
                currCombo = A.get(i)+ A.get(i+1) + A.get(i+2) + A.get(i+3);

            } else {
                currCombo = "";

            }

            if (currCombo.contains("C") && currCombo.contains("L") && currCombo.contains("R") && currCombo.contains("S")){
                counterMoves.add("F");
                i += 4;

            } else {
                switch (A.get(i)) {
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
                    default:
                        break;
                }
                i++;
            }
        }
        return counterMoves;
    }
}

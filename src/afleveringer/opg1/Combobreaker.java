package afleveringer.opg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Combobreaker {

    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<String> input = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            input.add(scan.next());
        }

//        String string = "C R L S R L C S L L C R S L R C S";
//        ArrayList<String> input = new ArrayList<String>();
//        Scanner stringScanner = new Scanner(string);
//        int n = 17;
//        for(int i = 0; i < n; i++){
//            input.add(stringScanner.next());
//        }

        ArrayList<String> output = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> combo = new ArrayList<>(Arrays.asList("C","L","R","S"));

        output = algo(input, 0, n, combo, result);

        for (int i = 0; i < output.size(); i++){
            System.out.print(output.get(i) + " ");
        }

    }

    private static ArrayList<String> algo(ArrayList<String> A, int i, int n, ArrayList<String> combo, ArrayList<String> result){

        if(i < n){
            if (i < n-3){
                ArrayList<String> subList = new ArrayList(A.subList(i, i+4));
                Collections.sort(subList);

                if(subList.equals(combo)){

                    result.add("F");
                    return algo(A, i+4, n, combo, result);
                }
            }
            if(A.get(i).equalsIgnoreCase("C")){

                result.add("M");
                return algo(A, i+1, n, combo, result);
            }
            else if(A.get(i).equalsIgnoreCase("L")){

                result.add("E");
                return algo(A, i+1, n, combo, result);

            }
            else if(A.get(i).equalsIgnoreCase("R")){

                result.add("C");
                return algo(A, i+1, n, combo, result);
            }
            else if(A.get(i).equalsIgnoreCase("S")){

                result.add("S");
                return algo(A, i+1, n, combo, result);
            }

        }

        return result;
    }
}

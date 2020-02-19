package afleveringer.opg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Combobreaker {

    public static void main(String[] args) {
//        Scanner scan  = new Scanner(System.in);
//        int n = scan.nextInt();
//        ArrayList<String> input = new ArrayList<String>();
//        for(int i = 0; i < n; i++){
//            input.add(scan.next());
//        }

        String string = "C R L S R L C S L L C R S L R C S";
        ArrayList<String> input = new ArrayList<String>();
        Scanner stringScanner = new Scanner(string);
        int n = 17;
        for(int i = 0; i < n; i++){
            input.add(stringScanner.next());
        }

        ArrayList<String> output = algo(input, 0, n);

        System.out.println(output.toString());

    }

    private static ArrayList<String> algo(ArrayList<String> A, int i, int n){

        if(i < n){
            ArrayList<String> result = new ArrayList<>();

            if (i < n-3){
                ArrayList<String> subList = new ArrayList(A.subList(i, i+4));
                Collections.sort(subList);

                if(subList.equals(new ArrayList<>(Arrays.asList("C","L","R","S")))){

                    result.add(0, "F");
                    result.addAll(algo(A, i+4, n));
                    return result;
                }
            }
            if(A.get(i).equalsIgnoreCase("C")){

                result.add(0, "M");
                result.addAll(algo(A, i+1, n));
                return result;
            }
            else if(A.get(i).equalsIgnoreCase("L")){

                result.add(0, "E");
                result.addAll(algo(A, i+1, n));
                return result;

            }
            else if(A.get(i).equalsIgnoreCase("R")){

                result.add(0, "C");
                result.addAll(algo(A, i+1, n));
                return result;
            }
            else if(A.get(i).equalsIgnoreCase("S")){

                result.add(0, "S");
                result.addAll(algo(A, i+1, n));
                return result;
            }

        }

        return new ArrayList<String>();
    }
}

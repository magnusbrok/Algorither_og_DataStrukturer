package afleveringer.Mandatory2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Caesar {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<String> input = new ArrayList<>();
        for(int i = 0; i < n; i++){
            input.add(scan.next());
        }

        Stack<String> output = ALG(input, n);

        for (String str : output){
            System.out.print(str + " ");
        }

    }

    public static Stack<String> ALG(ArrayList<String> input, int n){

        int i = 0;
        int shift = 0;
        Stack<String> outputStack = new Stack<>();

        while (i < n){
            char curr = input.get(i).charAt(0);

            if (Character.isLetter(curr)){

                char shifted = (char) (curr + shift);

                if (shifted > 'Z') {

                    int diff = shifted % 'Z';

                    shifted = (char)  ('A' + diff -1);
                }

                outputStack.push(Character.toString(shifted));

            }
            else if (Character.isDigit(curr)){
                outputStack.push(input.get(i));

            }
            else if (curr == '^' && !outputStack.empty()){

                String pop = outputStack.pop();

                if (Character.isDigit(pop.toCharArray()[0])){
                    shift += Integer.parseInt(pop);

                    if (shift > 26){
                        shift = shift % 26;
                    }

                }
            }
            i++;

        }
        return outputStack;
    }
}

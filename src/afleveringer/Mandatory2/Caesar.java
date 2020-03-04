package afleveringer.Mandatory2;

import java.util.Stack;

public class Caesar {

    public static void main(String[] args) {

    }

    public static Stack<String> ALG(char[] input, int n){

        int i = 0;
        int shift = 0;
        Stack<String> outputStack = new Stack<>();

        while (i < n){
            char curr = input[i];

            if (Character.isLetter(curr)){

                char shifted = (char) (curr + shift);

                if (shifted > 'Z') {

                    int diff = curr + shift - 'Z';

                    shifted = (char)  ('A' + diff -1);
                }

                outputStack.push(Character.toString(shifted));

            }
            else if (Character.isDigit(curr)){
                outputStack.push(Character.toString(curr));

            }
            else if (curr == '^' && !outputStack.empty()){

                String pop = outputStack.pop();

                if (Character.isDigit(pop.toCharArray()[0])){
                    shift += Integer.parseInt(pop);

                }
            }
            i++;

        }
        return outputStack;
    }
}

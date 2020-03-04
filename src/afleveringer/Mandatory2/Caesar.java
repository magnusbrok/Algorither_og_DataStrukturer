package afleveringer.Mandatory2;

import java.util.Stack;

public class Caesar {

    public static void main(String[] args) {

    }

    public static Stack<String> ALG(char[] input, int n){

        int i = 0;
        Stack<String> outputStack = new Stack<>();

        while (i < n){
            char curr = input[i];

            if (Character.isLetter(curr)){

                outputStack.push(Character.toString(curr));

            }

            else if (curr == '^' && !outputStack.empty()){

                outputStack.pop();

            }
            i++;

        }
        return outputStack;
    }
}

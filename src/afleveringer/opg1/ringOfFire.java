package afleveringer.opg1;

import java.util.ArrayList;
import java.util.Scanner;

public class ringOfFire {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int C = scan.nextInt();
        int K = scan.nextInt();
        int currentPos = 0;


        // initialization:
        ArrayList<Integer> students = new ArrayList<>();

        for(int i = 0; i < N ; i++){
            students.add(i+1);
        }

        while (students.size() > K) {
            currentPos+=(C-1);

            if (currentPos >= students.size()) {
                currentPos = currentPos % students.size();
            }
            //System.out.println("Removed: " + students.get(currentPos));
            students.remove(currentPos);

            //System.out.println(students);
            //System.out.println("CurrentPos: "+ currentPos);
        }

        for (int i = 0; i < students.size() ;i++) {
            System.out.print(students.get(i)+" ");
        }
    }
}

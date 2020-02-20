package afleveringer.opg1;

import java.util.ArrayList;
import java.util.Scanner;

public class ringOfFire {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // initialization:
        int N = scan.nextInt();
        int C = scan.nextInt();
        int K = scan.nextInt();
        int currentPos = 0;
        ArrayList<Integer> students = new ArrayList<>();

        for(int i = 0; i < N ; i++){
            students.add(i+1);
        }

        while (students.size() > K) {
            currentPos+=(C-1);

            if (currentPos >= students.size()) {
                currentPos = currentPos % students.size();
            }
            students.remove(currentPos);
        }

        for (int i = 0; i < students.size() ;i++) {
            System.out.print(students.get(i)+" ");
        }
    }
}

package afleveringer.Mandatory1;

import java.util.ArrayList;
import java.util.Scanner;

public class ringOfFire {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // initialization:
        int N = scan.nextInt();
        int C = scan.nextInt();
        int K = scan.nextInt();

        ArrayList<Integer> students = ALG(N, C, K);

        for (int i = 0; i < students.size() ;i++) {
            System.out.print(students.get(i)+" ");
        }
    }

    public static ArrayList<Integer> ALG(int n, int c, int k) {

        ArrayList<Integer> students = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            students.add(i+1);
        }

        int i = 0;
        while (students.size() > k) {
            i+=(c-1);

            if (i >= students.size()) {
                i = i % students.size();
            }
            students.remove(i);
        }

        return students;
    }
}

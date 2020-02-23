package afleveringer.opg1;

public class testAfPseudo {

    public static void main(String[] args) {
        testAfPseudo test = new testAfPseudo();
        //int[] A = new int[]{3, 2, 2, 2, 4, 5, 5, 3};
        int[] A = new int[]{2, 2, 2, 2, 2, 2, 2 ,2 };

        System.out.println(test.ALG1(A, A.length));



    }

    public int ALG1(int[] A, int n){
        int l = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (ALG2(A, i, j) && (j - i + 1) > l) {
                    l = j-i+1;
                }
            }
        }
        return l;
    }

    public boolean ALG2(int[] A, int i, int j){
        if (i == j) return true;
        int k = i;
        for (k = i; k < j; k++) {
            if (A[k] != A[k+1]) return false;
        }
        return true;
    }


    public int efficientALG1(int[] A, int m){
        int l = 0;



        return l;
    }
}

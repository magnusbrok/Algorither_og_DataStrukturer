package afleveringer.Mandatory1;

public class FunWithArrays {

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

    private boolean ALG2(int[] A, int i, int j){
        if (i == j) return true;
        int k = i;
        for (k = i; k < j; k++) {
            if (A[k] != A[k+1]) return false;
        }
        return true;
    }


    public int ALG3(int[] A, int n){

        int l = 1;
        int x = 1; // for runtime

        if (1 < n){
            int i = 0;
            int j = i+1;

            while (i < n-1 && j < n){

                if (A[i] == A[j]){

                    if (j-i+1 > l){
                        l = j-i+1;
                    }

                    j++;

                }else{
                    i=j;
                    j = i+1;
                }

                x++; // for runtime
            }
        }
        System.out.println(x); // for runtime
        return l;
    }
}

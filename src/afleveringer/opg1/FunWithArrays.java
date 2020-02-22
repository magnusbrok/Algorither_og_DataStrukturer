package afleveringer.opg1;

public class FunWithArrays {

    public int ALG1(int[] A, int n){

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

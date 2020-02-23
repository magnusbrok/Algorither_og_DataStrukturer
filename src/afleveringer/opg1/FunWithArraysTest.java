package afleveringer.opg1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FunWithArraysTest {

    @Test
    void ALG1TestRegular1() {
        int[] A = {3, 2, 2, 2, 4, 5, 5, 3};
        int n = A.length;

        FunWithArrays obj = new FunWithArrays();

        int l = obj.ALG1(A,n);

        assertEquals(3,l);
    }

    @Test
    void ALG1TestRegular2() {
        int[] A = {3, 2, 2, 4, 5, 5, 5, 3};
        int n = A.length;

        FunWithArrays obj = new FunWithArrays();

        int l = obj.ALG1(A,n);

        assertEquals(3,l);
    }

    @Test
    void ALG1TestArrayLengthOne() {
        int[] A = {3};
        int n = A.length;

        FunWithArrays obj = new FunWithArrays();

        int l = obj.ALG1(A,n);

        assertEquals(1,l);
    }

    @Test
    void ALG1TestEmptyArray() {
        int[] A = new int[4];
        int n = A.length;

        FunWithArrays obj = new FunWithArrays();

        int l = obj.ALG1(A,n);

        assertEquals(4,l);
    }
}
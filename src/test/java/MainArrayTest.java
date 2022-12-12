import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainArrayTest {
    int[][] arrayOne1 = new int[][]{
            {11, 2, 4},
            {6, 3, 2},
            {2, 1, 5}
    };

    @Test
    public void test1() {
        Assertions.assertEquals(4, MainArray.countArray(arrayOne1));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(1, MainArray.arraySquare(arrayOne1));
    }
}


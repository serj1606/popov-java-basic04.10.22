import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainArrayTest {
    int[][] array = new int[][]{
            {5, 2},
            {6, 3}
    };

    @Test
    public void test1() {
        Assertions.assertEquals(4, MainArray.averageArray(array));
    }

    @Test
    public void test2() {
        Assertions.assertEquals(1, MainArray.arraySquare(array));
    }
}









 /*{11, 2, 4},
         {6, 3, 2},
         {2, 1, 5}*/
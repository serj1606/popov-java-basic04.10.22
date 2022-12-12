import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainArrayTest {
    int[][] array = new int[][] {
            {2, 3, 2},
            {6, 3, 2},
            {2, 3, 4}
    };

    @Test
    public void test1() {
        Assertions.assertEquals(3, MainArray.countArray(array));
    }


    @Test
    public void test2() {
        Assertions.assertEquals(1, MainArray.arraySquare(array));
    }

}


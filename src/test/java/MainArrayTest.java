import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainArrayTest {


    @Test
    public void shouldTestArrayAverage() {
        double[] arrayAverage = {6,2,4,4};

        Assertions.assertEquals(4, MainArray.averageArray(arrayAverage));
    }

    @Test
    public void shouldTestArraySquare() {
        int[][] array = new int[3][3];
        Assertions.assertEquals(1, MainArray.arraySquare(array));

    }
}










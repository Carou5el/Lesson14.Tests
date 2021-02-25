package kulkov.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static kulkov.example.Main.checkArray;

public class TestSplitArray {

    // Тестовый массив.
    static int[] testArray = { 23,234, 234,123, 4, 32, 23 };
    static int[] testArray1 = { 134,14,3,423,423,42,34,235,74,7,5,3,4,324,2342,34,234,234,34, 4 };
    static int[] testArray2 = { 1,2,6,4,7,6,7,5,6,5,6 };
    static int[] testArray3 = { 23, 4, 234,123, 32, 23 };

    @Test
    public void testCheckArray()    {
        Assertions.assertEquals(4, checkArray(testArray));
    }
    @Test(expected = RuntimeException.class)
    public void testCheckArray1()    {
        Assertions.assertEquals(1, checkArray(testArray1));
    }

    @Test
    public void testCheckArray2()    {
        Assertions.assertEquals(3, checkArray(testArray2));
    }

    @Test
    public void testCheckArray3()    {
        Assertions.assertEquals(1, checkArray(testArray3));
    }
}

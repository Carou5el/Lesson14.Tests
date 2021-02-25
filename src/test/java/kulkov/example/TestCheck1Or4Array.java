package kulkov.example;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestCheck1Or4Array {

    private Assertions Assertion;

    @Test
    public void testCheck1Or4Array()    {
        Assertion.assertEquals(true, Main.check1Or4Array(new int[]{ 1,1,1,1,1,1,1,4,4,4,4,4,4 }));
    }
    @Test
    public void testCheck1Or4Array1()    {
        Assertion.assertEquals(false, Main.check1Or4Array(new int[]{ 1,1,3,4,4,4,4,4,4,4,1 }));
    }
    @Test
    public void testCheck1Or4Array2()    {
        Assertion.assertEquals(false, Main.check1Or4Array(new int[]{ 111,1,1,1,1,1,4,4,4,4,4,4 }));
    }
    @Test
    public void testCheck1Or4Array3()    {
        Assertion.assertEquals(false, Main.check1Or4Array(new int[]{ 1,2,4,7,8 }));
    }
}

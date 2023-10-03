import org.testng.Assert;

public class AssertTest {

    @Test(priority=1)
    public void testMultiplication(){
        Assert.assertTrue(5==5);
    }
    @Test(priority=2)
    public void testDivision(){
        Assert.assertTrue(5==5);
    }
}

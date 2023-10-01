
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LengthStringTest {

    @DataProvider(name = "stringTestData")
    public Object[][] gradeTestData() {
        return new Object[][] {
                {"AMJAD", 5},
                {"amjad", 5},
                {"aMjad", 5},
                {"", 0},
                {" Amjad ", 5}
        };
    }


    @Test(dataProvider = "stringTestData")
    public void testStringCount(String str, int expectedLength){
        lengthString sp = new lengthString();
        Assert.assertEquals(sp.strlen(str), expectedLength);

}}

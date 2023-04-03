package practices;

import com.digital.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class CalculatorTest {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void addTwoNumbersTest(){
        Assert.assertEquals(Calculator.add(2,2),4);
        //Assert.assertEquals(Calculator.add(2,2),9);
    }

    @Test
    public  void testSoftAssert(){
        softAssert.assertEquals(Calculator.add(2,2),4);

        softAssert.assertEquals(Calculator.add(2,2),5);

        softAssert.assertEquals(Calculator.add(2,2),6);

        softAssert.assertEquals(Calculator.add(2,2),7);

        softAssert.assertEquals(Calculator.add(2,2),8);

        softAssert.assertAll();
    }




}

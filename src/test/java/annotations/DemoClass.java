package annotations;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoClass {

    public int sum(int a, int b) {
        return a + b;
    }

    @Test(dataProvider = "numbers")
    public void testSum(int a, int b, int result) {
        Assert.assertEquals(sum(a, b), result);


    }

    @DataProvider
    public static Object[][] numbers() {
        return new Object[][]{
                {10, 20, 30},
                {0, 20, 20},
                {10, 40, 50},
                {10, 20, 30}
        };
    }

    @Test(enabled = false)
    public void test2() {
        System.out.println("Пропуск теста");
    }

    @Test(dependsOnMethods = "testSum")
    public void test3(){
        System.out.println("Зависимость теста");
    }


    @Test(timeOut = 1000)
    public void test4(){
        System.out.println("Зависимость теста");
    }
}

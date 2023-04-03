package practice03;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {
    @Test
    public void createNewUserTest() {
        User firstUser = new User("John", 30);
        Assert.assertNotNull(firstUser);
    }

    @Test(dependsOnMethods = "createNewUserTest")
    public void loginTest() {
        Assert.assertTrue(true);
    }

    @DataProvider
    public static Object[][] getUserNames() {
        return new Object[][]{
                {"john@gmail.com", "ValidPass"},
                {"johngmail.com", "ValidPass"},
                {"john@gmail.com", "InvalidPas"},
        };
    }

    @Test(dataProvider = "getUserNames")
    public void testLoginFun(String username, String password){
        System.out.println(username + " " + password);
    }
}

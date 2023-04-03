package practices;

import com.digital.Practice1;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Practice1Test {

    SoftAssert sft = new SoftAssert();

    @Test
    public void addDoubleChar(){
        Assert.assertEquals(Practice1.doubleChar("Apple"),"AAppppllee");
        Assert.assertEquals(Practice1.doubleChar("Dog"),"Doogg");
    }

    @Test
    public void addDoibleChar2(){
        sft.assertEquals(Practice1.doubleChar("Cat"), "Ccat");
        sft.assertEquals(Practice1.doubleChar("Dog"), "DDoogg");
        sft.assertEquals(Practice1.doubleChar("Home"), "Hhoomee");
        sft.assertAll();
    }
}

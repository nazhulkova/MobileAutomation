import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("method getLocalNumer does not return 15", this.getLocalNumber(number) == 15);
    }

}
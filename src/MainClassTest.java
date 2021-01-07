import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber(){
        Assert.assertTrue("method getLocalNumer does not return 15", this.getLocalNumber() == 15);
    }

    @Test
    public void testGetClassNumber(){
        Assert.assertTrue("getClassNumber value < 45", this.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString(){
       Assert.assertTrue("getClassStreeng is not conteined Hello or hello world",
               this.getClassString().contains("Hello") ||
                       this.getClassString().contains("hello"));

    }

}
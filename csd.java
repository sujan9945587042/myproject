package sjc123;

import org.testng.Assert;
import mainsjc.App; // <-- Import App from its correct package

public class csd {

    public void test1() {
        App myapp = new App();
        Assert.assertEquals(0, myapp.userLogin("Zoro", "1piece"));
    }

    public void test2() {
        App myapp2 = new App();
        Assert.assertEquals(0, myapp2.userLogin("Zoro", "1piece"));
    }
}

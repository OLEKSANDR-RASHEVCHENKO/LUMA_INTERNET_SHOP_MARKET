package E2E;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test_Base {
    protected static Application_Manager app = new Application_Manager();

    @BeforeMethod
    public void setAppTest(){
        app.init();
    }

    @AfterMethod
    public void tearDown(){
        app.stop();
    }
}

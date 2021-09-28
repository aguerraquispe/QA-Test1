import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MathTest1 extends Base {
    @BeforeTest
    public void initialize(){
        driver = initializeDriver();
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.google.com");
        Thread.sleep(5000);
    }

    @AfterTest
    public void closeDriver(){
        driver.close();
    }
}

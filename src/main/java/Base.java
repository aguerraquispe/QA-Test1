import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    public WebDriver driver;

    public WebDriver initializeDriver(){
        String webDriverPath = System.getProperty("user.dir") + "//Tools//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();//para que se abra navegador maximizado
        driver.manage().deleteAllCookies();//borramos cookies que no usamos
        return driver;
    }
}

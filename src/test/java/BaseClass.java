import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BaseClass {

    public static WebDriver driver;

    public static void driverInit(){

//        WebDriverManager.edgedriver().setup();
//        driver = new EdgeDriver();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }


    public static void appTearDown(){

        driver.close();

    }
}

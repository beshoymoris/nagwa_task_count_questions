package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.OpeningPage;

public class BaseTest {

    private static WebDriver driver ;
    protected static OpeningPage openingPage ;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","resource\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.nagwa.com/");

        openingPage = new OpeningPage(driver);
    }


    @AfterClass
    public static void tearDown (){

        driver.quit();

    }


}

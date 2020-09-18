package tests;

import dataProvider.ConfigFileReader;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.OpeningPage;

import java.io.IOException;

public class BaseTest {

    protected static WebDriver driver ;
    protected static OpeningPage openingPage2;

    @BeforeClass
    public static void setUp() throws IOException {
        String URl = ConfigFileReader.getProperty("url");
        String Chromedriver = ConfigFileReader.getProperty("chromedriver");

        System.setProperty(Chromedriver,"resource\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(URl);
        openingPage2 = new OpeningPage(driver);
    }


    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}

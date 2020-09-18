package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpeningPage {

    private WebDriver driver ;

    public OpeningPage(WebDriver driver) {

        this.driver = driver ;
    }

    public LanguagePage clickonselectlanguage () throws InterruptedException {
       WebElement languagebutton = driver.findElement(By.xpath("//a[contains(text(),'English')]"));
       languagebutton.isEnabled();
       languagebutton.click();

        return new LanguagePage (driver);

    }







}

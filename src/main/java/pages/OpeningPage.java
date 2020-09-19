package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpeningPage extends BasePage{

    private By languageBtn = By.xpath("//a[contains(text(),'English')]");

    public OpeningPage(WebDriver driver) {
        super(driver);
    }


    public String getCurrentUrl ()  {
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }

    public HomePage clickOnSelectLanguage ()  {
        findElement(languageBtn).click();
        return new HomePage(driver);
    }

}

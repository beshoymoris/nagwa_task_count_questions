package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchResultPage extends BasePage {

    private By searchLink = By.xpath("//li[2]//div[1]//a[1]");

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public String getLinkData(){
        return findElement(searchLink).getText();
    }

    public void clickSearchedLinks () {

        findElement(searchLink).click();

    }


}

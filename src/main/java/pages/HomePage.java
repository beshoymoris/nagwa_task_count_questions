package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BasePage{

    private By indicatorLabel = By.xpath("//div[@class='user-actions']//span[contains(text(),'English')]");
    private By searchBtn = By.className("search");
    private By searchTxtField = By.id("txt_search_query");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public String getLanguage(){
        return findElement(indicatorLabel).getText();
    }

    public void clickOnSearch (){
        findElement(searchBtn).click();
    }

    public void enterSearchDataAndProceed (String keyword) {
        WebElement searchField = findElement(searchTxtField);
        searchField.sendKeys(keyword);
        searchField.sendKeys(Keys.ENTER);
    }


}

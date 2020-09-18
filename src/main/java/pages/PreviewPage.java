package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PreviewPage extends BasePage {

    private By previewQuestionBtn = By.xpath("//a[@id='preview']");

    public PreviewPage(WebDriver driver) {
        super(driver);
    }
    public void clickPreviewQuesWorksheet () {
        findElement(previewQuestionBtn).click();
    }
}

package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CountingQuestionsPage extends BasePage {


    private By listOfQuestionsLabels = By.className("one-part-question");

    public CountingQuestionsPage(WebDriver driver) {
        super(driver);
    }
    public int getQuestionsCount(){
        return findElements(listOfQuestionsLabels).size();
    }
}

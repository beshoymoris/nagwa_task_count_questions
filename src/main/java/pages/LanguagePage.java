package pages;

import com.sun.source.tree.AssertTree;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LanguagePage {

    private WebDriver driver;


    public  LanguagePage (WebDriver driver){

        this.driver = driver;
    }

    public void clickonlang (){

        WebElement  indicator=driver.findElement(By.tagName("span"));
        String name = indicator.getText();
    }

    public void clickonsearch () {

        WebElement  searchbutton =driver.findElement(By.className("search"));
        searchbutton.isEnabled();
        searchbutton.click();
    }

    public void addserachdata () {
        WebElement  searchfield =driver.findElement(By.id("txt_search_query"));
        searchfield.isEnabled();
        searchfield.clear();
        searchfield.sendKeys("addition");
        searchfield.sendKeys(Keys.ENTER);
    }

    public void opensearchedlinks () {
        WebElement  searchlink =driver.findElement(By.xpath("//li[2]//div[1]//a[1]"));
        searchlink.isEnabled();
        searchlink.click();
    }

    public void previewQuesWorksheet () {
        WebElement  searchlink =driver.findElement(By.xpath("//a[@id='preview']"));
        searchlink.isEnabled();
        searchlink.click();
    }

    public void countingquestions (){


        List<WebElement> listofques = driver.findElements(By.className("one-part-question"));
//        for( WebElement question : listofques) {
//
//            System.out.println(question.getText());
//
//        }
        int x = listofques.size();
        System.out.println("Count number of questions displayed are " + x );

    }



}

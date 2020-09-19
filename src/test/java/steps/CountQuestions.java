package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import dataProvider.ConfigFileReader;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.* ;




@RunWith(Cucumber.class)


public class CountQuestions {

    private OpeningPage openingPage;
    private HomePage homePage;
    private SearchResultPage searchResultPage ;;
    private PreviewPage previewPage;
    private CountingQuestionsPage countingQuestionsPage ;

    String homePageLanguage = ConfigFileReader.getProperty("language");
    String searchData = ConfigFileReader.getProperty("searchData");

    protected static WebDriver driver ;

    @Before
    public static void setUp() {
        String URl = ConfigFileReader.getProperty("url");
        String Chromedriver = ConfigFileReader.getProperty("chromedriver");

        System.setProperty(Chromedriver,"resource\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(URl);
    }

    @Given("^Nagwa website Opened$")
    public void the_user_in_opening_page(){
        openingPage = new OpeningPage(driver);
        openingPage.getCurrentUrl();
    }

    @When("^user select language$")
    public void he_click_on_english_button(){
        openingPage = new OpeningPage(driver);
        openingPage.clickOnSelectLanguage();
        homePage = new HomePage(driver);
        String reflectedLanguage = homePage.getLanguage();
        Assert.assertEquals(homePageLanguage,reflectedLanguage);
    }

    @And("^search for lessons with “addition” keyword$")
    public void he_search_for_addition_lessons(){
        homePage = new HomePage(driver);
        homePage.clickOnSearch();
        homePage.enterSearchDataAndProceed(searchData);
        searchResultPage = new SearchResultPage(driver);
        String resultData =searchResultPage.getLinkData();
        Assert.assertTrue(resultData.contains(searchData));
    }

    @And("^click on 2nd link from list with all lessons which match this name$")
    public void he_select_2nd_link_from_list()  {

        searchResultPage = new SearchResultPage(driver);
        searchResultPage.clickSearchedLinks();

    }

    @And("^click on preview button to display worksheet page$")
    public void he_click_on_preview() {

        previewPage = new PreviewPage(driver);
        previewPage.clickPreviewQuesWorksheet();

    }
    @Then("^getting count of questions$")
    public void he_get_counts_of_questions() {

        countingQuestionsPage = new CountingQuestionsPage(driver);
        int numberOfQuestions = countingQuestionsPage.getQuestionsCount();
        System.out.println("Number of questions is : " + numberOfQuestions);

    }

    @After
    public static void tearDown(){
        driver.quit();
    }

}

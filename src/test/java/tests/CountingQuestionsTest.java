package tests;

import dataProvider.ConfigFileReader;
import org.junit.Assert;
import org.junit.Test;
import pages.*;


public class CountingQuestionsTest extends BaseTest{

    private HomePage homePage;
    private OpeningPage openingPage;
    private SearchResultPage searchResultPage;
    private PreviewPage previewPage;
    private CountingQuestionsPage countingQuestionsPage;
    String searchData = ConfigFileReader.getProperty("searchData");
    String homePageLanguage =ConfigFileReader.getProperty("language");

    @Test
    public void  testCountingQuestionsinWorksheet()  {


        openingPage = new OpeningPage(driver);
        openingPage.getCurrentUrl();
        openingPage.clickOnSelectLanguage();
        homePage = new HomePage(driver);
        String reflectedLanguage = homePage.getLanguage();
        Assert.assertEquals(homePageLanguage,reflectedLanguage);
        homePage.clickOnSearch();
        homePage.enterSearchDataAndProceed(searchData);
        searchResultPage = new SearchResultPage(driver);
        String resultData =searchResultPage.getLinkData();
        Assert.assertTrue(resultData.contains(searchData));
        searchResultPage.clickSearchedLinks();
        previewPage = new PreviewPage(driver);
        previewPage.clickPreviewQuesWorksheet();
        countingQuestionsPage = new CountingQuestionsPage(driver);
        int numberOfQuestions = countingQuestionsPage.getQuestionsCount();
        System.out.println("Number of questions is : " + numberOfQuestions);

    }

}

package tests;

import org.junit.Test;
import pages.LanguagePage;


public class LanguageTest extends BaseTest{

    @Test
    public void  testopeninglanguagepage() throws InterruptedException {

        LanguagePage languagePage= openingPage.clickonselectlanguage();
        languagePage.clickonlang();
        languagePage.clickonsearch();
        languagePage.addserachdata();
        languagePage.opensearchedlinks();
        languagePage.previewQuesWorksheet();
        languagePage.countingquestions();

    }



}

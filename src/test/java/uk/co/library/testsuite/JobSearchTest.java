package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {
   HomePage homePage;
   ResultPage resultPage;
   @BeforeMethod(alwaysRun = true)
    public void inIt(){
       homePage = new HomePage();
       resultPage = new ResultPage();
   }
    /**
     *    1.verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location,
     * String distance, String salaryMin, String salaryMax, String salaryType, String jobType,
     *   String result).
     */
    @Test(groups = {"Regression"})
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance,String salaryMin, String salaryMax,String salaryTpe, String jobType, String result) throws InterruptedException{
homePage.enterJobTitle(jobTitle);
//accept cookies
        driver.switchTo().frame("gdpr-consent-notice");
        Thread.sleep(2000);
        homePage.clickOnAcceptAllCookies();
        driver.switchTo().defaultContent();
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryTpe);
        homePage.setJobTitle(jobType);
        homePage.clickOnFindJobsButton();
        resultPage.verifyTheResult(result);
    }
}


package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(id="keywords")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(id="location")
    WebElement location;
    @CacheLookup
    @FindBy(id="distance")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id="toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(id="salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id="salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id="salarytype")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//body[1]/main[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/select[1]")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(id="hp-search-btn")
    WebElement findJobsBtn;
    @CacheLookup
    @FindBy(id= "save")
    WebElement acceptAllCookies;

    public void enterJobTitle(String jobtitle) {
        Reporter.log("Enter Job Title : " + jobTitle);
        CustomListeners.test.log(Status.PASS, "Enter Job Title : " + jobTitle);
        sendTextToElement(jobTitle, jobtitle);

    }
    public void enterLocation(String location1) {
        Reporter.log("Enter Location : " + location);
        CustomListeners.test.log(Status.PASS, "Enter Location : " + location1);
        sendTextToElement(location, location1);
    }
    public void selectDistance(String distance) {
        Reporter.log("Select Distance : " + distance);
        CustomListeners.test.log(Status.PASS, "Select Distance : " + distance);
        selectByVisibleTextFromDropDown(distanceDropDown, distance);
    }
    public void clickOnMoreSearchOptionLink() {
        Reporter.log("Click on More search options");
        CustomListeners.test.log(Status.PASS, "Click on More search options");
    }
    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter minimum salary in Salary Min Field : " + minSalary);
        CustomListeners.test.log(Status.PASS, "Enter minimum salary in Salary Min Field : " + minSalary);
        sendTextToElement(salaryMin, minSalary);
    }
    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter maximum salary in Salary Max Field : " + maxSalary);
        CustomListeners.test.log(Status.PASS, "Enter maximum in Salary Max Field : " + maxSalary);
        sendTextToElement(salaryMax, maxSalary);
    }
    public void selectSalaryType(String sType) {
        Reporter.log("Select Salary Type : " + sType);
        CustomListeners.test.log(Status.PASS, "Select Salary Type : " + sType);
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
    }
    public void setJobTitle(String jobType) {
        Reporter.log("Select Job Type : " + jobType);
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }
    public void clickOnFindJobsButton() {
        Reporter.log("Click on Find Jobs");
        CustomListeners.test.log(Status.PASS, "Click on Find Jobs");
        clickOnElement(findJobsBtn);
    }
    public void clickOnAcceptAllCookies(){
        Reporter.log("Click on AcceptAll");
        CustomListeners.test.log(Status.PASS, "Click on Accept All");
        clickOnElement(acceptAllCookies);

    }

}

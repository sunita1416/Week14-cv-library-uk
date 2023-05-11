package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
   @CacheLookup
    @FindBy(xpath ="//body[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/h1[1]")
    WebElement resultText;
   public void verifyTheResult(String expected){
       Reporter.log("Verify Result Text :  "+ expected);
       CustomListeners.test.log(Status.PASS, "Verify Result Text : "+ expected);
       Assert.assertEquals(resultText.getText(),expected,"Result is not matching");
   }
}

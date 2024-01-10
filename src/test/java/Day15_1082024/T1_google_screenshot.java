package Day15_1082024;

import Day13_12192023.TestParent;
import Day14_01022024.Reusable_Methods_Loggers;
import org.testng.annotations.Test;

public class T1_google_screenshot extends TestParent {

    @Test
    public void tc003_searchForACar() throws InterruptedException {
        //navigate to google web page
        driver.navigate().to("https://www.google.com");
        //search for BMW
        Reusable_Methods_Loggers.sendKeys(driver, "//*[@name= 'q']", "BMW", logger,"SearchField");
        //hit submit on the google search button
        Reusable_Methods_Loggers.submitMethod(driver, "//*[@name= 'btnKlp']", logger,"Submit");
        Thread.sleep(1000);
    }//end of test case 1


    @Test
    public void tc_004gitcommit () {

//commiting a new test case
    }//end of tc 04



}//end of class

package ActionItems;

import Day10_121120223.T1_Mouse.Reusable_Methods;
import Day13_12192023.TestParent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class In_Class_AI extends TestParent {

@Test
    public void Tc001_lifetime () throws InterruptedException {
    driver.navigate().to("https://www.lifetime.life/");
    String actualTitle = driver.getTitle();
    String expectedTitle = "Life Time Healthy Way of Life | Join Life Time";
    Assert.assertEquals(actualTitle,expectedTitle);
    Reusable_Methods.clickMethod(driver,"//*[@class='navbar-toggler ms-n1']","Click Find a Location");
    Thread.sleep(3000);
    ArrayList<WebElement> sizeAthletic = new ArrayList<>(driver.findElements(By.xpath("//*[@class='nav-item']")));
    System.out.println(sizeAthletic.size());
    if (sizeAthletic.size()>1) {
    sizeAthletic.get(0).click();
    Thread.sleep(4000);
    Reusable_Methods.sendKeys(driver,"//*[@id='floatingInput']","Jamaica","Enter location Search bar");
    Reusable_Methods.clickMethod(driver,"//*[@aria-label='Filter']","Click Filter");
    Reusable_Methods.clickMethod(driver,"//*[@aria-controls='program-filter']","Click Programs");
    Reusable_Methods.clickMethod(driver,"//*[@id='program-bball']","Click Basketball");
    Reusable_Methods.clickMethod(driver,"//*[@class='btn btn-dark btn-sm px-2 px-sm-3 px-lg-2 px-xl-3']","Click Details");
    Reusable_Methods.scroll(driver,"//*[@class='opacity-75']","Scroll to Hours");
    Thread.sleep(3000);
    String addressDeatils= new String(Reusable_Methods.captureText(driver,"//*[@class='row']","Capture Address Details"));
        System.out.println(addressDeatils);
        Reusable_Methods.clickMethod(driver,"//*[@class='btn btn-simple btn-sm']","Click Membership");
        Reusable_Methods.clickByIndexMethod(driver,"//*[@class='btn btn-dark']",1,"Click Join Today");
        Thread.sleep(3000);
        Reusable_Methods.clickMethod(driver,"//*[@id='move-forward-btn']","Move Foward");
        Reusable_Methods.clickMethod(driver,"//*[@id='card-select-membership-0']","Click Which Membership");
        Reusable_Methods.clickMethod(driver,"//*[@id='omsc-summary-continue-btn']","Click Checkout");
        String pricingSummary= new String(Reusable_Methods.captureText(driver,"//*[@class='col-xs-12 col-md-6 col-lg-5 col-xl-4']","Pricing Summary capture"));
        System.out.println(pricingSummary);
        Thread.sleep(2000);

    }//end of else if statement

}//end of test case 1

}//end of class

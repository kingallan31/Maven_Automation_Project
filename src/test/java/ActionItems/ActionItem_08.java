package ActionItems;

import Day13_12192023.TestParent;
import Day14_01022024.Reusable_Methods_Loggers;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionItem_08 extends TestParent {

    @Test
    public void Tc_001BethpageNavigating() throws InterruptedException {

        driver.navigate().to("https://www.bethpagefcu.com/home-business/");
        Reusable_Methods_Loggers.scrollByPixel(driver, "0", "1500", logger, "Scroll Down");
        Thread.sleep(2000);
        Reusable_Methods_Loggers.clickByIndexMethod(driver, "//*[@class='c-btn -primary  ']", 1, logger, "Click on Discover");
        Reusable_Methods_Loggers.scrollByPixel(driver, "0", "1500", logger, "Scroll");
        Thread.sleep(3000);
        Reusable_Methods_Loggers.captureHrefAndClick(driver, "//*[contains(text(),'Mastercard Smart Shopper Benefits')]", 0, "Open n Switch tab", logger);
        Reusable_Methods_Loggers.clickMethod(driver, "//*[@id='onetrust-accept-btn-handler']", logger, "Click accept cookies");
        String expectedTitle = driver.getTitle();
        String actualTitle = new String("Mastercard - A Global Technology Company in The Payments Industry");
        Assert.assertEquals(expectedTitle, actualTitle);
    }//end of tc 001


    // SWITCHED WEBSITES THATS WHY ITS A NEW ONE PLEASSSEEE NOTEEEE
    @Test
    public void Tc_002newWebsiteMunicipal02() throws InterruptedException {
        driver.navigate().to("https://www.nymcu.org/");
        Reusable_Methods_Loggers.hoverActionsMethod(driver, "//*[text()='Lending']", logger, "Hover over lending");
        Thread.sleep(3000);
        Reusable_Methods_Loggers.clickMethod(driver, "//*[text()='Mortgages']", logger, "Click Mortageges");
        Reusable_Methods_Loggers.clickMethod(driver, "//*[text()='Apply Today']", logger, "Click Apply Today");
        Thread.sleep(3000);
        Reusable_Methods_Loggers.scrollByPixel(driver,"0","250",logger,"Scroll down");
        String expectedTitle = driver.getTitle();
        String actualTitle = new String("Mortgage Center");
        Assert.assertEquals(expectedTitle, actualTitle);
    }//end of TC 002

    @Test
    public void Tc_003OldWebsite() {
        driver.navigate().to("https://www.nymcu.org/");
        Reusable_Methods_Loggers.hoverActionsMethod(driver, "//*[text()='Lending']", logger, "Hover over lending");
        Reusable_Methods_Loggers.clickMethod(driver,"//*[text()='Credit Cards Overview']",logger,"Click Cards overview");
        Reusable_Methods_Loggers.scrollByPixel(driver,"0","3500",logger,"Scroll down");
        Reusable_Methods_Loggers.clickMethod(driver,"//*[@class='font-500 mb-0 pr-30 sm:pr-55']",logger,"Click the thing");
        String details = new String(Reusable_Methods_Loggers.captureText(driver,"//*[contains(text(),'Accidents happen!')]",logger,"Print details"));
        System.out.println(details);
    }//end of tc 02


    @Test
    public void Tc_004MunicipalFun () throws InterruptedException {
        driver.navigate().to("https://www.nymcu.org/");
        Reusable_Methods_Loggers.hoverActionsMethod(driver, "//*[text()='Lending']", logger, "Hover over lending");
        Reusable_Methods_Loggers.clickMethod(driver,"//*[@style='height: auto; max-width: 100%; width: 301px;']",logger,"Click the picture");
        Thread.sleep(3000);
        Reusable_Methods_Loggers.clickByIndexMethod(driver,"//*[@class='btns']",2,logger,"Click apply Today");
        Thread.sleep(3000);
        Reusable_Methods_Loggers.clickMethod(driver,"//*[contains(text(),'Apply Today')]",logger,"Click Apply");
        Reusable_Methods_Loggers.clickMethod(driver,"//*[@class='btn3']",logger,"Click Register");
        Thread.sleep(3000);
        boolean teddy = driver.findElement(By.xpath("//*[@class='irisv-checkbox__check']")).isSelected();
        System.out.println("The checkbox is not selected" + teddy);
        Assert.assertTrue(teddy);
    }//end of test 004

    @Test
    public void Tc_005MunicipalFunski () throws InterruptedException {
        driver.navigate().to("https://www.nymcu.org/");
        Reusable_Methods_Loggers.hoverActionsMethod(driver, "//*[text()='Lending']", logger, "Hover over lending");
        Reusable_Methods_Loggers.clickMethod(driver,"//*[text()='Loans Overview']",logger,"Click Overview");
        Reusable_Methods_Loggers.clickMethod(driver,"//*[text()='See Auto Loans & Services']",logger,"Click Auto Loans");
        Reusable_Methods_Loggers.clickByIndexMethod(driver,"//*[@class=' btn1 ']",2,logger,"Click Learn More Auto");
        Reusable_Methods_Loggers.clickMethod(driver,"//*[text()='Find Your Auto Protection Plan']",logger,"Click Protection plan");
        Reusable_Methods_Loggers.clickMethod(driver,"//*[text()='Get Started']",logger,"Click get started");
    }//end of test case 005

}//end of AI
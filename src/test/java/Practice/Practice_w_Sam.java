package Practice;

import Day10_121120223.T1_Mouse.Reusable_Methods;
import Day13_12192023.TestParent;
import org.testng.annotations.Test;

public class Practice_w_Sam extends TestParent {

    @Test
    public void Tc_001RunningAroundBethPage () throws InterruptedException {
        driver.navigate().to("https://www.bethpagefcu.com/");
        Reusable_Methods.clickMethod(driver,"//*[@class='list-inline-item ']","Clickiong Buisness Module");
        Reusable_Methods.clickMethod(driver,"//*[@id='search-btn-toggle']","Click on Search Bar");
        Reusable_Methods.sendKeys(driver,"//*[@id='search_input']","FAQs","Sending keys to search bar");
        Reusable_Methods.clickMethod(driver,"//*[@class='c-btn -primary search-btn']","Hit search");
        Reusable_Methods.clickByIndexMethod(driver,"//*[@class='c-block__title']",2,"Click Mortgage FAQ's");
        Reusable_Methods.clickMethod(driver,"//*[@class='c-btn -primary ']","Click apply Today");
     Reusable_Methods.clickElementWithJs(driver,"//*[@id='field96514108_2']","Click Middle one");
    // Reusable_Methods.clickElementWithJse(driver,"//*[@class='fsSubmitButton']","CLick Next");
//        Reusable_Methods.clickMethodVisibility(driver,"//*[@id='field93244788_2']","Click no");
//        Reusable_Methods.clickMethodVisibility(driver,"//*[@id='fsSubmitButton3900176']","Click Next");
//        Reusable_Methods.clickMethodVisibility(driver,"//*[@id='field93244862_1']","Click Yes");
//        Reusable_Methods.clickMethod(driver,"//*[@class='fsSubmitButton']","CLick Next");
//        Reusable_Methods.sendKeys(driver,"//*[@id='field94527585-first']","Allan","Enter FIrst name");
//        Reusable_Methods.sendKeys(driver,"//*[@id='field94527585-last']","Aronov","Enter LAst name");
//        Reusable_Methods.sendKeys(driver,"//*[@id='field94527586']","3476812362","Enter Phone Number");
//        Reusable_Methods.sendKeys(driver,"//*[@id='field94527587']","allanaronov31@gmail.com","Send Email");
//        Reusable_Methods.sendKeys(driver,"//*[@id='field131232196']","11432","Enter zip code");
//        Thread.sleep(2000);
    }//end of test case 1












}//end of practice

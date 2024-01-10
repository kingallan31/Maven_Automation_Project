package Practice;

import Day10_121120223.T1_Mouse.Reusable_Methods;
import Day13_12192023.TestParent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.ResourceBundle;

public class Practice_Project extends TestParent {

    @Test
    public void Tc001_buisnessModule () {
        driver.navigate().to("https://www.bethpagefcu.com/");
        Reusable_Methods.clickMethod(driver, "//*[text()='Business']", "Buisness Module");
        Reusable_Methods.clickByIndexMethod(driver, "//*[text()='Business Lending']", 1, "Buisness Lending Hover");
        Reusable_Methods.clickByIndexMethod(driver, "//*[text()='Term Loans']", 1, "Term Loans Dropdown");
        //Reusable_Methods.scroll(driver, "//*[contains(text(),'Buy or refinance')]","Scroll to refinance ");
        String print = new String(Reusable_Methods.captureText(driver, "//*[@class='cpt-inner grey-bg-inner']", "Print Term Loan "));
        System.out.println(print);
    }//end of test case 1

     @Test
             public void Tc002_creLending () throws InterruptedException {

         Reusable_Methods.clickByIndexMethod(driver, "//*[text()='CRE Lending']", 1, "CRE Lending Module");
         Thread.sleep(2000);
        // Reusable_Methods.scroll(driver, "//*[@id='field53255196']", "Scroll Down CRE Lending");
         Reusable_Methods.scrollByIndex(driver,"//*[contains(text(),'Contact us')]",2,"Contact us");
         Thread.sleep(2000);
         Reusable_Methods.sendKeys(driver,"//*[@id='field53255196']","Allan","Filling out First name");
         Thread.sleep(2000);
     }//end of test case 2










}//end of class

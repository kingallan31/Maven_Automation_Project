package Day14_01022024;

import Day10_121120223.T1_Mouse.Reusable_Methods;
import Day13_12192023.TestParent;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_YahooBoolean extends TestParent {

    @Test
    public void tc001_verifyStaySignedInIsChecked() {
       //naviagte to yahoo
       driver.navigate().to("https://www.yahoo.com/");
       //click on sign in button
        Reusable_Methods.clickMethod(driver,"//*[text()= 'Sign in']","Click on Sign in");
        Reusable_Methods.clickMethod(driver,"//*[@id='persistent']","Click Stay Signed in");
        //store checked option into a boolean variable
        boolean isStaySignedInChecked = driver.findElement(By.xpath("//*[@id='persistent']")).isSelected();
        //print out if checkbox is selected
        System.out.println("The checkbox is checked" + isStaySignedInChecked);
        //assert if its true
        Assert.assertTrue(isStaySignedInChecked);
    }//end of ts 01

    @Test
    public void tc_002verifySignInoptionIsUnchecked(){
        //click on the checkbox to uncheck it
        Reusable_Methods.clickMethod(driver,"//*[@class= 'stay-signed-in checkbox-container']","Unlick sign in");
        //should store false value since checkbox is now unchecked
        boolean isStaySignedInChecked = driver.findElement(By.xpath("//*[@id='persistent']")).isSelected();
        //print out if checkbox is selected
        System.out.println("The checkbox is checked" + isStaySignedInChecked);
        //assert if its true
        Assert.assertFalse(isStaySignedInChecked);
    }//enf of tc 02


}//end of class

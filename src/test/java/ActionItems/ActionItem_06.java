package ActionItems;

import Day10_121120223.T1_Mouse.Reusable_Methods;
import Day13_12192023.TestParent;
import org.testng.annotations.Test;

public class ActionItem_06 extends TestParent {

@Test
    public void tc_001fidellis() throws InterruptedException {
    driver.navigate().to("https://www.fideliscare.org/");
    Reusable_Methods.clickByIndexMethod(driver,"//*[@class='dropdown-toggle']",1,"Clicking on search bar");
    Reusable_Methods.sendKeys(driver,"//*[@class='form-control search-input']","get dental coverage","Typing keys in search bar");
    Reusable_Methods.clickMethod(driver,"//*[@aria-label='Execute Search']","Click Search");
    Thread.sleep(2000);
    String search = new String(Reusable_Methods.captureText(driver,"//*[@class='gsc-resultsRoot gsc-tabData gsc-tabdActive']","Capturing search Result"));
    System.out.println(search);
    String results = new String(Reusable_Methods.captureText(driver,"//*[@class='gsc-result-info']","Search Results #"));
    System.out.println(results);
    String[] resultsSplit= results.split(" ");
    System.out.println(resultsSplit[1]);
    Reusable_Methods.clickMethod(driver,"//*[text()='Get Dental Coverage']","Click Dental Coverage");
    Thread.sleep(2000);
}//end of test case 1

@Test
    public void tc_002continuedFidellis() throws InterruptedException {
Reusable_Methods.switchToTabByIndex(driver,1,"switch to new tab");
Reusable_Methods.sendKeys(driver,"//*[@id='firstName']","Allan","Entering First name");
Reusable_Methods.sendKeys(driver,"//*[@id='lastName']","Aronov","Entering Last name");
Reusable_Methods.sendKeys(driver,"//*[@id='zipCode']","11432","Entering zipcode");
Reusable_Methods.sendKeys(driver,"//*[@id='phoneNumber']","3476329781","Entering phone number");
Reusable_Methods.sendKeys(driver,"//*[@id='email']","allanb@gmail.com","Entering email");
Reusable_Methods.clickByIndexMethod(driver,"//*[@for='contactMe']",1,"Click on checkbox");
Reusable_Methods.clickByIndexMethod(driver,"//*[@class='btn btn-primary']",4,"Click on contact me button");
Thread.sleep(2000);
String submit = new String(Reusable_Methods.captureText(driver,"//*[@class='alert alert-success']","Print out statment for submission"));
System.out.println(submit);
driver.close();
}//end of test case 2

    @Test
    public void tc_003endOfFidellis () throws InterruptedException {
    Reusable_Methods.switchToTabByIndex(driver,0,"Switch back to orginal tab");
    Reusable_Methods.clickMethod(driver,"//*[@class='dropdown-toggle']","Click on Login");
    Thread.sleep(2000);
    Reusable_Methods.clickMethod(driver,"//*[@class='link-external']","Click members only Portal");
    Thread.sleep(2000);
    Reusable_Methods.switchToTabByIndex(driver,1,"Switch to member portal tab");
    String helpfulHints = new String(Reusable_Methods.captureText(driver,"//*[@class='flex flex-column p-8']","Capture Helpful Hints"));
    System.out.println(helpfulHints);
    driver.close();

}//end of test case 3


}//end of class

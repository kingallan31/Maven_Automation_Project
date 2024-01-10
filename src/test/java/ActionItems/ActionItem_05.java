package ActionItems;

import Day10_121120223.T1_Mouse.Reusable_Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class ActionItem_05 {

    public static void main(String[] args) {

        //create array list
        ArrayList<String> zipCode = new ArrayList<>();
        //add the zipcode data
        zipCode.add("11432");
        zipCode.add("10001");
        zipCode.add("11417");
        //for loop
        WebDriver driver = Reusable_Methods.setUpDriver();
        //set up for loop
        for (int i = 0; i < zipCode.size(); i++) {
            //navigate to website
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop");
            //click on find a workshop button
            Reusable_Methods.clickMethod(driver, "//*[text() = 'Find a Workshop']","Find a workshop button");
            //click on in person link
            Reusable_Methods.clickMethod(driver,"//*[@class = 'buttonText-3DCCO']","Find in person link");
            //clear
            Reusable_Methods.clearMethod(driver,"//*[@id = 'location-search']",0,"search bar clear");
            //Send it keys
            Reusable_Methods.sendKeys(driver,"//*[@id = 'location-search']",zipCode.get(i),"entering zipcodes into search bar");
            //click on search arrow
            Reusable_Methods.clickMethod(driver,"//*[@class = 'rightArrow-daPRP']","Search arrow click no work");
            //start if condition to clicking various links
            //start else if statement
            if (i == 0){
                Reusable_Methods.clickByIndexMethod(driver, "//*[@class = 'linkUnderline-1_h4g']",1,"clicking on 2nd studio link");
            }else if (i==1){
                Reusable_Methods.clickByIndexMethod(driver, "//*[@class = 'linkUnderline-1_h4g']",2,"clicking on 3rd studio link");
            }else if (i ==2){
                Reusable_Methods.clickByIndexMethod(driver, "//*[@class = 'linkUnderline-1_h4g']",0,"clicking on 1st studio link");
            }//end of conditional statement
            String address = new String(Reusable_Methods.captureText(driver ,"//*[@class = 'address-2PZwW']","studio address"));
            //print addresses
            System.out.println(address);
            //scroll down
            Reusable_Methods.scroll(driver, "//*[contains(@id, 'studioW')]","scroll down to studio sched");
            //make variable for print statement
            String schedule = new String(Reusable_Methods.captureText(driver,"//*[contains(@id, 'studioW')]","print studio sched"));
            //print sched
            System.out.println(schedule);
        }//end of for loop
        driver.quit();
    }//end of main
}// end of class

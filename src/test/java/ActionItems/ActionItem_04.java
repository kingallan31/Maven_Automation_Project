package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class ActionItem_04 {
    public static void main(String[] args) throws InterruptedException {

        //create array list
        ArrayList<String> zipCode = new ArrayList<>();
        //add the zipcode data
        zipCode.add("11432");
        zipCode.add("10001");
        zipCode.add("11417");
        //for loop
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chromeoptions
        options.addArguments("start-maximized");
        //open incognito mode
        options.addArguments("incognito");
        //define the web driver
        WebDriver driver = new ChromeDriver(options);
        //naviagte to website
        for (int i = 0; i < zipCode.size(); i++) {
        //settup the web driver
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop");
            //
            driver.findElement(By.xpath("//*[text() = 'Find a Workshop']")).click();
        //click on in person link
        driver.findElement(By.xpath("//*[@class = 'buttonText-3DCCO']")).click();
        //2-3 sec
        Thread.sleep(3000);
        //clear field
        WebElement searchBar = driver.findElement(By.xpath("//*[@id = 'location-search']"));
        //clear search bar
        searchBar.clear();
        //send keys
        searchBar.sendKeys(zipCode.get(i));
        //click on search arrow
            driver.findElement(By.xpath("//*[@class = 'rightArrow-daPRP']")).click();
            //2-3 sec
            Thread.sleep(3000);
            //find website
            ArrayList<WebElement> studioLink = new ArrayList<>(driver.findElements(By.xpath("//*[@class = 'linkUnderline-1_h4g']")));
            //start else if statement
            if (i == 0){
                studioLink.get(1).click();
            }else if (i==1){
                studioLink.get(2).click();
            }else if (i ==2){
                studioLink.get(0).click();
            }//end of conditional statement
            Thread.sleep(3000);
            //create variable
            WebElement address = driver.findElement(By.xpath("//*[@class = 'address-2PZwW']"));
            //print address statement
            System.out.println(address.getText());
            //declare javascript executor
                  JavascriptExecutor jse = (JavascriptExecutor) driver;
                  //create variable
            WebElement table = driver.findElement(By.xpath("//*[contains(@id, 'studioW')]"));
            //scroll to table
            jse.executeScript("arguments[0].scrollIntoView(true);",table);
            //wait 3 sec
            Thread.sleep(3000);
            //print out
            System.out.println(table.getText());
            //quit

        }//end of loop
driver.quit();
    }//end of main

    public static class Assignment_DIY {

        public static void main(String[] args) throws InterruptedException {

            ArrayList<String> firstName = new ArrayList<>();
            firstName.add("Allan");
            firstName.add("Luis");

            ArrayList<String> lastName = new ArrayList<>();
            lastName.add("Aronov");
            lastName.add("Rivera");

            ArrayList<String> zipCode = new ArrayList<>();
            zipCode.add("11432");
            zipCode.add("11325");

            ArrayList<String> dob = new ArrayList<>();
            dob.add("12312001");
            dob.add("571997");

            ArrayList<String> vehicleYear = new ArrayList<>();
            vehicleYear.add("2021");
            vehicleYear.add("2017");

            ArrayList<String> vehicleMake = new ArrayList<>();
            vehicleMake.add("Mercdes");
            vehicleMake.add("Toyota");

            ArrayList<String> vehicleModel = new ArrayList<>();
            vehicleModel.add("CLA 250");
            vehicleModel.add("Rav 4");

            ArrayList<String> daysPerWeek = new ArrayList<>();
            daysPerWeek.add("6");
            daysPerWeek.add("1");

            ArrayList<String> mileage = new ArrayList<>();
            mileage.add("28560");
            mileage.add("42500");

            //declare webdrivermanager to setup the chromedriver
            WebDriverManager.chromedriver().setup();
            //set chromeoptions for preset of arguments for the driver
            ChromeOptions options = new ChromeOptions();
            options.addArguments("incognito");
            options.addArguments("start-maximized");
            //declare your web driver and pass the options variable inside the chromedriver
            WebDriver driver = new ChromeDriver(options);
            //navigate to geico
            driver.navigate().to("https://www.geico.com");

            //begin for loop
            for (int i = 0; i < 2; i++) {
                //start try and catch
                try {
                 //click on auto checkbox
                    driver.findElement(By.xpath("//*[@class='product-checkbox']")).click();
                }catch (Exception e){
                    //between the new set of curly braces write your print statement of what it would say if it was to fail
                    System.out.println("Not working " + e);
                }//end of try catch
                Thread.sleep(2000);
                //click on start my qoute
                try {
                    //click on start my quote
                   driver.findElement(By.xpath("//*[@class='modal-trigger btn btn--primary btn--full-mobile']")).click();
                }catch (Exception e){
                    //print statment
                    System.out.println("Not working " + e);
                }//end of try catch
                Thread.sleep(2000);
                //start try and catch
                try {
                    //enter real zip code
                    driver.findElement(By.xpath("//*[@id='bundle-modal-zip']")).clear();
                    driver.findElement(By.xpath("//*[@id='bundle-modal-zip']")).sendKeys(zipCode.get(i));
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working " + e);
                }//end of try catch
                    Thread.sleep(2000);
                //start try and catch
                try {
                    //click on homeowners checkbox
                    //create Array List because it is 7/8 index
                    ArrayList <WebElement> homeOwner = new ArrayList<>(driver.findElements(By.xpath("//*[@class='product-checkbox']")));
                    homeOwner.get(6).click();
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working " + e);
                }//end of try and catch
                Thread.sleep(2000);
                //start try and catch
                try {
                    //click on continue
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile']")).click();
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working" + e);
                }//end of try and catch
                Thread.sleep(2000);
                //start try and catch
                try {
                    //Enter dob
                    WebElement dateBox = driver.findElement(By.xpath("//*[@aria-label='Date of Birth']"));
                    dateBox.sendKeys(dob.get(i));
                }catch (Exception e) {
                  //print statement
                    System.out.println("Not working " + e);
                }//end of try and catch
                //start try and catch
                try {
                    //press next
                    ArrayList<WebElement> dobNext = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@id,'Id_GiveDateOfBirth')]")));
                    dobNext.get(3).click();
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working " + e);
                }//end of try and catch
                Thread.sleep(4000);
                //dont need sleep
                //start try and catch
                try {
                    //enter first name
                    WebElement name = driver.findElement(By.xpath("//*[@aria-label='First Name']"));
                    name.click();
                    name.clear();
                    name.sendKeys(firstName.get(i));
                }catch (Exception e) {
                    //print statement
                    System.out.println("Not working " + e);
                }//end of try and catch
                //dont need sleep
                //start try and catch
                try {
                    //enter last name
                    WebElement name2 = driver.findElement(By.xpath("//*[@aria-label='Last Name']"));
                    name2.click();
                    name2.clear();
                    name2.sendKeys(lastName.get(i));
                }catch (Exception e){
                    //print statment
                    System.out.println("Not working " + e);
                }//end of try and catch
                Thread.sleep(2000);
                //start try and catch
                try {
                   //press next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working" + e);
                }//end of try and catch
                Thread.sleep(4000);
                //start try and catch
                try {
                    //enter a valid address
                    WebElement address = driver.findElement(By.xpath("//*[@class='address-search-field include-clear-action']"));
                    address.click();
                    address.clear();
                    address.sendKeys("180-15 Aberdeen rd");
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working " + e);
                }//end of try and catch
                Thread.sleep(4000);
                //start try n catch
                try {
                    //press next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working " + e);
                }//end of try and catch
                Thread.sleep(4000);
                //start try n catch
                try {
                    //press yes
                   ArrayList<WebElement> radioButton = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@id,'labelFor')]")));
                   radioButton.get(0).click();
                }catch (Exception e) {
                    //print statement
                    System.out.println("Not working " + e);
                }//end try and catch
                Thread.sleep(4000);
                //start try n catch
                try {
                    //click next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e) {
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                Thread.sleep(4000);
                //catch n try
                try {
                    //press no
                    ArrayList<WebElement> radioButton = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@id,'labelFor')]")));
                    radioButton.get(1).click();
                }catch (Exception e) {
                    //print statement
                    System.out.println("Not working " + e);
                }//end try and catch
                Thread.sleep(4000);
                //start try n catch
                try {
                    //click next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e) {
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                Thread.sleep(4000);
                //try n catch
                //press yes
                try {
                    //press yes
                    ArrayList<WebElement> radioButton = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@id,'labelFor')]")));
                    radioButton.get(0).click();
                }catch (Exception e) {
                    //print statement
                    System.out.println("Not working " + e);
                }//end try and catch
                Thread.sleep(4000);
                //start try n catch
                try {
                    //click next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e) {
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try catch
                Thread.sleep(4000);
                //try n catch
               try {
                   //enter prior adress
                   driver.findElement(By.xpath("//*[@type='search']")).sendKeys("180-15 Aberdeen rd");
               }catch (Exception e){
                   //print statement
                   System.out.println("Not working " + e);
               }//end of try n catch
                Thread.sleep(4000);
                try {
                    //click next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e) {
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                Thread.sleep(4000);
                //try n catch
                try {
                    //press no
                    ArrayList<WebElement> radioButton = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@id,'labelFor')]")));
                    radioButton.get(1).click();
                }catch (Exception e) {
                    //print statement
                    System.out.println("Not working " + e);
                }//end try and catch
                Thread.sleep(4000);
                //start try n catch
                try {
                    //click next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e) {
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                Thread.sleep(4000);
                //try n catch
                try {
                    // press on dropdown
                    driver.findElement(By.xpath("//*[@aria-label='Year']")).click();
                }catch (Exception e){
                    //print out statment
                    System.out.println("Not working " + e);
                }//end of try n catch
                try {
                    //press the year on dropdown
                    driver.findElement(By.xpath("//*[@value='2023']")).click();
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                //try n catch
                try {
                    //press second drop down
                 driver.findElement(By.xpath("//*[@aria-label='Make']")).click();
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working " + e);
                }//end of catch n try
                //start catch n try
                try {
                    //press make year
                    driver.findElement(By.xpath("//*[@value='Mercedes Benz']")).click();
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                try {
                //press model
                    driver.findElement(By.xpath("//*[@aria-label='Model']")).click();
                }catch (Exception e){
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                try {
                    //press CLA class
                    driver.findElement(By.xpath("//*[@value='CLA Class']")).click();
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                try {
                    //click next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e) {
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                Thread.sleep(4000);
                //start try n catch
                try {
                    //click next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e) {
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try n catch
               try {
                  //press lease
                   driver.findElement(By.xpath("//*[@id='labelForL'")).click();
               }catch (Exception e){
                   //print statement
                   System.out.println("Not working " + e);
               }//end of try n hard
                Thread.sleep(4000);
                try {
                    //click next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e) {
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                Thread.sleep(4000);
                //start try n catch
                try {
                    //press commute
                    driver.findElement(By.xpath("//*[@id='labelForC']")).click();
                }catch (Exception e){
                   //print statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                Thread.sleep(4000);
                try {
                    //click next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e) {
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                Thread.sleep(4000);
                try {
                    //press days per week
                    driver.findElement(By.xpath("//*[@aria-label='Days per Week']")).click();
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working" + e);
                }//end of try n catch
                Thread.sleep(4000);
                try {
                    //select amount of days
                    driver.findElement(By.xpath("//*[@value='1']")).click();
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                Thread.sleep(4000);
                try {
                    //eneter amount of miles
                    driver.findElement(By.xpath("//*[@data-formotivid='GiveMilesOneWay']")).sendKeys("22");
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working" + e);
                }//end of catch n try
                Thread.sleep(4000);
                try {
                    //click next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e) {
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                Thread.sleep(4000);
                try {
                    //click next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e) {
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                Thread.sleep(4000);
                try {
                    //click next
                    driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).submit();
                }catch (Exception e) {
                    //print out statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                Thread.sleep(4000);
                try {
                    //press gender drop down
                    driver.findElement(By.xpath("//*[@aria-label='Gender']")).click();
                }catch (Exception e){
                    //print statement
                    System.out.println("Not working " + e);
                }//end of try n catch
                try {
                    //press male
                    driver.findElement(By.xpath("//*[@value='Male']")).click();
                }catch (Exception e){
                    //print statmeent
                    System.out.println("Not working " + e);
                }//end of catch n try
                Thread.sleep(4000);
                try {
                    //press click and continue
                    driver.findElement(By.xpath("//*[@type='submit']")).click();
                }catch (Exception e){
                    //print statment
                    System.out.println("Not working " + e);
                }//end of try n catch
            }//end of for loop
        }//end of main method
    }// end of class
}//end of class

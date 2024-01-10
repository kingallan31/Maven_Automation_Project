package Day9_12052023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Array;
import java.util.ArrayList;

public class Class_Assignment {
    public static void main(String[] args) {

        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Allan");
        firstName.add("Ben");
        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Aronov");
        lastName.add("Mama");
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11432");
        zipCode.add("11435");
        ArrayList<String> dob = new ArrayList<>();
        dob.add("12/31/2001");
        dob.add("1/1/2001");

        ArrayList<String> vehicleYear = new ArrayList<>();
        vehicleYear.add("1999");
        vehicleYear.add("2021");
        ArrayList<String> vehicleMake = new ArrayList<>();
        vehicleMake.add("Mercedez");
        vehicleMake.add("BMW");
        ArrayList<String> vehicleModel = new ArrayList<>();
        vehicleModel.add("CLA 250");
        vehicleMake.add(("330i"));
        ArrayList<String> daysPerWeek = new ArrayList<>();
        daysPerWeek.add("6");
        daysPerWeek.add("1");
        ArrayList<String> miles = new ArrayList<>();
        miles.add("30000");
        miles.add("130000");

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
            try {
                //click auto on check box
                ArrayList<WebElement> check = new ArrayList<>(driver.findElements(By.xpath("//*[@class='product-checkbox']")));
                check.get(0).click();
            } catch (Exception e) {
//print out reason for failure
            System.out.println("currently not working  " + e);
        }
        //click start my quote
        driver.findElement(By.xpath("//*[text()='Start My Quote']")).click();
        //enter zip
        WebElement realZip = driver.findElement(By.xpath("//*[@id='bundle-modal-zip']"));
        realZip.clear();
        realZip.sendKeys(zipCode.get(i));
        try {
            //click on auto check box
            ArrayList<WebElement> Check = new ArrayList<>(driver.findElements(By.xpath("//*[@class='product-checkbox']")));
            Check.get(6).click();
        } catch (Exception e) {
            //print out reason for failure
            System.out.println("currently not working  " + e);
        }

    }

}





    }//end of main
//end of class

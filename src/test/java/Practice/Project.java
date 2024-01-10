package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Project {

    public static void main(String[] args) throws InterruptedException {

    //declare webdrivermanager to setup the chromedriver
        WebDriverManager.chromedriver().setup();
        //set chromeoptions for preset of arguments for the driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        //declare your web driver and pass the options variable inside the chromedriver
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.bethpagefcu.com/business/money-saving-tips/");
        ArrayList<WebElement> bethHeaders = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class, 'menu-item-has-children')]")));
        Thread.sleep(3000);
        bethHeaders.get(19).click();
        Thread.sleep(2000);
        driver.findElements(By.xpath("//*[text()= 'Bank at Work Program']")).get(1).click();
        Thread.sleep(2000);


        Thread.sleep(2000);







    }//end of main

}//end of class

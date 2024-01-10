package Day7_11282023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_WebElement {
    public static void main(String[] args) throws InterruptedException {
//setup the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chromeoptions
        options.addArguments("start-maximized");
        //open incognito mode
        options.addArguments("incognito");
        //run in headless mode (runs in the background)
        // options.addArguments("headless");
        //define the webdriver and pass the options argument
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calc site
        driver.navigate().to("https://www.mortgagecalculator.org/");
        //store the home value into web element variable
        WebElement homeValue = driver.findElement(By.xpath("//*[@id = 'homeval']"));
        //clear the home value field
        homeValue.clear();
        //type in 900000
        homeValue.sendKeys("900000");
        //wait 2 seconds
        Thread.sleep(2000);
        //quit the brower
        driver.quit();

    }//end of main

}// end of class

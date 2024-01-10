package Day5_11212023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_GoogleSearchTest  {public static void main(String[] args) throws InterruptedException {
    //setup the chromedriver with webdrivermanager
    WebDriverManager.chromedriver().setup();
    //define the webdriver
    WebDriver driver = new ChromeDriver();
    //navigate to google web page
    driver.navigate().to("https://www.google.com");
    //maximize the driver as in the screen
    driver.manage().window().maximize();
    //search for cars
    driver.findElement(By.xpath("//*[@name= 'q']")).sendKeys("cars");
    //hit submit on google search button
    driver.findElement(By.xpath("//*[@name= 'btnk']")).submit();
    //slow down by 2 seconds
    Thread.sleep(2000);
    //store the results in a string variable
    String searchResult = driver.findElement(By.xpath("//*[@id= 'result-stats]")).getText();
    //print out the result to the console
    System.out.println("Search result is " + searchResult);
            //quit the browser
    driver.quit();

}//end of main

}//end of class

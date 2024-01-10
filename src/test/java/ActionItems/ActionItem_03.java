package ActionItems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActionItem_03 {
    public static void main(String[] args) throws InterruptedException {

        //setup the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chromeoptions
        options.addArguments("start-maximized");
        //open in incognito mode
        options.addArguments("incognito");
        //run in headless mode (runs in the background)
//        options.addArguments("headless");
        //define the webdriver and pass the options argument
        WebDriver driver = new ChromeDriver(options);
        //navigate to bing
        driver.navigate().to("https://bing.com");
        //wait 2 seconds
        Thread.sleep(2000);
        //maximize window
        driver.manage().window().maximize();
        //search for porsche 911
        driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("porsche 911");
        //click on search button
        driver.findElement(By.xpath("//*[@id='search_icon']")).submit();
        //store results
        String searchResult = driver.findElement(By.xpath("//*[@class= 'sb_count']")).getText();
       //print out the result to the console
        System.out.println("Search result is " + searchResult);
        //split the search result using the split command
        String[] searchResultArray = searchResult.split(" ");
        //print out only the search results number
        System.out.println("Search result is " + searchResultArray[1]);
        //quit browser
        driver.quit();


    }//end of main

}//end of class

package Day8_120423;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_Selectby_Xpath {
    public static void main(String[] args) throws InterruptedException {
        //declare webdrivermanager to setup the chromedriver
        WebDriverManager.chromedriver().setup();
        //set chromeoptions for preset of arguments for the driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        //declare your web driver and pass the options variable inside the chromedriver
        WebDriver driver = new ChromeDriver(options);

        //naviagte to mortgage calc website
        driver.navigate().to("https://www.mortgagecalculator.org");
        //wait for few sec
        Thread.sleep(3000);
        //clear snd enter the homevalue
        WebElement homeVal = driver.findElement(By.xpath("//*[@id='homeval']"));
        homeVal.clear();
        homeVal.sendKeys("450000");
        //clear and enter down payment
        WebElement dPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));
        dPayment.clear();
        dPayment.sendKeys("9000");
        //click on dropdown
        driver.findElement(By.xpath("//*[@name='param[start_month]']")).click();
        //click by xpath visible text for january
        driver.findElement(By.xpath("//*[text()='Jan']")).click();
        Thread.sleep(2000);
        //verify that it selects back the dec default month
        driver.findElement(By.xpath("//*[text()='Dec']"));
        Thread.sleep(4000);
        //quit
        driver.quit();

    }//end of main

    }// end of class

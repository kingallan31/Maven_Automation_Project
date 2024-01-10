package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Practice_Handling_Tabs {

    public static void main(String[] args) throws InterruptedException {

        //declare webdrivermanager to setup the chromedriver
        WebDriverManager.chromedriver().setup();
        //set chromeoptions for preset of arguments for the driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        //declare your web driver and pass the options variable inside the chromedriver
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://nyulangone.org/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@href='/doctors']")).click();
        Thread.sleep(3000);
        driver.findElements(By.xpath("//*[text()= 'NYU Grossman School of Medicine']")).get(1).click();
        Thread.sleep(3000);
        ArrayList<String> penis = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(penis.get(0));
        Thread.sleep(3000);
        driver.close();
        driver.findElement(By.xpath("//*[@href='/doctors']")).click();
        driver.switchTo().window(penis.get(1));



    }//end of main method


}//end of class

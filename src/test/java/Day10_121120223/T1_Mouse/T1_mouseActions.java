package Day10_121120223.T1_Mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_mouseActions {

    public static void main(String[] args) throws InterruptedException {

        //declare webdrivermanager to setup the chromedriver
        WebDriverManager.chromedriver().setup();
        //set chromeoptions for preset of arguments for the driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        //declare your web driver and pass the options variable inside the chromedriver
        WebDriver driver = new ChromeDriver(options);

        //navigate to ups site
        driver.navigate().to("https://www.usps.com");
        //declare mouse item action
        Thread.sleep(3000);
        Actions mouseAction = new Actions(driver);
        //hover to quick tools module
        WebElement quickTool = driver.findElement(By.xpath("//*[text()='Quick Tools']"));
        mouseAction.moveToElement(quickTool).perform();
        //click on track a package using mouse click
        WebElement tracPackage = driver.findElement(By.xpath("//*[text()='Track a Package']"));
        mouseAction.moveToElement(tracPackage).click().perform();
        //type in invalid tracking # on tracking search field
        Thread.sleep(3000);
        WebElement searchField = driver.findElement(By.xpath("//*[@id='tracking-input']"));
        //when the element is under text area, you may need to click on that text box first and then use send keys
        mouseAction.moveToElement(searchField).click().sendKeys("1181818181818181818").perform();

    }//end of main
}//end of class

package Day11_12122023;

import Day10_121120223.T1_Mouse.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T1_Reusable_Metlife {
    public static void main(String[] args) throws InterruptedException {
        //instantiate the driver
        WebDriver driver = Reusable_Methods.setUpDriver();
        //navigate to metlife
        driver.navigate().to("https://www.metlife.com/");
        //click on the solutions tab
        Reusable_Methods.clickMethod(driver, "//*[@aria-controls = 'section1']", "Solutions Tab");
        //click on the dental menu
        Reusable_Methods.clickMethod(driver, "//*[text() = 'Dental']", "Solutions Tab");
        //quit the driver
        Thread.sleep(2000);
        driver.quit();
    }//end of main
}//end of class

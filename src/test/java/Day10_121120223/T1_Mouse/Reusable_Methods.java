package Day10_121120223.T1_Mouse;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Element;
import java.util.ArrayList;

public class Reusable_Methods {

    //create a click method to click on any web element
    public static void clickMethod(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ":" + e);
        }//end of click
    }//end of click method

    public static void typeTextByJSE(WebDriver driver, String xpath, String userValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement textField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            String textToType = new String(userValue);
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].value = arguments[1];", textField, textToType);
        } catch (Exception e) {
            System.out.println("Unable to type text into  " + elementName);
        }
    }

    public static void clickElementWithJse(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            jsExecutor.executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to click element using JavascriptExecutor");
        }
    }


    public static void clickMethodVisibility(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ":" + e);
        }//end of click
    }//end of click method

    public static void clickMethodElementClickable(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ":" + e);
        }//end of click
    }//end of click method

    //create a submit method to submit on any web element
    public static void submitMethod(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + ":" + e);
        }//end of submit method

    }//end of

    public static String captureText(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String result = "";
        try {
            result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).getText();
        } catch (Exception e) {
            System.out.println("Unable to get text " + ":" + e);
        }
        return result;
    }//end of capture text method

    public static WebDriver setUpDriver() {
        //declare webdrivermanager to setup the chromedriver
        WebDriverManager.chromedriver().setup();
        //set chromeoptions for preset of arguments for the driver
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("incognito");
        options.addArguments("start-maximized");
        //declare your web driver and pass the options variable inside the chromedriver
        WebDriver driver = new ChromeDriver(options);
        //return a driver instance
        return driver;
    }//end of settup driver method
    //create a click method to click on any web element
    //create a click method to click on any web element by index
    public static void clickByIndexMethod(WebDriver driver, String xpath, int index, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ":" + e);
        }
    }
    public static void clearMethod(WebDriver driver, String xpath, int index, String elementName) {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            try {
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).clear();
            } catch (Exception e) {
                System.out.println("Unable to clear on element " + elementName + ":" + e);
            }
    }//end of clear method

    public static void sendKeys(WebDriver driver, String xpath, String userValue ,String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(userValue);
        }catch (Exception e) {
            System.out.println("Unable to send keys on element " + elementName + ":" + e);
        }// end of try catch
    }//end of send keys method

    public static void scrollByIndex(WebDriver driver, String xpath, int index, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
         WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollintoview(true);",element);
        }catch (Exception e){
            System.out.println("Unable to scroll to element " + elementName + ":" + e);
        }//end of try catch
    }//end of scroll by index
    public static void scroll(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollintoview(true);",element);
        }catch (Exception e){
            System.out.println("Unable to scroll to element " + elementName + ":" + e);
        }//end of try catch
    }//end of scroll

    public static void selectByVisibleText(WebDriver driver, String xpath, String visibletext ,String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
           WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Select select = new Select (element);
            select.selectByVisibleText(visibletext);
        }catch (Exception e) {
            System.out.println("Unable to send keys on element " + elementName + ":" + e);
        }// end of try catch
    }//end of send keys method
    public static void hoverAndClickMethod(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            Actions mouseAction = new Actions(driver);
            WebElement quickTool = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            mouseAction.moveToElement(quickTool).perform();
        } catch (Exception e) {
            System.out.println("Unable to mouseAction to" + elementName);
        }

    }//end of hover over method

    public static void hoverActionsMethod(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            Actions mouseAction = new Actions(driver);
            WebElement quickTool = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            mouseAction.moveToElement(quickTool).perform();
        } catch (Exception e) {
            System.out.println("Unable to mouseAction to" + elementName);
        }
    }//end of just hover method

    public static void switchToTabByIndex(WebDriver driver,int index,String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(index));
        } catch (Exception e) {
            System.out.println("Unable to Switch Tabs" + elementName);
        }//end of try n catch
    }//end of switchtotabbyindexMethod

        public static void clickElementWithJs(WebDriver driver,String xpath, String elementName) {
            WebDriverWait wait = new WebDriverWait(driver,10);
            try {
                JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
                jsExecutor.executeScript("arguments[0].click();", element);
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("Failed to click element using JavascriptExecutor");
            }
        }//end of clickELementWithJS

    public static void openCurrentURLMethod(WebDriver driver,String capturedUrl ){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("window.open('" + capturedUrl + "','_blank');");
        }catch(Exception e){
            System.out.println("Unable to open : " + capturedUrl + "on a new tab");
        }
    }

    public static void moveByOffsetX(WebDriver driver, String xpath,int target, int yOffset, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            WebElement sliderHandle = driver.findElement(By.xpath(xpath));
            // Calculate the target offset (adjust this value based on your requirements)
            int targetOffset = target;
            // Use the Actions class to perform the drag-and-drop operation
            Actions builder = new Actions(driver);
            // Click and hold on the slider handle
            builder.clickAndHold(sliderHandle).perform();
            // Move the slider handle to the desired location
            builder.moveByOffset(targetOffset, 0).perform();
            // Release the slider handle
            builder.release().perform();
            // Pause for a moment (you may adjust this based on your needs)
        }catch(Exception e){
            System.out.println("Unable to move " + e);
        }
    }




}//end of class









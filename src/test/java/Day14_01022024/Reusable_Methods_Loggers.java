package Day14_01022024;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.ArrayList;

import static Day13_12192023.TestParent.logger;

public class Reusable_Methods_Loggers {
    //create a click method to click on any web element

    public static void clickMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
            logger.log(LogStatus.PASS, "Successfully clicked on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "unable to click on " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }//end of click method

    public static void isConditionTrue(boolean bool, ExtentTest logger) {
        if (bool == true) {
            logger.log(LogStatus.PASS, "Boolean Condition is " + bool);
        } else {
            logger.log(LogStatus.FAIL, "Boolean Condition is " + bool);
        }
    }//end of isConditionTrue method

    public static void typeTextByJSE(WebDriver driver, String xpath, ExtentTest logger, String userValue, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement textField = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            String textToType = new String(userValue);
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("arguments[0].value = arguments[1];", textField, textToType);
            logger.log(LogStatus.PASS, "Successfully clicked on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to type text into  " + elementName);
            logger.log(LogStatus.FAIL, "unable to click on " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }

    public static void clickMethodVisibility(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
            logger.log(LogStatus.PASS, "Successfully clicked on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "unable to click on " + elementName);
            getScreenShot(driver,elementName,logger);
        }//end of click
    }//end of click method


    public static void clickMethodElementClickable(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
            logger.log(LogStatus.PASS, "Successfully clicked on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "unable to click on " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }
    public static void submitMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).submit();
            logger.log(LogStatus.PASS, "Successfully submitted " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "unable to submit " + elementName);
            getScreenShot(driver,elementName,logger);
        }//end of submit method
    }

        public static String captureText(WebDriver driver, String xpath, ExtentTest logger,String elementName) {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            String result = "";
            try {
                result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).getText();
                logger.log(LogStatus.PASS, "Successfully captured text " + elementName);
            } catch (Exception e) {
                System.out.println("Unable to get text " + ":" + e);
                logger.log(LogStatus.FAIL, "Failed to capture text " + elementName);
                getScreenShot(driver,elementName,logger);
            }
            return result;
        }
            public static void clickByIndexMethod(WebDriver driver, String xpath, int index, ExtentTest logger, String elementName) {
                WebDriverWait wait = new WebDriverWait(driver, 10);
                try {
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).click();
                    logger.log(LogStatus.PASS, "Successfully clicked on text " + elementName);
                } catch (Exception e) {
                    System.out.println("Unable to click on element " + elementName + ":" + e);
                    logger.log(LogStatus.FAIL, "Failed to click on text " + elementName);
                    getScreenShot(driver,elementName,logger);
                }
            }

    public static void clearMethod(WebDriver driver, String xpath, int index, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).clear();
            logger.log(LogStatus.PASS, "Successfully cleared " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to clear on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "Failed to clear " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }//end of clear method

    public static void sendKeys(WebDriver driver, String xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(userValue);
            logger.log(LogStatus.PASS, "Successfully sent keys " + elementName);
        }catch (Exception e) {
            System.out.println("Unable to send keys on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "Failed to send keys " + elementName);
            getScreenShot(driver,elementName,logger);
        }// end of try catch
    }//end of send keys method

    public static void scrollByIndex(WebDriver driver, String xpath, int index, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index);
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollintoview(true);",element);
            logger.log(LogStatus.PASS, "Successfully scrolled " + elementName);
        }catch (Exception e){
            System.out.println("Unable to scroll to element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "Failed to scroll " + elementName);
        }//end of try catch
    }//end of scroll by index

    public static void scroll(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollintoview(true);",element);
            logger.log(LogStatus.PASS, "Successfully scrolled " + elementName);
        }catch (Exception e){
            System.out.println("Unable to scroll to element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "Failed to scroll " + elementName);
        }//end of try catch
    }//end of scroll

    public static void selectByVisibleText(WebDriver driver, String xpath, String visibletext, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Select select = new Select (element);
            select.selectByVisibleText(visibletext);
            logger.log(LogStatus.PASS, "Successfully scrolled " + elementName);
        }catch (Exception e) {
            System.out.println("Unable to send keys on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "Failed to scroll " + elementName);
            getScreenShot(driver,elementName,logger);
        }// end of try catch
    }//end of send keys method
    public static void hoverAndClickMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            Actions mouseAction = new Actions(driver);
            WebElement quickTool = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            mouseAction.moveToElement(quickTool).perform();
            logger.log(LogStatus.PASS, "Successfully hovered " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to mouseAction to" + elementName);
            logger.log(LogStatus.FAIL, "Failed to hovered " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }
    public static void hoverActionsMethod(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            Actions mouseAction = new Actions(driver);
            WebElement quickTool = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            mouseAction.moveToElement(quickTool).perform();
            logger.log(LogStatus.PASS, "Successfully hovered " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to mouseAction to" + elementName);
            logger.log(LogStatus.FAIL, "Failed to hovered " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }//end of just hover method

    public static void switchToTabByIndex(WebDriver driver,int index, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(index));
            logger.log(LogStatus.PASS, "Successfully switched tabs " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to Switch Tabs" + elementName);
            logger.log(LogStatus.FAIL, "Failed to switchtabs " + elementName);
            getScreenShot(driver,elementName,logger);
        }//end of try n catch
    }//end of switchtotabbyindexMethod

    public static void openCurrentURLMethod(WebDriver driver,String capturedUrl, ExtentTest logger ){
        WebDriverWait wait = new WebDriverWait(driver,10);
        try{
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            jsExecutor.executeScript("window.open('" + capturedUrl + "','_blank');");
            logger.log(LogStatus.PASS, "Successfully switched tabs " + capturedUrl);
        }catch(Exception e){
            System.out.println("Unable to open : " + capturedUrl + "on a new tab");
            logger.log(LogStatus.FAIL, "Failed to switchtabs " + capturedUrl);
        }
    }

    public static void scrollByPixel(WebDriver driver, String xValue, String yValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("scroll(" + xValue + "," + yValue + ")");
            logger.log(LogStatus.PASS, "Successfully clicked on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to scroll by pixels ");
            logger.log(LogStatus.FAIL, "unable to click on " + elementName);
        }
    }
    public static void captureHrefAndClick(WebDriver driver, String xpath, int Index, String elementName,ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            WebElement newMailingLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            String hrefAttributeValue = newMailingLink.getAttribute("href");
            System.out.println("Href Attribute Value: " + hrefAttributeValue);
            openNewTab(driver);
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(Index));
            driver.get(hrefAttributeValue);
            logger.log(LogStatus.PASS, "Successfully clicked on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to capture href and Open tab" + elementName);
            logger.log(LogStatus.FAIL, "unable to click on " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }

    public static void openNewTab(WebDriver driver) {
        // Execute JavaScript to open a new tab
        ((JavascriptExecutor) driver).executeScript("window.open();");
    }
    public static void submitMethodclassgiven(WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).submit();
            logger.log(LogStatus.PASS, "Successfully submitted on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "unable to submit on " + elementName);
            getScreenShot(driver,elementName,logger);
        }//end of try catch
    }//end of submit method

    public static void sendKeysfromclass(WebDriver driver, String xpath, String userValue, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(userValue);
            logger.log(LogStatus.PASS, "Successfully entered text on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to send keys on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL, "unable to enter text on " + elementName);
            getScreenShot(driver,elementName,logger);
        }// end of try catch
    }//end of send keys method

    public static void getScreenShot(WebDriver driver, String imageName, ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error occurred while taking SCREENSHOT!!!");
            e.printStackTrace();
        }
    }//end of getScreenshot method


}











import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;

public class ProjectTest {


    @Test
    public static void testOne() throws InterruptedException {
        WebDriver driver = Helper.setupDriver();
        driver.get(Helper.ORANGEHRMLINK);
        Assert.assertEquals(driver.getCurrentUrl(), Helper.ORANGEHRMLINK);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to(Helper.SHAZAMURL);
        Assert.assertEquals(driver.getCurrentUrl(), Helper.SHAZAMURL);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.navigate().to(Helper.SHAZAMURL);
        driver.quit();
    }

    @Test
    public static void testTwo() {
        WebDriver driver = Helper.setupDriver();
        driver.get(Helper.WIKISELENIUM);
        File folder = new File(Helper.FINALPROJECTFOLDER + "FinalProject1");

        if (folder.mkdir()) {
            System.out.println("folder new_folder was created");
        } else {
            System.out.println("folder new_folder already exists");
        }
        WebElement piska = driver.findElement(By.xpath(Helper.XPATHWIKI));
        String pskaSTR = piska.getText();

        File fileElement = new File(Helper.FINALPROJECTFOLDER + "FinalProject1\\" + "anna" + Helper.TXT);

        try {
            FileWriter writer = new FileWriter(fileElement);
            writer.write(pskaSTR);
            writer.close();
        } catch (IOException e) {
            System.out.println("not write anithing");
        }

        File imageFile = new File(Helper.FINALPROJECTFOLDER + "FinalProject1\\" + Helper.JPG);
        File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, imageFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test
    public static void testTri() throws InterruptedException {
        WebDriver driver = Helper.setupDriver();
        driver.get(Helper.HOUSINGCAMERA);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement nameFiled = driver.findElement(By.id(Helper.NAMEFILEDCAMERA));
        WebElement passwordFiled = driver.findElement(By.id(Helper.PASSWORDFIELDCAMERA));
        nameFiled.sendKeys("anna");
        passwordFiled.sendKeys("michaelo20");
        WebElement gender1 = driver.findElement(By.id(Helper.GENDERMALE));
        Thread.sleep(3000);
        gender1.click();
        WebElement gender2 = driver.findElement(By.id(Helper.GENDERFEMALE));
        Thread.sleep(3000);
        gender2.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Helper.CONTACTCAMERANAME))).sendKeys("052700");
        Select selectGroup1 = new Select(driver.findElement(By.id(Helper.DROPDOWNDEGREE)));
        selectGroup1.selectByVisibleText("B.Com");
        Thread.sleep(3000);
        WebElement checkBox1 = driver.findElement(By.id(Helper.HOBBIESCHECKBOX1));
        checkBox1.click();
        driver.close();

    }

    @Test
    public static void testFour() {
        WebDriver driver = Helper.setupDriver();
        driver.get(Helper.WIKIELEPHANT);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Helper.SERCH))).sendKeys("fish");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Helper.SEARCHBTN))).click();
        if (driver.getCurrentUrl().equals(Helper.WIKIFISH)) {

            System.out.println("puffff");
        } else {
            System.out.println("..olala..");
        }
        driver.quit();

    }

    @Test
    public static void testFive() {
        WebDriver driver = Helper.setupDriver();
        driver.get(Helper.SHAZAMURL);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions actions = new Actions(driver);
        actions.doubleClick(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Helper.SHAZAMLOG)))).perform();
        driver.close();

    }


}















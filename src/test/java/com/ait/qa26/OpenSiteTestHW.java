package com.ait.qa26;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenSiteTestHW {

  WebDriver driver;

  //before - setUp
  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    // driver.get("https://demowebshop.tricentis.com/");//without hystory
    driver.navigate().to("https://demowebshop.tricentis.com/");//with history
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
    // maximize browser window
    driver.manage().window().maximize();
    // set implicit timeout
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  //tests
  @Test
  public void openSiteTestHW() {
    System.out.println("Site opened successfully!!!");
  }

  @Test
  public void findElementByCSSTest() {
    //tag name = css
    //  WebElement element = driver.findElement(By.tagName("app-search"));
    driver.findElement(By.cssSelector("script"));

    // id -> css (#)
    //driver.findElement(By.id("city")); ->
    driver.findElement(By.cssSelector("#dialog-notifications-success"));

    // className -> css(.)
    // driver.findElement(By.className("input-label"));
    driver.findElement(By.cssSelector(".close"));

    // parameter-attribute  -> css([])
    //driver.findElement(By.name("viewport"));
    driver.findElement(By.cssSelector("[title='Notification']"));

    //contains -> *
    driver.findElement(By.cssSelector("[class*='header']"));
    //start -> ^
    //driver.findElement(By.cssSelector("[class^='selectors']"));
    //end on -> $
    driver.findElement(By.cssSelector("[class$='wrapper']"));

  }

  @Test
  public void findElementByXPathTest() {
    //  tag name = xpath // tag
    driver.findElement(By.xpath("//script"));

    // id, class, and so on -> xpath//*[@attribute='value']
    // //*[@id='city']
    driver.findElement(By.xpath("//*[@id='bar-notification']"));

    //contains -> // *[contains(.,'Text')]
    driver.findElement(By.xpath("//span[contains(.,'Categories')]"));
  }

  //after - tearDown
  @AfterMethod
  public void tearDown() {
    driver.quit();// all tabs & browser
    //driver.close(); // only one tab if tab only one than close browser
  }
}


package com.ait.qa26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenSiteTest {

  WebDriver driver;

  //before - setUp
  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    // driver.get("https://www.google.com/");//without hystory
    driver.navigate().to("https://www.google.com/");//with history
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
  }

  //tests
  @Test
  public void openSiteTest() {
    System.out.println("Site opened!!!");
  }

  //after - tearDown
  @AfterMethod
  public void tearDown() {
    driver.quit();// all tabs & browser
    //driver.close(); // only one tab if tab only one than close browser
  }
}


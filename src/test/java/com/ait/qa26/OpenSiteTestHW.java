package com.ait.qa26;

import org.openqa.selenium.WebDriver;
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
  }

  //tests
  @Test
  public void openSiteTestHW() {
    System.out.println("Site opened successfully!!!");
  }

  //after - tearDown
  @AfterMethod
  public void tearDown() {
    driver.quit();// all tabs & browser
    //driver.close(); // only one tab if tab only one than close browser
  }
}


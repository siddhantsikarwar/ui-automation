package com.healthcare.framework.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        // Specify the driver version that matches your Chrome version
        WebDriverManager.chromedriver().driverVersion("132.0.6834.160").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

@AfterClass
public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}
}

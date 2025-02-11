package com.healthcare.framework.tests;

import com.healthcare.framework.utilities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitle(){
        driver.get("https://www.india.gov.in");
        //driver.findElement(By.className("https://www.india.gov.in")).click();
        String title=driver.getTitle();
        System.out.println("fetched title is : "+title);
        Assert.assertTrue(title.contains("National Portal of India"),"Title mismatch");
    }
}

package com.test.openchart.tests;

import com.test.openchart.pages.OpenChartLogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenChartLogInTest extends OpenChartTestBase {

    @Test
    public void HappyBathLoginFunctionality() throws InterruptedException {

        OpenChartLogInPage loginPage=new OpenChartLogInPage(driver);
        loginPage.LogInFunctionality("demo","demo");
        Assert.assertEquals(driver.getTitle().trim(),"Dashboard");

    }



    @Test
    public void validateNegativeLogin() throws InterruptedException {
        OpenChartLogInPage loginPage=new OpenChartLogInPage(driver);
        loginPage.LogInFunctionality("dema","hsdj");
        Assert.assertEquals(loginPage.errorMessage(),"No match for Username and/or Password.");

    }

}

package com.test.openchart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenChartHomePage {



    public OpenChartHomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }



    @FindBy(css = ".btn-close")
    WebElement closeAlert;



    public void homePageFunction(WebDriver driver) throws InterruptedException {
       OpenChartLogInPage logInPage=new OpenChartLogInPage(driver);
        logInPage.LogInFunctionality("demo","demo");
        closeAlert.click();
        Thread.sleep(1000);
    }


}

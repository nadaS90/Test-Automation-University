package com.teatautomationu.chp3annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogToTAU {
    WebDriver driver;

    @BeforeClass
    public void  setUp () throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MarghanyN\\automationLearning\\Resources\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testautomationu.applitools.com/");
        System.out.println("1. Open Chrome & Application");
    }

    @Test (priority = 1)
    public void navigateLogIn(){
        WebElement navigateSin = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div[1]/div/a[1]"));
        WebDriverWait wait = new WebDriverWait(driver,300);
        navigateSin.click();
    }
    public void LogIn(){

    }

}

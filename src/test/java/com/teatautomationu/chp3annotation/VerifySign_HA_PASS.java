package com.teatautomationu.chp3annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VerifySign_HA_PASS {

        WebDriver driver;

        @BeforeClass
        public void  setUp () throws Exception {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\MarghanyN\\automationLearning\\Resources\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://opensource-demo.orangehrmlive.com/");
            System.out.println("1. Open Chrome & Application");
        }

    @Test
    public void signIn ()
    {
        WebElement textUsername = driver.findElement(By.xpath(".//*[@id='txtUsername']"));
        textUsername.sendKeys("Admin");

        WebElement textPassword = driver.findElement(By.id("txtPassword"));
        textPassword.sendKeys("admin123");

        WebElement buttonLogin = driver.findElement(By.id("btnLogin"));
        buttonLogin.click();

        System.out.println("2. Sign In");
    }
}

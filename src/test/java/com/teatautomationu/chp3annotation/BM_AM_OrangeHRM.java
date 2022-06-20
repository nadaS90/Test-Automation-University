package com.teatautomationu.chp3annotation;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.xml.ws.WebEndpoint;

public class BM_AM_OrangeHRM {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MarghanyN\\automationLearning\\Resources\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("1. Open Chrome & Application");

    }

    @Test
    public void signIn(){
        WebElement textUsername = driver.findElement(By.id("txtUsername"));
        textUsername.sendKeys("Admin");

        WebElement textPassword = driver.findElement(By.id("txtPassword"));
        textPassword.sendKeys("admin123");

        WebElement buttonLogin = driver.findElement(By.id("btnLogin"));
        buttonLogin.click();

        System.out.println("2. Sign In");
    }

    @Test
    public void userSearch(){
        WebElement menuAdmin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        menuAdmin.click();

        WebElement textUserName = driver.findElement(By.id("searchSystemUser_userName"));
        textUserName.sendKeys("Admin");

        WebElement buttonSearch = driver.findElement(By.id("searchBtn"));
        buttonSearch.click();

        System.out.println("3. Search For User");

    }

    @Test
    public void userSignOut(){
        WebElement linkWelcome = driver.findElement(By.id("welcome"));
        linkWelcome.click();

        WebElement linkLogout = driver.findElement(By.xpath("//div[@id='welcome-menu']/descendant::a[contains(@href,'logout')]"));
        linkLogout.click();

        System.out.println("4. Sign Out");

    }

    @AfterMethod
    public void closeBrowser(){
        System.out.println("5. Close Chrome & Application");
        driver.quit();

    }


}

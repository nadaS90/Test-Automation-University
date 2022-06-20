package com.teatautomationu.chp3annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.xml.bind.Element;

public class DependOnMethods_No {

    WebDriver driver;

    @BeforeClass
    public void test1_SetUpChrome(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MarghanyN\\automationLearning\\Resources\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("1. Set up Chrome and app");
    }

    @Test
    public void test3_Signin() {
        WebElement textUsername = driver.findElement(By.id("txtUsername"));
        textUsername.sendKeys("Admin");

        WebElement textPassword = driver.findElement(By.id("txtPassword"));
        textPassword.sendKeys("admin123");

        WebElement buttonLogin = driver.findElement(By.id("btnLogin"));
        buttonLogin.click();

        System.out.println("2. Sign In");

    }
    @Test
    public void test3_VerifySignIn(){
        WebElement evdnce = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1"));
        String strng = evdnce.getText();
        System.out.println(strng);
        Assert.assertEquals("Dashboard", strng);

        System.out.println("3. Assertion done login");
    }

    @Test
    public void  test5_SearchUser(){
        WebElement admnTab = driver.findElement(By.id("menu_admin_viewAdminModule"));
        admnTab.click();

        WebElement searchName = driver.findElement(By.id("searchSystemUser_userName"));
        searchName.sendKeys("Admin");

        WebElement searchBtn = driver.findElement(By.id("searchBtn"));
        searchBtn.click();

        System.out.println("4. Search admin Done");
    }

    @Test
    public  void test7_SignOut(){
        WebElement logOut = driver.findElement(By.id("welcome"));
        logOut.click();

        WebElement signOut = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[9]/ul/li[3]/a"));
        signOut.click();
        System.out.println( " 5. Sign out Done");
    }

    public void teatSown(){
        driver.quit();
    }

    }


package com.teatautomationu.chp3annotation;
import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test
public class DefualtExecutionOrder_Class {
    WebDriver driver;
    public void  setUp () throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MarghanyN\\automationLearning\\Resources\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php");
    }

@Test (priority = 1)
    public void signIn(){
        WebElement navigateSignIn = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a"));
        navigateSignIn.click();

        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("TestNG@Framework.com");

        WebElement passWord = driver.findElement(By.id("passwd"));
        passWord.sendKeys("TestNG1234");

        WebElement submitButn = driver.findElement(By.id("SubmitLogin"));
        submitButn.click();

        System.out.println(" 2. Sign in");


    }

@Test (priority = 2)
    public void searchTshirt(){}

@Test (priority = 3)
    public  void signOut() {}

    @AfterClass
    public  void tearDown () throws Exception {}

}

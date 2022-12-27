package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.pages.OTPVerificationPage;
import org.example.pages.RegistrationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Hooks {

    public static WebDriver driver;
    public static RegistrationPage registrationElements = new RegistrationPage();
    public static OTPVerificationPage otpVerificationElements = new OTPVerificationPage();

    @Before
    public static void openBrowser(){
        String driverLocation = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverLocation);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public static void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

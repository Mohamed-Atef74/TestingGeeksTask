package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class OTPVerificationPage {

    public WebElement pageHeader(){
        return driver.findElement(By.cssSelector("[class=\"verify-title mt-5 mb-5\"]"));
    }
}

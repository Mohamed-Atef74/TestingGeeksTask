package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;

public class RegistrationPage {

    public WebElement name(){
        return driver.findElement(By.id("name"));
    }

    public WebElement email(){
        return driver.findElement(By.id("registration_email"));
    }

    public WebElement password(){
        return driver.findElement(By.id("registration_password"));
    }

    public WebElement mobile(){
        return driver.findElement(By.id("mobile"));
    }

    public WebElement registerButton(){
        return driver.findElement(By.cssSelector("[class=\"btn btn-success login-btn\"]"));
    }

    public WebElement errorMessage(){
        return driver.findElement(By.cssSelector("[class=\"help-block\"]"));
    }
}

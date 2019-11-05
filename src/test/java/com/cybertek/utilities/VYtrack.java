package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VYtrack {



        public static void main(String[] args) {

            //open browser
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("http://qa2.vytrack.com/user/login");

            //enter user
            WebElement username = driver.findElement(By.name("_username"));

            //sendKeys --> enters given text
            String expectedUser = "user1";
            username.sendKeys(expectedUser);

            //verify that username is displayed in input box
            String actualUsername = username.getAttribute("value");
            System.out.println(actualUsername);
            //enter password
            WebElement password = driver.findElement(By.name("_password"));

            //sendKeys --> enters given text
            String expectedPass = "UserUser123";
            password.sendKeys((expectedPass));

            //verify that password is displayed in input box
            String actualPassword = password.getAttribute("_password");

            //click on password
            WebElement submit = driver.findElement(By.id("_submit"));
            submit.click();

            //verify that url changed to http://qa2.vytrack.com/user/login
            String expected = "https://qa2.vytrack.com/";
            String actual = driver.getCurrentUrl();

            if(expected.equals(actual)) {
                System.out.println("PASS");
            }else {
                System.out.println("FAIL");
            }
            //close the browser
            ((WebDriver) driver).quit();



        }
    }




package com.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 Verify URL not changed
 open chrome
 go to http://practice.cybertekschool.com/forgot_password
 click on Retrieve password
 verify that url did not change
 */

        public class VerifyURLNotChanged {
            public static void main(String[] args) {

// open browser

                WebDriver driver = WebDriverFactory.getDriver("chrome");
       // go to   http://practice.cybertekschool.com/forgot_password
driver.get("http://practice.cybertekschool.com/forgot_password");
// safe the expected url
                String expectedURL = driver.getCurrentUrl();
               //  click on Retrive password
// Webelemnet ---> class that repsents elements frim the webpage
                // findElement--> method used to dind element on a page
                // returns a webelement.
WebElement retrievePassword = driver.findElement(By.id("form_submit"));

retrievePassword.click();

    // veryfy that url did not changed
                String actualUrl = driver.getCurrentUrl();
                if(actualUrl.equals(expectedURL)){
                    System.out.println("PASS");
                }else{
                    System.out.println("Fail");
                }









            }




}

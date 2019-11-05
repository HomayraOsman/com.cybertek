package com.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Verify confirmation message
 * open browser
 * go to http://practice.cybertekschool.com/forgot_password
 * enter any email
 * click on Retrieve password
 * verify that confirmation message says 'Your e-mail's been sent!
 *
 */
public class VerifyConfirmationMessage {
    public static void main(String[] args){

        // open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        // go to http://practice.cybertekschool.com/forgot_password

        driver.get("http://practice.cybertekschool.com/forgot_password");
// enter any email
        WebElement emailInput = driver.findElement(By.name("email"));


// SendKeys -----> enters givin text

        String expectedEmail = "admiralkuka@email.com";
        emailInput.sendKeys(expectedEmail);
// verify that email is displayed in the input box
        String actualEmail = emailInput.getAttribute("value");
        if (expectedEmail.equals(actualEmail)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedEmail=" + expectedEmail);
            System.out.println("actualEmail=" + actualEmail);

        }

// click on Retrieve password
        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();
// verify that confirmation message says "your e-mails been send!
        String actualMessage = "Your e-mail's been send!";
        WebElement messageElement = driver.findElement(By.name("confirmation_message"));
        actualMessage = messageElement.getText();
        String expectedMessage = null;
        if (!actualMessage.equals(expectedMessage)) {
                    System.out.println("FAIL");
                    System.out.println("expectedMessage= " + actualMessage);
                    System.out.println("actualMessage=" + actualMessage);
                } else {
                    System.out.println("PASS");
        }

        driver.quit();

    }


    }

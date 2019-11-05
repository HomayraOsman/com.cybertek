package com.cybertek.utilities;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallTheFactory {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver( "CHROME");
        driver.get("http://practice.cybertekschool.com/open_new_tab");

            }
        }








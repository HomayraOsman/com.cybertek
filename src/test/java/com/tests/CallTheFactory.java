package com.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallTheFactory {
    public static void main(String[] args) {

            WebDriver driver = WebDriverFactory.getDriver(  "Chrome");
        driver.get("http://practice.cybertekschool.com/open_new_tab");

        }
    }



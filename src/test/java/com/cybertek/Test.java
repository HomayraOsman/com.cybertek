package com.cybertek;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/jauid/Downloads/chromedriver");
        Faker faker = new Faker();
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");


        System.out.println(faker.address());



    }
}

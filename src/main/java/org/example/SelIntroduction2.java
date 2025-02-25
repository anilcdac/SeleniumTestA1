package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction2 {
    public static void main(String[] args){

        //Invoking Browser
//        driver object here has access to the methods of Chrome driver which are defined in web Driver Interface

//        chromedriver.exe to launch chrome browser
        // step to invoke chromedriver
        //1. Selenium Manager - remove line where path mentioned
        //2. pass chromedriver manually


        //firefox
//        WebDriver driver = new FirefoxDriver();
        //System.setProperty("webdriver.gecko.driver", "/Users/anilkumarkalshetti/Documents/geckodriver")

        //edge browser
        WebDriver driver = new EdgeDriver();
        //System.setProperty("webdriver.edge.driver", "/Users/anilkumarkalshetti/Documents/msedgedriver")


//  Chrome
        //System.setProperty("webdriver.chrome.driver", "/Users/anilkumarkalshetti/Documents/chromedriver")
//        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com");
        //Print website Title
        System.out.println(driver.getTitle());
        //to check if its redirected, sometime hackers redirect
        System.out.println(driver.getCurrentUrl());


        driver.close();   // closes current window only
        driver.quit();    // closes all associated windows


    }

}

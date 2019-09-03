package com.assignment.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class MyWebDriver {
    private static String browserName = Config.getBrowserDetails();
    private static WebDriver webDriver;

    public MyWebDriver() {
    }



    public static WebDriver getWebDriver() {
        if (webDriver != null) {
            return webDriver;
        }
             else {
                ChromeOptions chromeOptions = new ChromeOptions();
                setChromeDriver();
                webDriver = new ChromeDriver(chromeOptions);
                webDriver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
                webDriver.manage().timeouts().implicitlyWait(1000 ,TimeUnit.SECONDS);
                webDriver.manage().timeouts().setScriptTimeout(30000,TimeUnit.MILLISECONDS);
                webDriver.manage().window().maximize();
            }
        return webDriver;
    }

    private static void setChromeDriver() {
        String os = System.getProperty("os.name").toLowerCase().substring(0, 3);
        //this path is local one, we can write code to install in a certain path based on diff OS
        String chromeBinary = "/home/nineleaps/Downloads/chromedriver_linux64/chromedriver"
                + (os.equals("linux") ? ".exe" : "");
        System.setProperty("webdriver.chrome.driver", chromeBinary);
    }

}

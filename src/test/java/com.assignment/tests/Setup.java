package com.assignment.tests;

import com.assignment.core.Config;
import com.assignment.core.MyWebDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class Setup {

    public Setup() {
        Config.loadPreConfig();
        Config.loadConfig();
    }

    @Before
    public void initConfigs(Scenario scenario) {

    }

    @After
    public void teardown()
    {
        MyWebDriver myWebDriver = new MyWebDriver();
        myWebDriver.getWebDriver().quit();
    }
}

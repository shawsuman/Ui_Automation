package com.assignment;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "classpath:com.assignment.tests",features = "src/test/resources/features",
        tags={},plugin = {"pretty", "html:target/cucumber","json:target/cucumber-json-report.json"})
public class RunCukes {
}

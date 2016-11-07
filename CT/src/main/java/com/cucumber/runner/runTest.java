package com.cucumber.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources",
        glue = "com.cucumber.glue",
        plugin = { 
                    "pretty",
                    "html:target/cucumber",
                } 

        )
public class runTest {
}
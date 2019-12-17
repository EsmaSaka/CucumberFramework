package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)// comes from junit cucumber doeas not have an engine
@CucumberOptions(features = "src\\test\\resources\\features",
        glue ="com\\vytrack\\step_definitions" )

public class CucumberRunner {

}

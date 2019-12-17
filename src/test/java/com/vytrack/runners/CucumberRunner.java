package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)// comes from junit cucumber doeas not have an engine
@CucumberOptions(features = "src\\test\\resources\\features")
public class CucumberRunner {

}

package com.vytrack.step_definitions;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    @Before
    public  void setup(){
        System.out.println("Test Setup!");
    }
    @After
    public  void teardown(Scenario scenario){
        if (scenario.isFailed()){
            System.out.println("test failed");
        }else {
            System.out.println("cleanUp!");
            System.out.println("Test completed");
        }
    }

}

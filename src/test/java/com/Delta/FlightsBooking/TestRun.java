package com.Delta.FlightsBooking;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		features="src/test/java/feature",
		glue={"src/test/java/stepdefinition"}
		)


public class TestRun {

}

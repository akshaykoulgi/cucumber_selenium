package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)   // runwith is used when we have to run specific file

@CucumberOptions(features= {"src/test/resources/login/login.feature"},
glue={"defination"},
dryRun = false,
tags = "@PositiveTesting",
plugin = {"html:testoutput/cucumber.html","junit:testoutput/cucumber.xml","json:testoutput/cucumberjason.xml"})   

public class test_runner {

}

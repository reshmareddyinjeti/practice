package com.girls;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",dryRun = false,strict = true,tags="@Search",
plugin = {"json:target/reshma.json"})
public class RunnerClass {

}

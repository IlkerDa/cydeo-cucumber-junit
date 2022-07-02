package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                //"pretty", --> consolda rapor veriyor featurelerin hangi stepdef.de old gosteriyor
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber", //MAVEN CUCUMBER REPORTING ya da pretty deniliyor
        },
       // publish = true, raporuin linkini consolda veriyor
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@gridtest"


)
public class CukesRunner {

}

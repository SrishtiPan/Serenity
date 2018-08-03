package com.trying.serenity;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={"src/test/resources/features/EnterDetails.feature","src/test/resources/features/SearchFlight.feature"} , glue= {"com.trying.serenity.steps"})
public class DefinitionTestSuite {}

package com.example.rufle.cucumber_fun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:cucumber"
		,snippets=SnippetType.CAMELCASE
		,monochrome = true
		,plugin={"progress"} // ,plugin={"pretty"}
)
public class AllCukeTest {
}

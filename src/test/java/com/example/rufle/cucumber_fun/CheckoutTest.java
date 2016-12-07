package com.example.rufle.cucumber_fun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:cucumber/checkout.feature")
public class CheckoutTest {
}

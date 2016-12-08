package com.example.rufle.cucumber_fun.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import com.example.rufle.cucumber_fun.Checkout;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckoutSteps {
    private Map<String, Integer> prices = new HashMap<String, Integer>();

    private Checkout checkout = new Checkout();

    @Given("^the price of a \"(.*?)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Throwable {
        prices.put(name, price);
    }

    @When("^I checkout (\\d+) \"(.*?)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {
        int price = prices.get(itemName);
        checkout.add(itemCount, price);
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }
}

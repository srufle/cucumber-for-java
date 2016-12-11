package com.example.rufle.cucumber_fun.nicebank.steps;

import org.junit.Assert;

import com.example.rufle.cucumber_fun.nicebank.Account;
import com.example.rufle.cucumber_fun.nicebank.Money;
import com.example.rufle.cucumber_fun.transforms.MoneyConverter;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CashWithdrawlSteps {

    private Account account;
    int amountWithdrawn = 0;

    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        account = new Account();

        // Money amount = new Money(dollars, cents);
        account.deposit(amount);
        Assert.assertEquals("Incorrect account balance -", amount, account.getBalance());
    }

    @When("^I request (\\$\\d+\\.\\d+)$")
    public void iRequest$(int amount) throws Throwable {
        throw new PendingException();
        // amountWithdrawn = account.withdraw(amount);
    }

    @Then("^(\\$\\d+\\.\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int amount) throws Throwable {
        throw new PendingException();
        // Assert.assertEquals(amount, amountWithdrawn);
    }

}

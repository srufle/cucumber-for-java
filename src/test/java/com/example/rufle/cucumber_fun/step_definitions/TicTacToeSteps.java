package com.example.rufle.cucumber_fun.step_definitions;

import java.util.ArrayList;
import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TicTacToeSteps {

    private List<List<String>> board;

    @Given("^a board like this:$")
    public void aBoardLikeThis(DataTable board) throws Throwable {
        this.board = new ArrayList<List<String>>();
        for (List<String> row : board.raw()) {
            this.board.add(new ArrayList<String>(row));
        }
    }

    @When("^player X plays in row (\\d+), column (\\d+)$")
    public void playerXPlaysInRowColumn(int row, int column) throws Throwable {
        this.board.get(row).set(column, "X");
    }

    @Then("^the board should look like this:$")
    public void theBoardShouldLookLikeThis(DataTable expectedBoard)
            throws Throwable {
        expectedBoard.diff(board);
    }
}

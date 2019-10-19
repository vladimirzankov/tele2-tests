package ru.zankov.step;

import io.cucumber.java.en.When;
import ru.zankov.page.ResultsPage;

public class ResultsPageStepdefs {

    ResultsPage resultsPage = new ResultsPage();

    @When("I select tariff {string}")
    public void iSelectTariff(String name) {
        resultsPage.selectTariff(name);
    }
}

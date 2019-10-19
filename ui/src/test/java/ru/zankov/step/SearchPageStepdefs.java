package ru.zankov.step;

import io.cucumber.java.en.And;
import ru.zankov.page.SearchPage;

public class SearchPageStepdefs {

    SearchPage searchPage = new SearchPage();

    @And("I search {string}")
    public void iSearch(String value) {
        searchPage.searchBy(value);
    }
}

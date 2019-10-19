package ru.zankov.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchPage {

    public SelenideElement searchInput = $x("");

    public void searchBy(String query) {
        $x("//input[@id='search-text']").val(query);
    }
}

package ru.zankov.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    SelenideElement searchButton = $x("//a[contains(concat(' ', @class, ' '), ' search ')]");

    public void search() {
        searchButton.click();
    }
}

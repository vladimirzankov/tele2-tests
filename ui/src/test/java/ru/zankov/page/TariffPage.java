package ru.zankov.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TariffPage {

    public SelenideElement price = $x("//span[contains(concat(' ', @class, ' '), ' price ')]");
}

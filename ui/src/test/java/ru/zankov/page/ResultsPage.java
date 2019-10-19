package ru.zankov.page;

import static com.codeborne.selenide.Selenide.$x;

public class ResultsPage {

    public void selectTariff(String name) {
        $x("//div[contains(concat(' ', @class, ' '), ' recently-tariffs ')]/div[.//span[text()='Тариф «" + name + "»']]").click();
    }
}



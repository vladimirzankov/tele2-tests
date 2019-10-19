package ru.zankov.step;

import io.cucumber.java.en.And;
import ru.zankov.page.*;

import static com.codeborne.selenide.Condition.text;

public class TariffPageStepdefs {

    private TariffPage tariffPage = new TariffPage();

    @And("tariff price is {int}")
    public void tariffPriceIs(int price) {
        tariffPage.price.shouldHave(text(String.valueOf(price)));
    }
}

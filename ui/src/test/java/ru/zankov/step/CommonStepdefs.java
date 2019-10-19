package ru.zankov.step;

import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;

public class CommonStepdefs {

    @Then("url is {string}")
    public void iUrlIs(String url) {
        assertEquals(baseUrl + url, url());
    }

}

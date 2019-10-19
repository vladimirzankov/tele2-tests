package ru.zankov;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import static com.codeborne.selenide.Configuration.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber/html", "json:target/cucumber/json/cucumber.json", "pretty"},
        monochrome = true,
        features = "src/test/resources/features/SearchTest.feature"
)
public class TestRunner {

    @BeforeClass
    public static void beforeClass() {
        baseUrl = "https://msk.tele2.ru";
    }
}
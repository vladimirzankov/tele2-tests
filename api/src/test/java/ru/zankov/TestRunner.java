package ru.zankov;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber/html", "json:target/cucumber/json/cucumber.json", "pretty"},
        monochrome = true,
        features = "src/test/resources/features/RegionTest.feature"
)
public class TestRunner {

    @BeforeClass
    public static void beforeClass() {
        baseURI = "https://msk.tele2.ru";
        enableLoggingOfRequestAndResponseIfValidationFails();

    }
}
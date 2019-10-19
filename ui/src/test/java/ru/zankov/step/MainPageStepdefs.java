package ru.zankov.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import ru.zankov.page.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static ru.zankov.Url.*;

public class MainPageStepdefs {

    private MainPage mainPage = new MainPage();

    @Given("I am on main page")
    public void iAmOnMainPage() {
        open(MAIN_PAGE);
    }

    @And("I open search panel")
    public void iOpenSearchPanel() {
        mainPage.search();
    }
}

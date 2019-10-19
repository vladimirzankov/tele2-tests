package ru.zankov.step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ru.zankov.model.Region;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static java.util.stream.Collectors.toCollection;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.matchesPattern;
import static ru.zankov.EndpointUrl.*;

public class RegionStepdefs {

    private List<Region> regions;

    @When("I get regions")
    public void iGetRegions() {
        regions = given()
                .param("siteId", "siteMSK")
            .when()
                .get(REGIONS)
            .then()
                .statusCode(200)
                .extract()
                .jsonPath()
                .getList("data", Region.class);
    }

    @Then("All region IDs consist of numbers")
    public void allRegionIDsConsistOfNumbers() {
        String pattern = "^\\d+$";
        List<String> regionIDs = regions.stream()
                .map(Region::getRegionId)
                .collect(toCollection(ArrayList::new));
        assertThat(regionIDs, everyItem(matchesPattern(pattern)));
    }

    @And("All region product IDs matches pattern {string}")
    public void allRegionProductIDsMatchesPattern(String pattern) {
        List<String> roamingProductIDs = regions.stream()
                .map(Region::getRoamingProductId)
                .collect(toCollection(ArrayList::new));
        assertThat(roamingProductIDs, everyItem(matchesPattern(pattern)));
    }
}

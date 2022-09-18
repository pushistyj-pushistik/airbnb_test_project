package tests.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Tag("WEB")
public class SearchTests extends TestBase {

    @Test
    @DisplayName("Search and selection of location")
    void searchDestination() {
        step("Location selection and open", () -> {
            explorePage
                    .selectDirection()
                    .selectDate()
                    .selectGuests()
                    .doSearch();
        });
        step("Checking the direction and its map.", () -> {
            explorePage
                    .checkDirection()
                    .checkMap();
        });
    }

    @Test
    @DisplayName("Search for experience")
    void searchExperience() {
        step("Experience selection and open", () -> {
            explorePage
                    .selectExperience()
                    .selectGuests()
                    .doSearch();
        });
        step("Checking that experience are found", () -> {
            explorePage
                    .checkExperiences();
        });
    }
}

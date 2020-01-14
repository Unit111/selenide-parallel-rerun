package com.unit1.tests;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.unit1.pages.SearchPage;
import com.unit1.pages.TitlePage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test2 {

//    Must be static!
    @BeforeAll
    static void setup() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://store.steampowered.com";
        Configuration.startMaximized = true;
        Configuration.headless = false;
    }


    @Test
    @DisplayName("Searching for a title")
    public void test1() {
        open("");
        SearchPage searchPage = new SearchPage();
        TitlePage titlePage = new TitlePage();

        searchPage.getSearchField().sendKeys("Syberia 3");
        searchPage.getSearchField().sendKeys(Keys.RETURN);

        searchPage.getFirstResult().shouldBe(Condition.visible).click();

        final String title = titlePage.getTitleName().shouldBe(Condition.visible).getText();

        assertTrue(title.contains("Syberia"), "Title does not match the expected one");

    }


    @Test
    @DisplayName("Searching for a title")
    public void test2() {
        open("");
        SearchPage searchPage = new SearchPage();
        TitlePage titlePage = new TitlePage();

        searchPage.getSearchField().sendKeys("Syberia 3");
        searchPage.getSearchField().sendKeys(Keys.RETURN);

        searchPage.getFirstResult().shouldBe(Condition.visible).click();

        final String title = titlePage.getTitleName().shouldBe(Condition.visible).getText();

        assertTrue(title.contains("Syberia"), "Title does not match the expected one");

    }
}

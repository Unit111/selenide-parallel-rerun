package com.unit1.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

@Data
public class SearchPage {

    private SelenideElement searchField = $(byId("store_nav_search_term"));
    private SelenideElement searchButton = $(byId("store_search_link"));
    private SelenideElement firstResult = $(".search_result_row", 1);
}

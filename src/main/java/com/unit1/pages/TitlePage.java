package com.unit1.pages;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.$;

@Data
public class TitlePage {

    private SelenideElement titleName = $(".apphub_AppName");
}

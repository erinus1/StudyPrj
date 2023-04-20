package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://www.jetbrains.com/
public class MainPage {
    public SelenideElement seeDeveloperToolsButton = $x("//*[@data-test-marker='Developer Tools']");
    public SelenideElement findYourToolsButton = $x("//*[@data-test='suggestion-action']");
    public SelenideElement toolsMenu = $x("//div[@data-test='main-menu-item' and @data-test-marker = 'Developer Tools']");
    public SelenideElement searchButton = $("[data-test='site-header-search-action']");

    public MainPage openMainPage() {
        open("https://www.jetbrains.com/");
        return this;
    }
    public MainPage findSomeRes(String world){
        searchButton.click();
        $("[data-test='search-input']").sendKeys("Selenium");
        $("button[data-test='full-search-button']").click();
        $("input[data-test='search-input']").shouldHave(attribute("value", "Selenium"));
        return this;
    }
}


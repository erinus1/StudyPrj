package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    //public SelenideElement seeDeveloperToolsButton = $x("//*[@data-test-marker='Developer Tools']");
    //public SelenideElement findYourToolsButton = $x("//*[@data-test='suggestion-action']");
    //public SelenideElement toolsMenu = $x("//div[@data-test='main-menu-item' and @data-test-marker = 'Developer Tools']");
    //public SelenideElement searchButton = $("[data-test='site-header-search-action']");
    private SelenideElement menuButton = $x("//*[@class='sb-globalNav__desktopListItem']/a[contains(text(),'Menu')]");
    private SelenideElement agreeButton = $x("//*[@id='truste-consent-button']");
    private ElementsCollection subMenu = $$x("//li[@class=\"my3\"]/a");
    private ElementsCollection items = $$x("//*[@class=\"block linkOverlay__primary prodTile\"]");

    public MainPage acceptCookie() {
        agreeButton.click();
        return this;
    }

    public MainPage chooseMenu() {
        menuButton.click();
        return this;
    }

    public MainPage chooseSubMenu(String menuName) {
        subMenu.find(exactText(menuName)).click();
        return this;
    }

    public ProductPage chooseProduct(String item) {
        items.find(exactText(item)).click();
        return new ProductPage();
    }

}


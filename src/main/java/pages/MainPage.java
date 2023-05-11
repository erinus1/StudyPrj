package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$x;

public class MainPage {
    private SelenideElement menuButton = $x("//*[@class='sb-globalNav__desktopListItem']/a[contains(text(),'Menu')]");
    private SelenideElement agreeButton = $x("//*[@id='truste-consent-button']");
    private ElementsCollection subMenu = $$x("//li[@class=\"my3\"]/a");
    private ElementsCollection items = $$x("//*[@class=\"block linkOverlay__primary prodTile\"]");

    //private ElementsCollection toBuyButton = $$x();

    public MainPage acceptCookie() {
        agreeButton.shouldBe(visible, Duration.ofSeconds(6)).click();
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

}
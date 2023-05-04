package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private SelenideElement menuButton = $x("//*[@class='sb-globalNav__desktopListItem']/a[contains(text(),'Menu')]");
    private SelenideElement agreeButton = $x("//*[@id='truste-consent-button']");
    private ElementsCollection subMenu = $$x("//li[@class=\"my3\"]/a");
    private ElementsCollection items = $$x("//*[@class=\"block linkOverlay__primary prodTile\"]");
    private ElementsCollection cupSize = $$x("//*[@id=\"content\"]/div[3]/div/div[1]/div[1]/form/fieldset/div");

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

    public ProductPage chooseOption(String size) {
        cupSize.find(exactText(size)).click();
        return new ProductPage();
    }
}
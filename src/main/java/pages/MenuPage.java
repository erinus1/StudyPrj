package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MenuPage {
    private SelenideElement milk = $x("//*[@id='239']");
    private ElementsCollection cupSize = $$x("//*[@id=\"content\"]/div[3]/div/div[1]/div[1]/form/fieldset/div");
    private SelenideElement done = $x("");
    //pop up Select store --- //*[@id="modal-target"]/div/div/div[2]/div/div/div/button[2]


    public MenuPage chooseProduct(String item) {
        items.find(exactText(item)).click();
        return new ProductPage();
    }
}


package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import javax.swing.text.html.parser.Element;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class ProductPage {
    private SelenideElement milk = $x("//*[@id='239']");
    private ElementsCollection cupSize = $$x("//*[@id=\"content\"]/div[3]/div/div[1]/div[1]/form/fieldset/div");
    private SelenideElement done = $x("");
    //pop up Select store --- //*[@id="modal-target"]/div/div/div[2]/div/div/div/button[2]

    public String chooseSize(SizeOption sizeOption) {
        //??? як енам сюди прикрутити
        return null;
    }

    public void chooseFilters() {
        //???collection of elements cant find xpath

    }

    public void clickDone() {

    }

    public void addToOrder() {

    }

    public void checkQuantity() {

        //кількість в корзині, клік на іконку з кількістю напоїв
    }

    public void selectStore() {
     //see enum PopUp --- Please select a store before continuing to the cart. click on pop up

    }
}

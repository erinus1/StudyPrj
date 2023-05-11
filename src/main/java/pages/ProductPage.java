package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductPage {

    public ProductPage chooseSizeOption(SizeOption size) {
        $x("//input[@data-e2e='%s']".formatted(size.value())).click();
        return this;
    }

    public void customization() {
        //вибрати на мілк, дроп даунс,-обрали фільтр, клік дан
        $("[data-e2e='option-Milk']").click();
    $x("//*[@id=\"milk-options-customization-option\"]").selectOption("Nonfat Milk");
   clickDone();
    }

    private void clickDone() {
        //описати клік дан
        $("[data-e2e='doneFrap']").click();
    }

    public void addToOrder() {
$("[data-e2e='add-to-order-button']").click();
    }

    public void checkQuantity() {
        String text = $("[data-e2e=\"cart-order-count\"]").getText();
        assertThat(text).isEqualTo("1");
        //кількість в корзині, клік на іконку з кількістю напоїв
    }

    public StorePage selectStore() {
        //see enum PopUp --- Please select a store before continuing to the cart. click on pop up
$("[data-e2e='select-store-from-crust']").click();
return new StorePage();
    }
}

}

package pages;

import static com.codeborne.selenide.Selenide.$x;

public interface OrderPage {

    default OrderPage clickToBuy(){
        $x("//*[@class=\"flex flex-column items-end\"]//button[@class=\"sb-frap sb-frap--centerSVG\"]").click();
        //*[@class="relative flex justify-center cursor-pointer"] (відкрити кільксть)
        // //*[@id="modal-target"]/div/div/div[2]/div/div/div/button[2] ( select store поп ап баттон)

        return new OrderPage();
        //?? клікаєм на кнопку, що з ретюрном?
    }
}

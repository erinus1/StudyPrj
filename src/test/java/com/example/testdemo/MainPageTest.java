package com.example.testdemo;

import pages.MainPage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest extends BaseTest {
    @BeforeClass
    public void setUp() {
        start().acceptCookie();
    }

    @Test
    public void clickOnMenuTab() {
        start().chooseMenu();
    }
    @Test
    public void ChooseAndBuy() {
        start().chooseMenu().chooseSubMenu("Hot Teas").chooseProduct("Chai Tea Latte");
    }


}
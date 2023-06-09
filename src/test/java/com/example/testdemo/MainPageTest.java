package com.example.testdemo;

import pages.MainPage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import pages.SizeOption;

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
    public void сhooseADrink() {
        start().chooseMenu().chooseSubMenu("Hot Teas").chooseProduct("Chai Tea Latte");
    }
    @Test
    public void setDrinkOption() {
        start().chooseMenu().chooseSubMenu("Hot Teas").chooseProduct("Chai Tea Latte").
        //select size (from Enam class), select FIlters - milk collection cant find, click on the button
    }

    @Test
    public void placeOrder() {
        //

    }
}
package com.example.testdemo;

import pages.MainPage;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest extends BaseTest {
    MainPage mainPage = new MainPage();

    @BeforeMethod
    public void setUp() {
        mainPage.openMainPage();
    }

    @Test
    public void search() {
        mainPage.searchButton.click();
        mainPage.findSomeRes("coffee");
    }
}
package com.example.testdemo;

import com.codeborne.selenide.Selenide;
import infra.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pages.MainPage;

public class BaseTest {
    @BeforeClass
    public static void setUpAll() {
        new WebDriver().init();
    }

    public static MainPage start () {
        Selenide.open("https://www.starbucks.com/");
        return new MainPage();
    }
    @AfterTest
    public void clean () {
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
    }
}
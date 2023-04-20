package com.example.testdemo;

import infra.WebDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    @BeforeClass
    public static void setUpAll() {
        new WebDriver().init();
    }
}
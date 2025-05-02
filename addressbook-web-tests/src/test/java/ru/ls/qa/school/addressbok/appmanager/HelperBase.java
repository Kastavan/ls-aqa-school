package ru.ls.qa.school.addressbok.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HelperBase {
    protected void click(String locator) {
        $(locator).click();
    }
    protected void type(By locator, String text) {
        $(locator).setValue(text);
    }

    protected void selectDropDown(String locator, String position) {
        $(locator).selectOptionByValue(position);
    }
}

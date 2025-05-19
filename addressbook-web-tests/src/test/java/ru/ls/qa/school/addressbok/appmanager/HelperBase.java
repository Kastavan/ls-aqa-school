package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HelperBase {
    protected void click(SelenideElement element) {
        element.click();
    }
    protected void type(SelenideElement element, String text) {
        element.setValue(text);
    }

    protected void selectDropDown(SelenideElement element, String position) {
        element.selectOptionByValue(position);
    }
}

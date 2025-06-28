package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NavigationHelper extends HelperBase {
    private SelenideElement goToGroupPageButton = $x("//a[text()='groups']");
    private SelenideElement returnToGroupsPageFromCreationButton = $x("//a[text()='group page']");

    public void gotoGroupPage() {
        click(goToGroupPageButton);
    }

    public void returnToGroupsPageFromCreation() {
        click(returnToGroupsPageFromCreationButton);
    }
}
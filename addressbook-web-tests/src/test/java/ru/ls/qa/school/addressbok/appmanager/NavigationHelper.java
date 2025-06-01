package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class NavigationHelper extends HelperBase {
    SelenideElement gotoGroupPageButton = $(".admin > a");
    SelenideElement returnToGroupsPageFromCreationButton = $("i > a");

    public void gotoGroupPage() {
        click(gotoGroupPageButton);
    }

    public void returnToGroupsPageFromCreation() {
        click(returnToGroupsPageFromCreationButton);
    }
}
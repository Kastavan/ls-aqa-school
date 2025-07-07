package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class NavigationHelper extends HelperBase {
    private SelenideElement goToGroupPageButton = $x("//a[text()='groups']");
    private SelenideElement returnToGroupsPageFromCreationButton = $x("//a[text()='group page']");
    private SelenideElement goToContactPageButton = $x("//a[text()='home']");

    public void goToGroupPage() {
        if(isElementPresent(By.tagName("h1"))
                && $(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))){
            return;
        }
        click(goToGroupPageButton);
    }

    public void returnToGroupsPageFromCreation() {
        click(returnToGroupsPageFromCreationButton);
    }

    public void goToContactPage(){
        if(isElementPresent(By.id("maintable"))){
            return;
        }
        click(goToContactPageButton);
    }
}
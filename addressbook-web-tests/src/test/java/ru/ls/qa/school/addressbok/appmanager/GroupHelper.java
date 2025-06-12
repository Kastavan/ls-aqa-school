package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.ls.qa.school.addressbok.model.GroupData;

import static com.codeborne.selenide.Selenide.$;

public class GroupHelper extends HelperBase {
    SelenideElement submitGroupCreationButton = $("input:nth-child(11)");
    SelenideElement setGroupName = $(By.name("group_name"));
    SelenideElement setGroupHeader = $(By.name("group_header"));
    SelenideElement setGroupFooter = $(By.name("group_footer"));
    SelenideElement initGroupCreationButton = $("form:nth-child(2) > input:nth-child(1)");
    SelenideElement deleteGroupButton = $("input[type=submit]:nth-child(2)");
    SelenideElement firstGroupSelectionCheckBox = $("span:nth-child(5) > input[type=checkbox]");
    SelenideElement initGroupModificationButton = $("input[type=submit]:nth-child(3)");
    SelenideElement submitGroupModificationButton = $("input[type=submit]:nth-child(12)");


    public void submitGroupCreation() {
        click(submitGroupCreationButton);
    }

    public void fillGroupForm(GroupData groupData) {
        type(setGroupName, groupData.name());
        type(setGroupHeader, groupData.header());
        type(setGroupFooter, groupData.footer());
    }

    public void initGroupCreation() {
        click(initGroupCreationButton);
    }

    public void deleteGroup() {
        click(deleteGroupButton);
    }

    public void selectFirstGroup() {
        click(firstGroupSelectionCheckBox);
    }

    public void initGroupModification() {
        click(initGroupModificationButton);
    }

    public void submitGroupModification() {
        click(submitGroupModificationButton);
    }
}

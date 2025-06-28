package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.ls.qa.school.addressbok.model.GroupData;

import static com.codeborne.selenide.Selenide.$;

public class GroupHelper extends HelperBase {
    private SelenideElement submitGroupCreationButton = $("input[name='submit']");
    private SelenideElement setGroupName = $(By.name("group_name"));
    private SelenideElement setGroupHeader = $(By.name("group_header"));
    private SelenideElement setGroupFooter = $(By.name("group_footer"));
    private SelenideElement initGroupCreationButton = $("input[name='new']");
    private SelenideElement deleteGroupButton = $("input[name='delete']");
    private SelenideElement firstGroupSelectionCheckBox = $("input[type=checkbox]");
    private SelenideElement initGroupModificationButton = $("input[name='edit']");
    private SelenideElement submitGroupModificationButton = $("input[name='update']");


    public void clickSubmitGroupCreationBtn() {
        click(submitGroupCreationButton);
    }

    public void fillGroupForm(GroupData groupData) {
        type(setGroupName, groupData.name());
        type(setGroupHeader, groupData.header());
        type(setGroupFooter, groupData.footer());
    }

    public void clickCreateGroupBtn() {
        click(initGroupCreationButton);
    }

    public void clickDeleteGroupBtn() {
        click(deleteGroupButton);
    }

    public void selectFirstGroup() {
        click(firstGroupSelectionCheckBox);
    }

    public void clickModificationGroupBtn() {
        click(initGroupModificationButton);
    }

    public void clickSubmitGroupModificationBtn() {
        click(submitGroupModificationButton);
    }
}

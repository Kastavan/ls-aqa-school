package ru.ls.qa.school.addressbok.appmanager;

import org.openqa.selenium.By;
import ru.ls.qa.school.addressbok.model.GroupData;

public class GroupHelper extends HelperBase {
    public void returnToGroupsPage() {
        click("i > a");
    }

    public void submitGroupCreation() {
        click("input:nth-child(11)");
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.name());
        type(By.name("group_header"), groupData.header());
        type(By.name("group_footer"), groupData.footer());
    }

    public void initGroupCreation() {
        click("form:nth-child(2) > input:nth-child(1)");
    }

    public void deleteGroup() {
        click("input[type=submit]:nth-child(2)");
    }

    public void selectGroup() {
        click("span:nth-child(5) > input[type=checkbox]");
    }

    public void initGroupModification() {
        click("input[type=submit]:nth-child(3)");
    }

    public void submitGroupModification() {
        click("input[type=submit]:nth-child(12)");
    }
}

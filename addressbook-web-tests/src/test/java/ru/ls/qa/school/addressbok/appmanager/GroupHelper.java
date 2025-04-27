package ru.ls.qa.school.addressbok.appmanager;

import org.openqa.selenium.By;
import ru.ls.qa.school.addressbok.model.GroupData;

public class GroupHelper extends HelperBase {
    public static void returnToGroupPage() {
        click("#content > div > i > a");
    }

    public static void submitGroupCreation() {
        click("#content > form > input[type=submit]:nth-child(11)");
    }

    public static void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.name());
        type(By.name("group_header"), groupData.header());
        type(By.name("group_footer"), groupData.footer());
    }

    public static void initGroupCreation() {
        click("#content > form > input[type=submit]:nth-child(1)");
    }

    public static void deleteGroup() {
        click("#content > form > input[type=submit]:nth-child(2)");
    }

    public static void selectGroup() {
        click("#content > form > span:nth-child(5) > input[type=checkbox]");
    }

    public static void initGroupModification() {
        click("#content > form > input[type=submit]:nth-child(3)");
    }

    public static void submitGroupModification() {
        click("#content > form > input[type=submit]:nth-child(12)");
    }
}

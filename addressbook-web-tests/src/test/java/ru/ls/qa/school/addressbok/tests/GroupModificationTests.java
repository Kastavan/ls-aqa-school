package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.appmanager.GroupHelper;
import ru.ls.qa.school.addressbok.appmanager.NavigationHelper;
import ru.ls.qa.school.addressbok.model.GroupData;

public class GroupModificationTests extends TestBase{

    @Test
    public void testGroupModification(){
        NavigationHelper.gotoGroupPage();
        GroupHelper.selectGroup();
        GroupHelper.initGroupModification();
        GroupHelper.fillGroupForm(new GroupData("test1", "test2", "test3"));
        GroupHelper.submitGroupModification();
        GroupHelper.returnToGroupPage();
    }
}

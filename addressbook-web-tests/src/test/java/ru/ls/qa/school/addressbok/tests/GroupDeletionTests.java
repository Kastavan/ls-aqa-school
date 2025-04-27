package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.appmanager.GroupHelper;
import ru.ls.qa.school.addressbok.appmanager.NavigationHelper;

public class GroupDeletionTests extends TestBase{

    @Test
    public void testGroupDeletion() {
        NavigationHelper.gotoGroupPage();
        GroupHelper.selectGroup();
        GroupHelper.deleteGroup();
        GroupHelper.returnToGroupPage();
    }

}

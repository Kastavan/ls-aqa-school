package ru.ls.qa.school.addressbok;

import org.junit.jupiter.api.Test;

public class GroupDeletionTests extends TestBase{

    @Test
    public void testGroupDeletion() {
        gotoGroupPage();
        selectGroup();
        deleteGroup();
        returnToGroupPage();
    }

}

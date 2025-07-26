package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.model.GroupData;
import ru.ls.qa.school.addressbok.pages.GroupsListPage;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupModificationTests extends TestBase {
    private GroupsListPage groupsPage;


    @BeforeEach
    public void precondition() {
        app.getNavigationHelper().goToGroupPage();
        groupsPage = getPage.getGroupsListPage();
        if (! app.getGroupHelper().isGroupExist()){
            groupsPage.initGroupCreation().createGroup();
        }
    }

    @Test
    public void testGroupModification() {
        List<GroupData> before = app.getGroupHelper().getGroupsList();
        GroupData group = new GroupData(before.get(before.size()-1).getId(),"test1", "test2", "test3");
        groupsPage.selectGroupByIndex(before.size()-1)
                .initGroupModification()
                .editForm(group)
                .submitGroupModification()
                .returnToGroups();
        List<GroupData> after = app.getGroupHelper().getGroupsList();
        assertThat(after.size()).isEqualTo(before.size());

        before.remove(before.size()-1);
        before.add(group);
        Comparator<? super GroupData> byID = Comparator.comparingInt(GroupData::getId);
        before.sort(byID);
        after.sort(byID);
        assertThat(before).isEqualTo(after);
    }
}

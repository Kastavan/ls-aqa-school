package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.model.GroupData;
import ru.ls.qa.school.addressbok.pages.GroupsListPage;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GroupDeletionTests extends TestBase {

    private static GroupsListPage groupsPage;

    @BeforeEach
    public void precondition(){
        app.getNavigationHelper().goToGroupPage();
        groupsPage = getPage.getGroupsListPage();
        if (! app.getGroupHelper().isGroupExist()){
            groupsPage.initGroupCreation().createGroup();
        }
        // Здесь далее появится проверка наличия группы и ее создания, если ее нет.
        // Это нас переместит по ряду страниц. ВАЖНО чтобы мы на момент начала теста оказались на нужной странице
        // Поэтому мы сохраняем результат в переменную page чтобы продолжить работу в тесте с последней страницы
    }

    @Test
    public void testGroupDeletion() {
        List<GroupData> before = app.getGroupHelper().getGroupsList();
        groupsPage
        .selectGroupByIndex(0)
        .initDeleteGroup()
        .returnToGroups();
        List<GroupData> after = app.getGroupHelper().getGroupsList();
        assertThat(after.size()).isEqualTo(before.size() - 1);
    }

}

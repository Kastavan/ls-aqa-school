package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbok.pages.GroupsListPage;

public class GroupDeletionTests extends TestBase {

    private static GroupsListPage page;

    @BeforeEach
    public void precondition(){
        page = getPage.getContactsPage().gotoGroups();
        // Здесь далее появится проверка наличия группы и ее создания, если ее нет.
        // Это нас переместит по ряду страниц. ВАЖНО чтобы мы на момент начала теста оказались на нужной странице
        // Поэтому мы сохраняем результат в переменную page чтобы продолжить работу в тесте с последней страницы
    }

    @Test
    public void testGroupDeletion() {
        page
        .selectFirstGroup()
        .initDeleteGroup()
        .returnToGroups();
    }

}

package ru.ls.qa.school.addressbok.pages;

import static ru.ls.qa.school.addressbok.tests.TestBase.app;

public class PageManager {
    private GroupPage groupPage = new GroupPage(app);
    private ContactsPage contactsPage = new ContactsPage(app);
    private GroupsListPage groupsListPage = new GroupsListPage(app);
    private ContactPage contactPage = new ContactPage(app);

    public GroupPage getGroupPage() {
        return groupPage;
    }

    public ContactsPage getContactsPage() {
        return contactsPage;
    }

    public GroupsListPage getGroupsListPage() {
        return groupsListPage;
    }

    public ContactPage getContactPage() {
        return contactPage;
    }
}

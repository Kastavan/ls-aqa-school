package ru.ls.qa.school.addressbok.pages;

import ru.ls.qa.school.addressbok.appmanager.ApplicationManager;

public class PageManager {

    protected static ApplicationManager app;

    private final GroupPage groupPage;
    private final ContactsListPage contactsPage;
    private final GroupsListPage groupsListPage;
    private final ContactPage contactPage;

    public PageManager(ApplicationManager app){
        this.app = app;

        groupPage = new GroupPage();
        contactsPage = new ContactsListPage();
        groupsListPage = new GroupsListPage();
        contactPage = new ContactPage();
    }

    public GroupPage getGroupPage() {
        return groupPage;
    }

    public ContactsListPage contacts() {
        return contactsPage;
    }

    public GroupsListPage getGroupsListPage() {
        return groupsListPage;
    }

    public ContactPage getContactPage() {
        return contactPage;
    }
}

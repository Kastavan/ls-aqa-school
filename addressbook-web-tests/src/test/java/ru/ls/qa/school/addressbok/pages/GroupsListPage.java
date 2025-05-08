package ru.ls.qa.school.addressbok.pages;

import ru.ls.qa.school.addressbok.appmanager.ApplicationManager;

public class GroupsListPage extends BasePage {
    public GroupsListPage(ApplicationManager app) {
        super(app);
    }
    public GroupsListPage initGroupCreation() {
        app.getGroupHelper().initGroupCreation();
        return this;
    }
    public GroupsListPage selectGroup(){
        app.getGroupHelper().selectGroup();
        return this;
    }
    public GroupsListPage deleteGroup(){
        app.getGroupHelper().deleteGroup();
        return this;
    }
    public GroupsListPage initGroupModification(){
        app.getGroupHelper().initGroupModification();
        return this;
    }

}

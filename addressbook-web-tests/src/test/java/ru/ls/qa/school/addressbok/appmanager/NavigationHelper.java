package ru.ls.qa.school.addressbok.appmanager;

public class NavigationHelper extends HelperBase{
    public static void gotoGroupPage() {
        click("#nav > ul > li.admin > a");
    }
}

package ru.ls.qa.school.addressbok.pages;

public class ContactsListPage extends BasePage{

    public ContactPage addNewContact(){
        app.getContactHelper().clickCreateContactBtn();
        return new ContactPage();
    }
    public ContactPage editContact(){
        app.getContactHelper().clickEditContactBtn();
        return new ContactPage();
    }
}
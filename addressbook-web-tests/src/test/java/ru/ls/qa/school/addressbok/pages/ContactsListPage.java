package ru.ls.qa.school.addressbok.pages;

public class ContactsListPage extends BasePage{

    public ContactPage addNewContact(){
        app.getContactHelper().clickCreateContactBtn();
        return new ContactPage();
    }
    public ContactPage editContact(int index){
        app.getContactHelper().clickEditContactBtnByIndex(index);
        return new ContactPage();
    }
    public ContactsListPage selectContactByIndex(int index) {
        app.getContactHelper()
                .selectContactByIndex(index);
        return this;
    }
    public ContactsListPage initDeleteContact() {
        app.getContactHelper()
                .clickDeleteContactBtn();
        return this;
    }
}
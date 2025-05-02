package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.Test;

public class ContactCreationTests extends TestBase {
    @Test
    public void newTest() {

        app.getContactHelper().addNewContactPage();
        app.getContactHelper().fillContactForm("Имя", "Отчество", "Фамилия", "Прозвище", "Заголовок", "Компания", "Адрес", "+7 (999) 999-99-99", "+7 (888) 888-88-88", "+7 (777) 777-77-77", "+7 (666) 666-66-66", "email1@mail.ru", "email2@mail.ru", "email3@mail.ru", "homepage.ru", "1995", "2025", "Адрес2", "Дом", "Примечание");
        app.getContactHelper().submitNewContact();
    }

}


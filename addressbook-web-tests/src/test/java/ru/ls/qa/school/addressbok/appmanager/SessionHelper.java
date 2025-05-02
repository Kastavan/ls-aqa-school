package ru.ls.qa.school.addressbok.appmanager;

import org.openqa.selenium.By;

public class SessionHelper extends HelperBase {
    public void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click("input:nth-child(7)");
    }

    public void logout() {
        click(".header > a");
    }
}

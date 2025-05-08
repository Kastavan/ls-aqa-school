package ru.ls.qa.school.addressbok.appmanager;

import org.openqa.selenium.By;
import ru.ls.qa.school.addressbok.model.LoginData;

public class SessionHelper extends HelperBase {
    public void login(LoginData loginData) {
        type(By.name("user"), loginData.username());
        type(By.name("pass"), loginData.password());
        click("input:nth-child(7)");
    }

    public void logout() {
        click(".header > a");
    }
}

package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;
import ru.ls.qa.school.addressbok.model.LoginData;

import static com.codeborne.selenide.Selenide.$;

public class SessionHelper extends HelperBase {
    SelenideElement setUser = $("input:nth-child(2)");
    SelenideElement setPassword = $("input:nth-child(5)");
    SelenideElement loginButton = $("input:nth-child(7)");
    SelenideElement logoutButton = $(".header > a");

    public void login(LoginData loginData) {
        type(setUser, loginData.username());
        type(setPassword, loginData.password());
        click(loginButton);
    }

    public void logout() {
        click(logoutButton);
    }
}

package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;
import ru.ls.qa.school.addressbok.model.LoginData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class SessionHelper extends HelperBase {
    private SelenideElement setUser = $("input[name='user']");
    private SelenideElement setPassword = $("input[name='pass']");
    private SelenideElement loginButton = $("input[value='Login']");
    private SelenideElement logoutButton = $x("//a[contains(text(),'Logout')]");

    public void login(LoginData loginData) {
        type(setUser, loginData.username());
        type(setPassword, loginData.password());
        click(loginButton);
    }

    public void logout() {
        click(logoutButton);
    }
}

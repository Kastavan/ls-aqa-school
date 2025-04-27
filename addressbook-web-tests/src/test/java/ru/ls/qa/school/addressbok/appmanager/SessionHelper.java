package ru.ls.qa.school.addressbok.appmanager;

import org.openqa.selenium.By;

public class SessionHelper extends HelperBase{
    public static void login(String username, String password) {
        type(By.name("user"), username);
        type(By.name("pass"), password);
        click("#LoginForm > input[type=submit]:nth-child(7)");
    }

    public static void logout() {
        click("#top > form > a");
    }
}

package ru.ls.qa.school.addressbok;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TestBase {
    @BeforeAll
    static void openPage() {
        Selenide.open("http://localhost/addressbook");
        TestBase.login("admin", "secret");
    }

    private static void login(String username, String password) {
        $(By.name("user")).setValue(username);
        $(By.name("pass")).setValue(password);
        $("#LoginForm > input[type=submit]:nth-child(7)").click();
    }

    @AfterAll
    static void closeWindow() {
        TestBase.logout();
        Selenide.closeWebDriver();
    }

    private static void logout() {
        $("#top > form > a").click();
    }

    protected static void returnToGroupPage() {
        $("#content > div > i > a").click();
    }

    protected static void submitGroupCreation() {
        $("#content > form > input[type=submit]:nth-child(11)").click();
    }

    protected static void fillGroupForm(GroupData groupData) {
        $(By.name("group_name")).setValue(groupData.name());
        $(By.name("group_header")).setValue(groupData.header());
        $(By.name("group_footer")).setValue(groupData.footer());
    }

    protected static void initGroupCreation() {
        $("#content > form > input[type=submit]:nth-child(1)").click();
    }

    protected static void gotoGroupPage() {
        $("#nav > ul > li.admin > a").click();
    }

    protected static void submitNewContact() {
        $("#content > form > input[type=submit]:nth-child(87)").click();
    }

    protected static void fillContactForm(String firstName, String middleName, String lastName, String nickname, String title, String company, String address, String homePhone, String mobilePhone, String workPhone, String fax, String firstEmail, String secondEmail, String thirdEmail, String homepage, String birthDate, String annyDate, String secondaryAddress, String secondaryHome, String secondaryNote) {
        $("#content > form > input[type=text]:nth-child(6)").sendKeys(firstName);
        $("#content > form > input[type=text]:nth-child(9)").sendKeys(middleName);
        $("#content > form > input[type=text]:nth-child(13)").sendKeys(lastName);
        $("#content > form > input[type=text]:nth-child(16)").sendKeys(nickname);
        $("#content > form > input[type=text]:nth-child(22)").sendKeys(title);
        $("#content > form > input[type=text]:nth-child(25)").sendKeys(company);
        $("#content > form > textarea:nth-child(28)").sendKeys(address);
        $("#content > form > input[type=text]:nth-child(34)").sendKeys(homePhone);
        $("#content > form > input[type=text]:nth-child(37)").sendKeys(mobilePhone);
        $("#content > form > input[type=text]:nth-child(40)").sendKeys(workPhone);
        $("#content > form > input[type=text]:nth-child(43)").sendKeys(fax);
        $("#content > form > input[type=text]:nth-child(49)").sendKeys(firstEmail);
        $("#content > form > input[type=text]:nth-child(52)").sendKeys(secondEmail);
        $("#content > form > input[type=text]:nth-child(55)").sendKeys(thirdEmail);
        $("#content > form > input[type=text]:nth-child(58)").sendKeys(homepage);
        $("#content > form > select:nth-child(61)").selectOptionByValue("5"); //ask at Q&A
        $("#content > form > select:nth-child(62)").selectOptionByValue("May");
        $("#content > form > input:nth-child(63)").sendKeys(birthDate);
        $("#content > form > select:nth-child(66)").selectOptionByValue("5");
        $("#content > form > select:nth-child(67)").selectOptionByValue("May");
        $("#content > form > input:nth-child(68)").sendKeys(annyDate);
        $("#content > form > select:nth-child(71)").selectOptionByValue("5");
        $("#content > form > textarea:nth-child(78)").sendKeys(secondaryAddress);
        $("#content > form > input[type=text]:nth-child(81)").sendKeys(secondaryHome);
        $("#content > form > textarea:nth-child(84)").sendKeys(secondaryNote);
    }

    protected static void addNewContactPage() {
        $("#nav > ul > li:nth-child(2) > a").click();
    }

    protected static void deleteGroup() {
        $("#content > form > input[type=submit]:nth-child(2)").click();
    }

    protected static void selectGroup() {
        $("#content > form > span:nth-child(5) > input[type=checkbox]").click();
    }
}

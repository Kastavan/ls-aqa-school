package ru.ls.qa.school.addressbok.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ContactHelper extends HelperBase {
    public static void submitNewContact() {
        $("#content > form > input[type=submit]:nth-child(87)").click();
    }

    public static void fillContactForm(String firstName, String middleName, String lastName, String nickname, String title, String company, String address, String homePhone, String mobilePhone, String workPhone, String fax, String firstEmail, String secondEmail, String thirdEmail, String homepage, String birthDate, String annyDate, String secondaryAddress, String secondaryHome, String secondaryNote) {
        type(By.cssSelector("#content > form > input[type=text]:nth-child(6)"), firstName);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(9)"), middleName);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(13)"), lastName);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(16)"), nickname);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(22)"), title);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(25)"), company);
        type(By.cssSelector("#content > form > textarea:nth-child(28)"), address);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(34)"), homePhone);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(37)"), mobilePhone);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(40)"), workPhone);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(43)"), fax);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(49)"), firstEmail);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(52)"), secondEmail);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(55)"), thirdEmail);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(58)"), homepage);
        selectDropDown("#content > form > select:nth-child(61)", "5"); //ask at Q&A
        selectDropDown("#content > form > select:nth-child(62)", "May");
        type(By.cssSelector("#content > form > input[type=text]:nth-child(63)"), birthDate);
        selectDropDown("#content > form > select:nth-child(66)", "5");
        selectDropDown("#content > form > select:nth-child(67)", "May");
        type(By.cssSelector("#content > form > input[type=text]:nth-child(68)"), annyDate);
        selectDropDown("#content > form > select:nth-child(71)", "9");
        type(By.cssSelector("#content > form > textarea:nth-child(78)"), secondaryAddress);
        type(By.cssSelector("#content > form > input[type=text]:nth-child(81)"), secondaryHome);
        type(By.cssSelector("#content > form > textarea:nth-child(84)"), secondaryNote);
    }

    public static void addNewContactPage() {
        click("#nav > ul > li:nth-child(2) > a");
    }
}

package ru.ls.qa.school.addressbok.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ContactHelper extends HelperBase {

    public void submitNewContact() {
        $("input:nth-child(87)").click();
    }

    public void fillContactForm(String firstName, String middleName, String lastName, String nickname, String title, String company, String address, String homePhone, String mobilePhone, String workPhone, String fax, String firstEmail, String secondEmail, String thirdEmail, String homepage, String birthDate, String annyDate, String secondaryAddress, String secondaryHome, String secondaryNote) {
        type(By.cssSelector("input:nth-child(6)"), firstName);
        type(By.cssSelector("input:nth-child(9)"), middleName);
        type(By.cssSelector("input:nth-child(13)"), lastName);
        type(By.cssSelector("input:nth-child(22)"), title);
        type(By.cssSelector("input:nth-child(25)"), company);
        type(By.cssSelector("textarea:nth-child(28)"), address);
        type(By.cssSelector("input:nth-child(34)"), homePhone);
        type(By.cssSelector("input:nth-child(49)"), firstEmail);
        selectDropDown("select:nth-child(61)", "5"); //ask at Q&A
        selectDropDown("select:nth-child(62)", "May");
        type(By.cssSelector("input:nth-child(63)"), birthDate);
        selectDropDown("select:nth-child(71)", "9");
        type(By.cssSelector("textarea:nth-child(78)"), secondaryAddress);
        type(By.cssSelector("input:nth-child(81)"), secondaryHome);
        type(By.cssSelector("textarea:nth-child(84)"), secondaryNote);
    }

    public void addNewContactPage() {
        click("li:nth-child(2) > a");
    }

}

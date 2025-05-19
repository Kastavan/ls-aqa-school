package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.ls.qa.school.addressbok.model.ContactData;

import static com.codeborne.selenide.Selenide.$;

public class ContactHelper extends HelperBase {

    SelenideElement submitContactButton = $("input:nth-child(87)");
    SelenideElement firstNameField = $("input:nth-child(6)");

    public void submitNewContact() {
        click(submitContactButton);
    }

    public void fillContactForm(ContactData contactData) {
        type(firstNameField, contactData.firstName());
        type(By.cssSelector("textarea:nth-child(28)"), contactData.address()); //TODO like firstNameField Start...
        type(By.cssSelector("input:nth-child(34)"), contactData.homePhone());
        type(By.cssSelector("input:nth-child(49)"), contactData.firstEmail());
        selectDropDown("select:nth-child(61)", "5"); //ask at Q&A
        selectDropDown("select:nth-child(62)", "May");
        type(By.cssSelector("input:nth-child(63)"), contactData.birthDate());
        selectDropDown("select:nth-child(71)", "11"); //TODO .. End
    }

    public void initCreationContact() {
        click("li:nth-child(2) > a"); //TODO
    }

}

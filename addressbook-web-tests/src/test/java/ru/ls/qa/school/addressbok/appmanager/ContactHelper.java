package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;
import ru.ls.qa.school.addressbok.model.ContactData;

import static com.codeborne.selenide.Selenide.$;

public class ContactHelper extends HelperBase {

    SelenideElement submitContactButton = $("input:nth-child(87)");
    SelenideElement firstNameField = $("input:nth-child(6)");
    SelenideElement addressField = $("textarea:nth-child(28)");
    SelenideElement homePhoneField = $("input:nth-child(34)");
    SelenideElement firstEmailField = $("input:nth-child(49)");
    SelenideElement birthDateDay = $("select:nth-child(61)");
    SelenideElement birthDateMonth = $("select:nth-child(62)");
    SelenideElement birthDateYear = $("input:nth-child(63)");
    SelenideElement groupChooser = $("select:nth-child(71)");
    SelenideElement initCreationContactButton = $("li:nth-child(2) > a");

    public void submitNewContact() {
        click(submitContactButton);
    }

    public void fillContactForm(ContactData contactData) {
        type(firstNameField, contactData.firstName());
        type(addressField, contactData.address());
        type(homePhoneField, contactData.homePhone());
        type(firstEmailField, contactData.firstEmail());
        selectDropDown(birthDateDay, "5"); //ask at Q&A
        selectDropDown(birthDateMonth, "May");
        type(birthDateYear, contactData.birthDate());
        selectDropDown(groupChooser, "11");
    }

    public void initCreationContact() {
        click(initCreationContactButton);
    }

}

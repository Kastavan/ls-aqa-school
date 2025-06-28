package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;
import ru.ls.qa.school.addressbok.model.ContactData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ContactHelper extends HelperBase {

    private SelenideElement submitContactButton = $("input[name='submit']");
    private SelenideElement firstNameField = $("input[name='firstname']");
    private SelenideElement homePhoneField = $("input[name='home']");
    private SelenideElement createContactButton = $x("//a[text()='add new']");
    public void clickSubmitContactBtn() {
        click(submitContactButton);
    }

    public void fillContactForm(ContactData contactData) {
        type(firstNameField, contactData.firstName());
        type(homePhoneField, contactData.homePhone());
    }

    public void clickCreateContactBtn() {
        click(createContactButton);
    }

}

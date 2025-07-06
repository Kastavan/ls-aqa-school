package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import ru.ls.qa.school.addressbok.model.ContactData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ContactHelper extends HelperBase {

    private SelenideElement submitContactButton = $("input[name='submit']");
    private SelenideElement firstNameField = $("input[name='firstname']");
    private SelenideElement homePhoneField = $("input[name='home']");
    private SelenideElement createContactButton = $x("//a[text()='add new']");
    private SelenideElement selectGroupDropDown = $("select[name='new_group']");
    private SelenideElement editContactButton = $x("//img[@alt='Edit']");
    private SelenideElement updateContactButton = $("input[name='update']");
    public void clickSubmitContactBtn() {
        click(submitContactButton);
    }
    public void clickUpdateContactBtn() {
        click(updateContactButton);
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(firstNameField, contactData.firstName());
        type(homePhoneField, contactData.homePhone());

        if(creation){
            selectGroupDropDown.selectOption(contactData.group());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void clickCreateContactBtn() {
        click(createContactButton);
    }
    public void clickEditContactBtn() {
        click(editContactButton);
    }

}

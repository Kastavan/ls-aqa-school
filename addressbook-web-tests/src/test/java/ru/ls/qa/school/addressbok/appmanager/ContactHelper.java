package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import ru.ls.qa.school.addressbok.model.ContactData;

import static com.codeborne.selenide.Selenide.*;

public class ContactHelper extends HelperBase {

    private SelenideElement submitContactButton = $("input[name='submit']");
    private SelenideElement firstNameField = $("input[name='firstname']");
    private SelenideElement homePhoneField = $("input[name='home']");
    private SelenideElement createContactButton = $x("//a[text()='add new']");
    private SelenideElement selectGroupDropDown = $("select[name='new_group']");
    private SelenideElement editContactButton = $x("//img[@alt='Edit']");
    private SelenideElement updateContactButton = $("input[name='update']");
    private SelenideElement deleteContactButton = $("input[value='Delete']");
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
    public void clickEditContactBtnByIndex(int index) {
        $$(By.xpath("//img[@alt='Edit']")).get(index).click();
    }
    public void selectContactByIndex(int index) {$$(By.cssSelector("input[type=checkbox]")).get(index).click();
    }
    public boolean isContactExist(){
        return isElementPresent(By.cssSelector("input[type=checkbox]"));
    }
    public void clickDeleteContactBtn() {
        click(deleteContactButton);
    }
    public int getContactsCount(){
        return $$(By.cssSelector("input[type=checkbox]")).size();
    }

}

package ru.ls.qa.school.addressbok.appmanager;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.ls.qa.school.addressbok.model.GroupData;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GroupHelper extends HelperBase {
    private SelenideElement submitGroupCreationButton = $("input[name='submit']");
    private SelenideElement setGroupName = $(By.name("group_name"));
    private SelenideElement setGroupHeader = $(By.name("group_header"));
    private SelenideElement setGroupFooter = $(By.name("group_footer"));
    private SelenideElement initGroupCreationButton = $("input[name='new']");
    private SelenideElement deleteGroupButton = $("input[name='delete']");
    private SelenideElement initGroupModificationButton = $("input[name='edit']");
    private SelenideElement submitGroupModificationButton = $("input[name='update']");


    public void clickSubmitGroupCreationBtn() {
        click(submitGroupCreationButton);
    }

    public void fillGroupForm(GroupData groupData) {
        type(setGroupName, groupData.name());
        type(setGroupHeader, groupData.header());
        type(setGroupFooter, groupData.footer());
    }

    public void clickCreateGroupBtn() {
        click(initGroupCreationButton);
    }

    public void clickDeleteGroupBtn() {
        click(deleteGroupButton);
    }

    public void selectGroupByIndex(int index) {
        $$(By.cssSelector("input[type=checkbox]")).get(index).click();
    }

    public void clickModificationGroupBtn() {
        click(initGroupModificationButton);
    }

    public void clickSubmitGroupModificationBtn() {
        click(submitGroupModificationButton);
    }

    public boolean isGroupExist() {
        return isElementPresent(By.cssSelector("input[type=checkbox]"));
    }
    public List<GroupData> getGroupsList() {
        List<GroupData> groups = new ArrayList<>();
        ElementsCollection elements = $$(By.cssSelector("span.group"));
        for (SelenideElement element : elements) {
            String name = element.getText();
            int id = Integer.parseInt(element.$(By.tagName("Input")).getAttribute("value"));
            GroupData group = new GroupData(id, name, null, null);
            groups.add(group);
        }
        return groups;
    }
}

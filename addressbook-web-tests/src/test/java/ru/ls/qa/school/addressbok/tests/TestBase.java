package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import ru.ls.qa.school.addressbok.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbok.pages.PageManager;

public class TestBase {
    public static final ApplicationManager app = new ApplicationManager();
    public static final PageManager getPage = new PageManager(app);

    @BeforeAll
    static void openPage() {
        app.init();
    }

    @AfterAll
    static void closeWindow() {
        app.stop();
    }

}

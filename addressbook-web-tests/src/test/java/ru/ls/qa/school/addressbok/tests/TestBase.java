package ru.ls.qa.school.addressbok.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import ru.ls.qa.school.addressbok.appmanager.ApplicationManager;

public class TestBase {
    protected static final ApplicationManager app = new ApplicationManager();

    @BeforeAll
    static void openPage() {
        app.init();
    }

    @AfterAll
    static void closeWindow() {
        app.stop();
    }

}

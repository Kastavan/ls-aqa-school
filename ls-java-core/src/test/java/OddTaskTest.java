import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.ls.qa.school.core.OddTask.isOdd;

public class OddTaskTest {

    @Test
    @DisplayName("Четное число")
    public void even(){
        assertFalse(isOdd(0));
        assertFalse(isOdd(2));
        assertFalse(isOdd(4));
        assertFalse(isOdd(6));
        assertFalse(isOdd(28));
    }

    @Test
    @DisplayName("Нечетное число")
    public void odd(){
        assertTrue(isOdd(1));
        assertTrue(isOdd(3));
        assertTrue(isOdd(5));
        assertTrue(isOdd(37));
    }

}

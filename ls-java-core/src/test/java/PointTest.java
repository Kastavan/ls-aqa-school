import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    @DisplayName("Вычисление расстояние между точками")
    public void distance() {
        assertEquals(2.8284271247461903, ((new Point(1,2).distance(3, 4))));
    }
}

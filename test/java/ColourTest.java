import org.example.Colour;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ColourTest {
    @Test
    public void redThreeArgsConstructorZerosTest() {
        Colour col = new Colour(0.0, 0.0, 0.0);
        Assertions.assertEquals(0, col.getRed());
    }

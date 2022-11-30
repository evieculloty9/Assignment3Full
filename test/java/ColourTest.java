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

    @Test
    public void greenThreeArgsConstructorZerosTest() {
        Colour col = new Colour(0.0, 0.0, 0.0);
        Assertions.assertEquals(0, col.getGreen());
    }

    @Test
    public void blueThreeArgsConstructorZerosTest() {
        Colour col = new Colour(0.0, 0.0, 0.0);
        Assertions.assertEquals(0.0, col.getBlue());
    }

    @Test
    public void redThreeArgsConstructorOnesTest() {
        Colour col = new Colour(1.0, 1.0, 1.0);
        Assertions.assertEquals(Colour.MAX_COMP_VALUE, col.getRed());
    }

    @Test
    public void greenThreeArgsConstructorOnesTest() {
        Colour col = new Colour(1.0, 1.0, 1.0);
        Assertions.assertEquals(Colour.MAX_COMP_VALUE, col.getGreen());
    }

    @Test
    public void blueThreeArgsConstructorOnesTest() {
        Colour col = new Colour(1.0, 1.0, 1.0);
        Assertions.assertEquals(Colour.MAX_COMP_VALUE, col.getBlue());
    }

    @Test
    public void redThreeArgsConstructorCommonTest() {
        Random random = new Random(1);
        double r = random.nextDouble();
        double g = random.nextDouble();
        double b = random.nextDouble();
        Colour col = new Colour(r, g, b);
        Assertions.assertTrue(Colour.MAX_COMP_VALUE * r / 2 <= col.getRed());
        Assertions.assertTrue(Colour.MAX_COMP_VALUE * (1.0 + r) / 2 >= col.getRed());  //Asserting that the expression is true
    }
    @Test
    public void greenThreeArgsConstructorCommonTest() {
        Random random = new Random(1);
        double r = random.nextDouble();
        double g = random.nextDouble();
        double b = random.nextDouble();
        Colour col = new Colour(r, g, b);
        Assertions.assertTrue(Colour.MAX_COMP_VALUE * g / 2 <= col.getGreen());
        Assertions.assertTrue(Colour.MAX_COMP_VALUE * (1.0 + g) / 2 >= col.getGreen()); // Asserting that the expression is true
    }








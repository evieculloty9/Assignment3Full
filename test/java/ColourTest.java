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

    @Test
    public void blueThreeArgsConstructorCommonTest() {
        Random random = new Random(1);
        double r = random.nextDouble();
        double g = random.nextDouble();
        double b = random.nextDouble();
        Colour col = new Colour(r, g, b);
        Assertions.assertTrue(Colour.MAX_COMP_VALUE * r / 2 <= col.getRed());
        Assertions.assertTrue(Colour.MAX_COMP_VALUE * (1.0 + r) / 2 >= col.getRed()); // Asserting that the assertion is true
    }

    @Test
    public void redOneArgsConstructorZerosTest() {
        Colour col = new Colour(0);
        Assertions.assertEquals(0, col.getRed());
    }

    @Test
    public void greenOneArgsConstructorZerosTest() {
        Colour col = new Colour(0);
        Assertions.assertEquals(0, col.getGreen());
    }

    @Test
    public void blueOneArgsConstructorZerosTest() {
        Colour col = new Colour(0);
        Assertions.assertEquals(0, col.getBlue());
    }

    @Test
    public void redOneArgsConstructorOnesTest() {
        int value = (Colour.MAX_COMP_VALUE + 1) * (Colour.MAX_COMP_VALUE + 1) * (Colour.MAX_COMP_VALUE + 1) - 1;
        Colour col = new Colour(value);
        Assertions.assertEquals(Colour.MAX_COMP_VALUE, col.getRed());
    }

    @Test
    public void greenOneArgsConstructorOnesTest() {
        int value = (Colour.MAX_COMP_VALUE + 1) * (Colour.MAX_COMP_VALUE + 1) * (Colour.MAX_COMP_VALUE + 1) - 1;
        Colour col = new Colour(value);
        Assertions.assertEquals(Colour.MAX_COMP_VALUE, col.getRed());
    }

    @Test
    public void blueOneArgsConstructorOnesTest() {
        int value = (Colour.MAX_COMP_VALUE + 1) * (Colour.MAX_COMP_VALUE + 1) * (Colour.MAX_COMP_VALUE + 1) - 1;
        Colour col = new Colour(value);
        Assertions.assertEquals(Colour.MAX_COMP_VALUE, col.getRed());
    }

    @Test
    public void redOneArgsConstructorCommonTest() {
        Random random = new Random(1);
        int r = random.nextInt(Colour.MAX_COMP_VALUE + 1);
        int g = random.nextInt(Colour.MAX_COMP_VALUE + 1);
        int b = random.nextInt(Colour.MAX_COMP_VALUE + 1);
        int value = r + (Colour.MAX_COMP_VALUE + 1) * g + (Colour.MAX_COMP_VALUE + 1) * (Colour.MAX_COMP_VALUE + 1) * b;
        Colour col = new Colour(value);
        Assertions.assertEquals(r, col.getRed());
    }
    @Test
    public void greenOneArgsConstructorCommonTest() {
        Random random = new Random(1);
        int r = random.nextInt(Colour.MAX_COMP_VALUE + 1);
        int g = random.nextInt(Colour.MAX_COMP_VALUE + 1);
        int b = random.nextInt(Colour.MAX_COMP_VALUE + 1);
        int value = r + (Colour.MAX_COMP_VALUE + 1) * g + (Colour.MAX_COMP_VALUE + 1) * (Colour.MAX_COMP_VALUE + 1) * b;
        Colour col = new Colour(value);
        Assertions.assertEquals(g, col.getGreen());
    }

    @Test
    public void blueOneArgsConstructorCommonTest() {
        Random random = new Random(1);
        int r = random.nextInt(Colour.MAX_COMP_VALUE + 1);
        int g = random.nextInt(Colour.MAX_COMP_VALUE + 1);
        int b = random.nextInt(Colour.MAX_COMP_VALUE + 1);
        int value = r + (Colour.MAX_COMP_VALUE + 1) * g + (Colour.MAX_COMP_VALUE + 1) * (Colour.MAX_COMP_VALUE + 1) * b;
        Colour col = new Colour(value);
        Assertions.assertEquals(b, col.getBlue());
    }

    @Test
    public void allDifferEqualsTest() {
        Colour col1 = new Colour(1.0, 1.0, 1.0);
        Colour col2 = new Colour(0.5, 0.5, 0.5);
        Assertions.assertNotEquals(col1, col2);
    }

    @Test
    public void redDifferEqualsTest() {
        Colour col1 = new Colour(1.0, 1.0, 1.0);
        Colour col2 = new Colour(0.5, 1.0, 1.0);
        Assertions.assertNotEquals(col1, col2);
    }

    @Test
    public void greenDifferEqualsTest() {
        Colour col1 = new Colour(1.0, 1.0, 1.0);
        Colour col2 = new Colour(1.0, 0.5, 1.0);
        Assertions.assertNotEquals(col1, col2);
    }

    @Test
    public void blueDifferEqualsTest() {
        Colour col1 = new Colour(1.0, 1.0, 1.0);
        Colour col2 = new Colour(1.0, 1.0, 0.5);
        Assertions.assertNotEquals(col1, col2);
    }

    @Test
    public void equalEqualsTest() {
        Colour col1 = new Colour(1.0, 1.0, 1.0);
        Colour col2 = new Colour(1.0, 1.0, 1.0);
        Assertions.assertEquals(col1, col2); // assertion values equal
    }





package org.example;

import java.util.Objects;

public class Colour {


    public static final int MAX_COMP_VALUE = 255;



    private final int red;


    private final int green;

    private final int blue;


    public Colour(double rRatio, double gRatio, double bRatio) {
        // calculating and assigning integer value as a ration of 255 for each component
        this.red = Math.toIntExact(Math.round(MAX_COMP_VALUE * rRatio));
        this.green = Math.toIntExact(Math.round(MAX_COMP_VALUE * gRatio));
        this.blue = Math.toIntExact(Math.round(MAX_COMP_VALUE * bRatio));
    }

    public Colour(int value) {
        // getting 0-7 bits as int
        red = value % (MAX_COMP_VALUE + 1);
        // shifting value by 8 bits
        value /= (MAX_COMP_VALUE + 1);
        // getting 8-15 bits as int
        green = value % (MAX_COMP_VALUE + 1);
        // shifting value by 8 bits
        value /= (MAX_COMP_VALUE + 1);
        // getting 16-23 bits as int
        blue = value % (MAX_COMP_VALUE + 1);
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colour colour = (Colour) o;
        return red == colour.red && green == colour.green && blue == colour.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

}

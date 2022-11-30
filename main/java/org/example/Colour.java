package org.example;

import java.util.Objects;

public class Colour {
    /**
     * maximum value for each of RGB components
     */

    public static final int MAX_COMP_VALUE = 255;
    /**
     * value for RED component
     */


    private final int red;
    /**
     * value for GREEN component
     */

    private final int green;
    /**
     * value for BLUE component
     */
    private final int blue;

    /**
     * constructor creating color, based on 1-0 value for each colour
     * @param rRatio red component colour
     * @param gRatio green component colour
     * @param bRatio blue component colour
     */

    public Colour(double rRatio, double gRatio, double bRatio) {
        // calculating and assigning integer value as a ration of 255 for each component
        this.red = Math.toIntExact(Math.round(MAX_COMP_VALUE * rRatio));
        this.green = Math.toIntExact(Math.round(MAX_COMP_VALUE * gRatio));
        this.blue = Math.toIntExact(Math.round(MAX_COMP_VALUE * bRatio));
    }

    /**
     * constructor, creating colour from single int value, where 0-7 bits
     * are for red component
     * 8-15 are for green component
     * 16-23 are for blue component
     * @param value to create colour from
     */

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

    /**
     * getter for red component value
     * @return red component value
     */

    public int getRed() {
        return red;
    }

    /**
     * getter for green component value
     * @return green component value
     */

    public int getGreen() {
        return green;
    }

    /**
     * getter for blue component value
     * @return blue component value
     */

    public int getBlue() {
        return blue;
    }

    /**
     * overridden equals method
     * @param o object to compare with
     * @return true, iff object is equal to the current one
     */


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colour colour = (Colour) o;
        return red == colour.red && green == colour.green && blue == colour.blue;
    }

    /**
     * overridden hashcode method
     * @return colour hash value
     */

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

}

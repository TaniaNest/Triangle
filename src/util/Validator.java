package util;

public class Validator {


    public boolean getSides(String triangle) {
        try {
            Float.parseFloat(triangle);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean isSuchTriangleExist(float a, float b, float c) {
        if ((a + b) > c && (c + a) > b && (b + c) > a) {
            return true;
        } else {
            return false;
        }
    }

}

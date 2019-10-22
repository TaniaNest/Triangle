package service;

import model.Triangle;

public class Action {

    public void getArea(Triangle triangle) {
        float a = triangle.getA();
        float b = triangle.getB();
        float c = triangle.getC();
        double p = (a + b + c) / 2;
        triangle.setArea(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

}

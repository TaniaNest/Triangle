package service;

import model.Triangle;

import java.util.Collections;
import java.util.List;

public class Action {

    public void getArea(Triangle triangle) {
        float a = triangle.getA();
        float b = triangle.getB();
        float c = triangle.getC();
        double p = (a + b + c) / 2;
        triangle.setArea(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    public List<Triangle> sortTriangle(List<Triangle> triangles) {
        Collections.sort(triangles, Collections.reverseOrder());
        return triangles;
    }

}

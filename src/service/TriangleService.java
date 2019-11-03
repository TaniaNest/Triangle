package service;

import model.TriangleModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TriangleService {

    public void getArea(TriangleModel triangle) {
        float a = triangle.getA();
        float b = triangle.getB();
        float c = triangle.getC();
        double p = (a + b + c) / 2;
        triangle.setArea(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    public String[] enter(String string) {
        if (!string.isEmpty()) {
            return string.replaceAll("\\s+", "").split(",");
        } else {
            return null;
        }
    }

    public List<TriangleModel> sortTriangle(List<TriangleModel> triangles) {
        Collections.sort(triangles, Collections.reverseOrder());
        return triangles;
    }

}

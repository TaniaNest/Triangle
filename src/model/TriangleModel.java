package model;

public class TriangleModel implements Comparable<TriangleModel> {

    private float a;
    private float b;
    private float c;
    private String name;
    private double Area;

    public TriangleModel(float a, float b, float c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    public TriangleModel() {

    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    @Override
    public String toString() {
        return "[Triangle " + this.name + "]: " + String.format("%.4g%n", this.getArea());
    }


    @Override
    public int compareTo(TriangleModel o) {

        int compareQuantity = (int) ((TriangleModel) o).getArea();
        return (int) (compareQuantity - this.getArea());
    }
}

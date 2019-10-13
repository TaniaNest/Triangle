package model;

public class Triangle implements ITriangle, Comparable<Triangle>{

    private float a;
    private float b;
    private float c;
    private String name;

    public Triangle(float a, float b, float c, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = name;
    }

    public Triangle() {

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

    @Override
    public String toString() {
        return "[Triangle " + this.name + "]: " + String.format("%.4g%n", this.getArea());
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }


    @Override
    public int compareTo(Triangle o) {

        int compareQuantity = (int)((Triangle) o).getArea();
        return (int)(compareQuantity-this.getArea());
    }
}

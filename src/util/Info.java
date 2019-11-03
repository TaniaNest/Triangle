package util;

import model.TriangleModel;

import java.util.List;

public class Info {

    public void getInfo() {
        System.out.print("Input the sideOne, sideTwo, sideThree and name: ");
    }

    public void getParamTriangle() {
        System.out.println("You didn't enter all parameters");
    }

    public void getTriangleExist() {
        System.out.println("Triangle don't exist");
    }

    public void getRequest() {

        System.out.print("Do you want add new triangle: ");
    }

    public void showList(List<TriangleModel> triangles) {
        System.out.println("============= Triangles list: ===============");
        for (TriangleModel triangle : triangles) {
            System.out.println(triangle);
        }
    }

}

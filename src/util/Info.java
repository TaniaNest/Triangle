package util;

import model.Triangle;

import java.util.List;

public class Info {

    public void getInfo() {

        System.out.print("Input the side: ");
    }

    public void getRequest() {

        System.out.print("Do you want add new triangle: ");
    }

    public void showList(List<Triangle> triangles) {
        System.out.println("============= Triangles list: ===============");
        for (Triangle triangle : triangles) {
            System.out.println(triangle);
        }
    }

}

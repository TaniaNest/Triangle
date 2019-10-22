package controller;

import model.Triangle;
import service.Action;
import util.Info;
import util.Input;
import util.Instruction;
import util.Validator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {

    private Instruction instruction = new Instruction();
    private Input       input = new Input();
    private Info        info = new Info();
    private Validator   validator = new Validator();
    private Action      action = new Action();


    List<Triangle> triangles = new ArrayList<Triangle>();

    public void run() {
        createTriangle();
        repeat();
    }

    public float createSide() {
        info.getInfo();
        float side = input.getSide();
        while (!validator.isPositiveNumber(side)) {
            instruction.getInstruction();
            side = new Input().getSide();
        }
        return side;
    }

    public String createName() {
        System.out.print("Input name: ");
        String name = input.getName();
        return name;
    }
    public void createTriangle() {
        addTriangle(new Triangle(createSide(), createSide(), createSide(), createName()));
    }

    public void addTriangle(Triangle triangle) {
        action.getArea(triangle);
        triangles.add(triangle);
    }

    public void sortTriangle(List<Triangle> triangles) {
        Collections.sort(triangles, Collections.reverseOrder());
        showList(triangles);
    }


    public void showList(List<Triangle> triangles) {
        System.out.println("============= Triangles list: ===============");
        for (Triangle triangle : triangles) {
            System.out.println(triangle);
        }
    }

    public void repeat() {
        String next;
        info.getRequest();
        next = input.getAnswer();
        if (next.equals("y") || next.equals("yes")) {
            run();
        } else sortTriangle(triangles);
    }
}

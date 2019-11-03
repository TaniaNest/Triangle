package controller;

import model.TriangleModel;
import service.TriangleService;
import util.Info;
import util.Input;
import util.Instruction;
import util.Validator;

import java.util.ArrayList;
import java.util.List;

public class TriangleController {

    private Instruction instruction = new Instruction();
    private Input input = new Input();
    private Info info = new Info();
    private Validator validator = new Validator();
    private TriangleService service = new TriangleService();

    private List<TriangleModel> triangles = new ArrayList<TriangleModel>();

    public void run() {
        createTriangle(service.enter(createString()));
        repeat();
    }

    private String createString() {
        info.getInfo();
        return new Input().getString();
    }

    private String createSide(String side) {
        if (!validator.getSides(side)) {
            instruction.getInstruction();
            run();
        }
        return side;
    }


    private void createTriangle(String[] triangle) {
        float[] side = new float[3];
        if (triangle.length == 4) {
            for (int i = 0; i < triangle.length - 1; i++) {
                side[i] = Float.parseFloat((createSide(triangle[i])));
            }
            addTriangle(isTriangleExist(side[0], side[1], side[2], triangle[3]));
        } else {
            info.getParamTriangle();
            createTriangle(service.enter(createString()));
        }
    }

    private TriangleModel isTriangleExist(float sideOne, float sideTwo, float sideThree, String name) {
        if (validator.isSuchTriangleExist(sideOne, sideTwo, sideThree)) {
            return new TriangleModel(sideOne, sideTwo, sideThree, name);
        } else {
            info.getTriangleExist();
            run();
            return null;
        }
    }

    private void addTriangle(TriangleModel triangle) {
        service.getArea(triangle);
        triangles.add(triangle);
    }


    private void showList(List<TriangleModel> triangles) {
        info.showList(service.sortTriangle(triangles));
    }

    private void repeat() {
        String next;
        info.getRequest();
        next = input.getAnswer();
        if (next.equals("y") || next.equals("yes")) {
            run();
        } else showList(triangles);
    }
}

package controller;

import model.Triangle;
import util.Info;
import util.Input;
import util.Instruction;
import util.Validator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {

 Instruction instruction= new Instruction();
 Input input= new Input();
 Info info= new Info();
 Validator validator= new Validator();


    List<Triangle> triangles = new ArrayList<Triangle>();

    public void   runSide() {
        boolean flag;
        float side;
        String name=null;
        float[] arr = new float[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(info.getInfo(i));
            while (arr[i] <= 0) {
                arr[i] = input.getSide();
                while (!validator.isPositiveNumber(arr[i])) {
                    instruction.getInstruction();
                    arr[i] = input.getSide();
                }
            }
        }
        System.out.print("Input name: ");
        name=input.getName();
        addTriangle(new Triangle(arr[0],arr[1],arr[2],name));
        repeat();
    }

    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }


    public void showList() {
        System.out.println("============= Triangles list: ===============");
        for (Triangle triangle : triangles) {
            System.out.println(triangle);
        }
    }

    public void repeat(){
        String next;
        System.out.print(info.getRequest());
        next = input.getAnswer();
        if (next.equals("y") || next.equals("yes")){
            runSide();
        }
        else showList();
    }
}

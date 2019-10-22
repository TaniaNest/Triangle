package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public float getSide() {
        try {
            return scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    public String getName() {
        return scanner.next();
    }

    public String getAnswer() {
        return scanner.next();
    }


}

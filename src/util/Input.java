package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString() {
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String getAnswer() {
        scanner = new Scanner(System.in);
        return scanner.next();
    }


}

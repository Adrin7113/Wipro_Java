package module_1.section_2;

import utils.Printer;

public class Assignment_M1_S2_1 {

    public void answer_1(int number) {
        if (number > 0) {
            Printer.println("The number is positive");
        } else if (number < 0) {
            Printer.println("The number is negative");
        } else {
            Printer.println("The number is zero");
        }
    }

    public void answer_2(int numOne, int numTwo) {
        int numberOne = numOne % 10;
        int numberTwo = numTwo % 10;

        if (numberOne == numberTwo) {
            Printer.println("True");
        }
    }

}

package module_1.section_2;

import utils.Printer;

import java.util.Arrays;

public class Assignment_M1_S2_3 {
    public void answer(String[] args) {
        if (args.length == 0) {
            Printer.println("No values");
        } else {
            Printer.println("The args are: " + Arrays.toString(args));
        }
    }
}

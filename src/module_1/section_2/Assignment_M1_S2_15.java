package module_1.section_2;

import utils.Printer;

public class Assignment_M1_S2_15 {
    public void answer(int limit){
        for (int i = 1; i <= limit; i++) {
            for (int j = 1; j <= i; j++) {
                Printer.print("*\t");
            }
            Printer.println("");
        }
    }
}

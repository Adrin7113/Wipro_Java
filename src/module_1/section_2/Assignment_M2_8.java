package module_1.section_2;

import utils.Printer;

public class Assignment_M2_8 {
    public void answer(char a) {

        switch (a) {
            case 'R':
                Printer.println("R->Red");
                break;
            case 'B':
                Printer.println("B->Blue");
                break;
            case 'G':
                Printer.println("G->Green");
                break;
            case 'O':
                Printer.println("O->Orange");
                break;
            case 'Y':
                Printer.println("Y->Yellow");
                break;
            case 'W':
                Printer.println("W->White");
                break;
            default:
                Printer.println("Invalid Code");
                break;
        }
    }
}

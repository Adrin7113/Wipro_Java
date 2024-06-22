package module_1.section_2;

import utils.Printer;

public class Assignment_M2_5 {
    public void answer(char a){
        if (Character.isLetter(a)){
            Printer.println("This is an alphabet");
        }else if (Character.isDigit(a)){
            Printer.println("This is a digit");
        }else {
            Printer.println("This is a special character");
        }
    }
}
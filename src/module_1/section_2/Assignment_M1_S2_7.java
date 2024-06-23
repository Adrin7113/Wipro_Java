package module_1.section_2;

import utils.Printer;

public class Assignment_M1_S2_7 {
    public void answer(char a){
        if (Character.isLowerCase(a)){
            Printer.println(a + "->"+Character.toUpperCase(a));
        }else if (Character.isUpperCase(a)){
            Printer.println(a + "->"+Character.toLowerCase(a));
        }
    }
}

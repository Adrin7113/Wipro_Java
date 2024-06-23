package module_1.section_2;

import utils.Printer;

import java.util.Objects;

public class Assignment_M1_S2_6 {
    public void answer(String gender, int age){
        if (Objects.equals(gender, "Male")){
            if (age >= 1 && age <= 58){
                Printer.println("Interest Rate: 8.4%" );
            }else if (age >= 59 && age <= 100){
                Printer.println("Interest Rate: 10.5%");
            }else{
                Printer.println("You can't be that old.");
            }
        } else if (Objects.equals(gender, "Female")) {
            if (age >= 1 && age <= 58){
                Printer.println("Interest Rate: 8.2%" );
            }else if (age >= 59 && age <= 100){
                Printer.println("Interest Rate: 9.2%");
            }else{
                Printer.println("You can't be that old.");
            }
        }else{
            Printer.println("Have not implemented that yet :)");
        }
    }
}

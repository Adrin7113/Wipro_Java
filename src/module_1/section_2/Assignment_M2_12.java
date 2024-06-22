package module_1.section_2;

import utils.Printer;

public class Assignment_M2_12 {
    public void answer(int num){
        if (num <= 1){
            Printer.println("This is not a prime number");
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0){
                Printer.println("This is not a prime number");
                return;
            }
        }
        Printer.println("This is a prime number");
    }
}

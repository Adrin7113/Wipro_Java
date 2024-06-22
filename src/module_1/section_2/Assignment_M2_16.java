package module_1.section_2;

import utils.Printer;

public class Assignment_M2_16 {
    public void answer(int num){
        int tempNum = num;
        StringBuilder finalAnswer = new StringBuilder();
        while(tempNum > 0){
            int i = tempNum % 10;
            tempNum = tempNum / 10;
            finalAnswer.append(String.valueOf(i));
        }
        Printer.println(String.valueOf(finalAnswer));
    }
}

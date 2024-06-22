package module_1.section_2;

import utils.Printer;

public class Assignment_M2_14 {
    public void answer(int num){
        int tempNum = num;
        int sum = 0;
        while(tempNum > 0){
            int i = tempNum % 10;
            sum += i;
            tempNum = tempNum / 10;
        }
        Printer.println(String.format("The sum of digits is: %d", sum));
    }
}

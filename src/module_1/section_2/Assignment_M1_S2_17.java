package module_1.section_2;

import utils.Printer;

public class Assignment_M1_S2_17 {
    public void answer(int num){
        String parsedNum = String.valueOf(num);
        int length = parsedNum.length();
        for (int i=0, j = length - 1; i < length / 2; i++, j--){
            if(parsedNum.charAt(i) != parsedNum.charAt(j)){
                Printer.println("Not a palindrome");
                return;
            }
        }
        Printer.println("It is a palindrome");
    }
}

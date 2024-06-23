package module_1.section_3;

import utils.Printer;

public class Assignment_M1_S3_3 {
    public void answer(int[] arr, int num){
        int length = arr.length;
        for (int j : arr) {
            if (j == num) {
                Printer.println("Number Found!");
                return;
            }
        }
        Printer.println("Number Not Found!");
    }
}

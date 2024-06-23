package module_1.section_3;

import utils.Printer;

public class Assignment_M1_S3_2 {
    public void answer(int[] arr){
        int min = arr[0], max = arr[0], length = arr.length;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
        }
        Printer.println("Min: "+min+"\nMax: "+max);
    }
}

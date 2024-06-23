package module_1.section_3;

import utils.Printer;

public class Assignment_M1_S3_1 {
    public void answer(int[] arr){
        int sum = 0, avg = 0, length = arr.length;
        for (int j : arr) {
            sum += j;
        }
        avg = sum / length;
        Printer.println("Sum: "+sum+"\nAvg: "+avg);
    }
}

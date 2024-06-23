package module_1.section_3;

import utils.Printer;

import java.util.Arrays;

public class Assignment_M1_S3_8 {
    public void answer(Integer[] arr){
        int sum=0;
        int length = arr.length;
        int locSix = findIndex(arr, 6);
        int locSeven = findIndex(arr, 7);

        if(locSix < locSeven && locSix != -1 && locSeven != -1){
            for (int i = 0; i < locSix; i++) {
                sum += arr[i];
            }
            for (int i = locSeven + 1; i < length; i++) {
                sum += arr[i];
            }
        }
        else {
            for (int num: arr){
                sum += num;
            }
        }
        Printer.println("Sum: " + sum);
    }
    public int findIndex(Integer[] arr, Integer target){
        return Arrays.asList(arr).indexOf(target);
    }
}

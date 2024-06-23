package module_1.section_3;

import utils.Printer;

import java.util.ArrayList;

public class Assignment_M1_S3_9 {
    public void answer(Integer[] arr){
        int arrLength = arr.length, i;
        ArrayList<Integer> ans = new ArrayList<>();
        for (i = 0; i < arrLength; i++) {
            if(arr[i] != 10){
                ans.add(arr[i]);
            }
        }
        int ansLength = ans.size();
        while (ansLength < arrLength){
            ans.add(0);
            ansLength++;
        }
        Printer.println(ans.toString());
    }
}

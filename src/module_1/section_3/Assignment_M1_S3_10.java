package module_1.section_3;

import utils.Printer;

import java.util.ArrayList;

public class Assignment_M1_S3_10 {
    public void answer(Integer[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int num: arr) {
            if (num % 2 == 0){
                ans.add(num);
            }
        }
        for (int num: arr) {
            if (num % 2 != 0){
                ans.add(num);
            }
        }
        Printer.println(ans.toString());
    }
}

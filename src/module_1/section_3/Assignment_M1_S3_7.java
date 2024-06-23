package module_1.section_3;

import utils.Printer;

import java.util.Arrays;
import java.util.HashSet;

public class Assignment_M1_S3_7 {
    public void answer(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int num: arr) {
            set.add(num);
        }

        Integer[] uniqueArr = set.toArray(new Integer[0]);
        Printer.println(Arrays.toString(uniqueArr));
    }
}

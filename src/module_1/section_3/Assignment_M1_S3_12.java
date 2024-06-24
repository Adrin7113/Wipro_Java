package module_1.section_3;

import utils.Printer;

import java.util.ArrayList;

public class Assignment_M1_S3_12 {
    public void answer(Integer[] arrOne, Integer[] arrTwo){
        int lenOne = arrOne.length, lenTwo = arrTwo.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arrOne[(int) Math.floor((double) lenOne /2)]);
        ans.add(arrTwo[(int) Math.floor((double) lenTwo /2)]); // The double conversion is mostly for the linter. Does not matter as length will be an integer.
        Printer.println(ans.toString());
    }
}

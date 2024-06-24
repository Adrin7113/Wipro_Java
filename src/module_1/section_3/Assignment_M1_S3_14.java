package module_1.section_3;

import utils.Printer;

public class Assignment_M1_S3_14 {
    public void answer(String[] args) {
        Integer[][] arr = new Integer[3][3];
        make2D(args, arr);
        findBiggest(arr);
    }

    public void make2D(String[] args, Integer[][] arr) {
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[index]);
                index++;
            }
        }
    }

    public void findBiggest(Integer[][] arr) {
        int max = arr[0][0];
        for (Integer[] integers : arr) {
            for (Integer integer : integers) {
                if (integer > max) {
                    max = integer;
                }
            }
        }
        Printer.println("Max Value: " + max);
    }
}

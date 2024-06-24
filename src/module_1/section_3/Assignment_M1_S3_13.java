package module_1.section_3;

public class Assignment_M1_S3_13 {
    public void answer(Integer[][] arr){
        print2D(arr);

        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;
            while(start < end){
                Integer temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            Integer[] temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        print2D(arr);
    }

    public void print2D(Integer[][] arr){
        System.out.println("----------------");
        for (Integer[] row : arr) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }
}

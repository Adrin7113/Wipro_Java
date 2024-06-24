package module_1.section_3;

public class Assignment_M1_S3_11 {
    public boolean answer(Integer[] arr ){
        for (int num: arr){
            if(num != 4 && num != 1){
                return false;
            }
        }
        return true;
    }
}

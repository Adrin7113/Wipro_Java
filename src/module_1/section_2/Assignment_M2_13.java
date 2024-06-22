package module_1.section_2;

import utils.Printer;

public class Assignment_M2_13 {
    public void answer(){
        for (int i = 10; i < 100; i++) {
            if(isPrime(i)){
                Printer.println(String.valueOf(i));
            }
        }
    }
    
    public boolean isPrime(int num){
        if (num <= 1){
            return true;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}

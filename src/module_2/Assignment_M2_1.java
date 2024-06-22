package module_2;

public class Assignment_M2_1 {

    public void answer_1(int number){
        if (number > 0){
           System.out.println("The number is positive");
        }else if(number < 0){
            System.out.println("The number is negative");
        }else{
            System.out.println("The number is zero");
        }
    }

    public void answer_2(int numOne, int numTwo){
        int numberOne = numOne % 10;
        int numberTwo = numTwo % 10;

        if (numberOne == numberTwo){
            System.out.println("True");
        }
    }

}

package ArrayBasedQuestions;

import java.util.ArrayList;

public class SeparatePositiveNegative {
    public static void main(String[] args){
        int[] arr = {10, -5, 7, -3, 8, -2};

        ArrayList<Integer> positiveArr = new ArrayList<>();
        ArrayList<Integer> negativeArr = new ArrayList<>();

        for(int num: arr){
            if(num > 0){
                positiveArr.add(num);
            }
            else if(num < 0){
                negativeArr.add(num);
            }
            else{
                System.out.println("This doesn't come in the negative or positive part");
            }
        }
        System.out.println(positiveArr);
        System.out.println(negativeArr);
    }
}

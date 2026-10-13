package ArrayBasedQuestions;

import java.util.Arrays;

public class CheckTwoArraysEqauls {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};
        boolean isEqual = true;

        if(arr1.length != arr2.length){
            isEqual = false;
        }
        else{
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    isEqual = false;
                    break;
                }
            }
        }
        if(isEqual){
            System.out.println("Both of the Arrays are equal");
        }
        else{
            System.out.println("Both of the Arrays are not equal");
        }
    }
}

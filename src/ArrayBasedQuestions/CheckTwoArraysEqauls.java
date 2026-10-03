package ArrayBasedQuestions;

public class CheckTwoArraysEqauls {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};
        boolean isEqual = false;
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    isEqual = true;
                }
            }
        }
        if(isEqual){
            System.out.println("equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}

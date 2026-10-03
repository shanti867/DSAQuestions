package ArrayBasedQuestions;

import java.util.ArrayList;

public class RemoveDuplicateElements {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 4, 3};

        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            boolean found = false;
            for(int j = 0; j < newArr.size(); j++){
                if(arr[i] == newArr.get(j)){
                    found = true;
                    break;
                }
            }
            if(!found){
                newArr.add(arr[i]);
            }
        }
        System.out.println(newArr);
    }
}

package ArrayBasedQuestions;

public class LargestDifference {
    public static void main(String[] args){
        int[] arr = {10, 3, 8, 20, 5};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The biggest Difference " + (max  - min));
    }
}

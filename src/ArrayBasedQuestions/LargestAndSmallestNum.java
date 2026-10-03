package ArrayBasedQuestions;

public class LargestAndSmallestNum {
    public static void main(String[] args){
        int[] arr = {10,50,20, 80, 30};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The maximum value is " + max);
        System.out.println("The minimum value is " + min);
    }
}

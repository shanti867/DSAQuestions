package ArrayBasedQuestions;

public class SecondSmallestNumber {
    public static void main(String[] args){
        int[] arr = {10, 5, 20, 8, 3};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            }
            else if(arr[i] < secondMin && arr[i] != secondMin){
               secondMin = arr[i];
            }
        }
        System.out.println("The second smallest number is " + secondMin);
    }
}
